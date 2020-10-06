var app=new Vue({
    el:"#app",
    data:{
        tableData:[],
        currentPage:'1',
        pagesize:'5',
        total:'0',
        loading:true,
        tpi:{
            projectname:'',
            buildcompany:'',
            creator:'',
            bidder:'',
            ptype:{},
            pretenderdate:'',
            enddate:'',
            approvestatus:''
        },
        ptype:[]
    },
    methods:{
        showtable(){
            var _this=this
            var state=(this.currentPage-1)*this.pagesize
            //alert(this.tpi.pretenderdate)
            axios.get('tpi/selectAll',{
                params: {
                    state:state,
                    pagesize:_this.pagesize,
                    projectname:_this.tpi.projectname,
                    buildcompany:_this.tpi.buildcompany,
                    creator:_this.tpi.creator,
                    bidder:_this.tpi.bidder,
                    projecttype:_this.tpi.ptype.projecttype,
                    pretenderdate:_this.tpi.pretenderdate,
                    enddate:_this.tpi.enddate,
                    approvestatus:_this.tpi.approvestatus
                }
            })
                .then(function (response) {
                    console.log(response);
                    _this.tableData=response.data.tender
                    _this.total=response.data.count
                    _this.loading=false
                    _this.tpi.projectname=''
                    _this.tpi.buildcompany=''
                    _this.tpi.creator=''
                    _this.tpi.bidder=''
                    _this.tpi.pretenderdate=''
                    _this.tpi.enddate=''

                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        tableRowClassName({row, rowIndex}) {
            if (rowIndex === 1) {
                return 'warning-row';
            } else if (rowIndex === 3) {
                return 'success-row';
            }
            return '';
        },
        handleSizeChange(val) {
            console.log(`每页 ${val} 条`);
            this.pagesize=val
            this.showtable()
        },
        handleCurrentChange(val) {
            console.log(`当前页: ${val}`);
            this.currentPage=val
            this.showtable()
        },
        rowclick(row, column, event){
            // alert(row)
            this.$confirm('你是要查看'+row.projectname+'的流程吗？', '提示', {
                confirmButtonText: '确定',
                cancelButtonText: '取消',
                type: 'warning'
            }).then(() => {
                window.location.href="http://localhost:8080/bidding_jzy_process?id="+row.id
                // this.$message({
                //     type: 'success',
                //     message: '跳转成功!',
                // });
            }).catch(() => {
                this.$message({
                    type: 'info',
                    message: '已取消跳转'
                });
            });

        },

        ptypes(){
            var _this=this
            // 为给定 ID 的 user 创建请求
            axios.get('tp/selectAll')
                .then(function (response) {
                    console.log(response);
                    _this.ptype=response.data
                })
                .catch(function (error) {
                    console.log(error);
                });
        },

        //导出表格
        exportDate() {
            console.log("导出xls数据")
            var vm = this;
            var aoa = [];
            aoa.push(["项目编号","项目名称","项目地址","项目状态","录入人","预计时间","投标负责人","建设单位","预计合同金额","联系人","联系电话"]);
            vm.tableData.forEach((item) => {
                aoa.push([item.id, item.projectname,item.projectaddress,item.projectpname,item.creator,item.pretenderdate,item.bidder,item.buildcompany,item.pretenderamount,item.contactor,item.contactphone])
            });
            var sheet = XLSX.utils.aoa_to_sheet(aoa);
            this.openDownloadDialog(this.sheet2blob(sheet), "导出.xlsx")
        },
        sheet2blob(sheet, sheetName) {
            sheetName = sheetName || 'sheet1';
            var workbook = {
                SheetNames: [sheetName],
                Sheets: {}
            };
            workbook.Sheets[sheetName] = sheet;
            //生产excel的配置项
            var wopts = {
                bookType: 'xlsx',//要生成的文件类型
                bookSST: false,//是否生成Shared String Table,官方解释是，如果开启生成速度下降，但在低版本IOS设备上有更好的兼容性
                type: 'binary'
            };
            var wbout = XLSX.write(workbook, wopts);
            var blob = new Blob([s2ab(wbout)], {type: "application/octet-stream"})

            //字符串转ArrayBuffer
            function s2ab(s) {
                var buf = new ArrayBuffer(s.length);
                var view = new Uint8Array(buf);
                for (var i = 0; i != s.length; ++i) view[i] = s.charCodeAt(i) & 0xFF;
                return buf;
            }

            return blob
        },
        openDownloadDialog(url, saveName) {
            if (typeof url == "object" && url instanceof Blob) {
                url = URL.createObjectURL(url)//创建blob地址
            }
            var aLink = document.createElement("a");
            aLink.href = url;
            aLink.download = saveName || "";
            var event;
            if (window.MouseEvent) event = new MouseEvent("click");
            else {
                event = document.createEvent("MouseEvents");
                event.initMouseEvent(
                    "click",
                    true,
                    false,
                    window,
                    0,
                    0,
                    0,
                    0,
                    0,
                    false,
                    false,
                    false,
                    false,
                    0,
                    null
                );
            }
            aLink.dispatchEvent(event)
        },


    },
    created(){
        this.showtable()
        this.ptypes()
    }
})