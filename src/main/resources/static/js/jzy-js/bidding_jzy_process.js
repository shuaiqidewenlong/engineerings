var app=new Vue({
    el:"#app",
    data:{
        projectname:'',
        projectintrduce:'',
        projectaddress:'',
        creator:'',
        pretenderdate:'',
        projectpname:'',
        bidder:'',
        pretenderdate:'',
        pretenderfee:'',
        pretenderamount:'',
        pretenderamounts:'',
        buildcompany:'',
        contactor:'',
        contactphone:'',
        designcompany:'',
        supervidercompany:'',
        comment:'',
        projectnaturn:''
    },
    methods:{
        item(){
            window.location.href="http://localhost:8080/bidding_jzy_item"
        },
        showtable(){
            var vm=this
            let tpid = document.getElementById("tpid").value;
            console.log(tpid)
            // 上面的请求也可以这样做
            axios.get('tpi/selectByid?id='+tpid)
                .then(function (response) {
                    console.log(response);
                    //项目名称
                    vm.projectname=response.data.projectname
                    //项目简介
                    vm.projectintrduce=response.data.projectintrduce
                    //项目地址
                    vm.projectaddress=response.data.projectaddress
                    //项目类型
                    vm.projectpname=response.data.projectpname
                    //录入人
                    vm.creator=response.data.creator
                    //投标负责人
                    vm.bidder=response.data.bidder
                    //    日期
                    vm.pretenderdate=response.data.pretenderdate
                    // //    预计投标日期
                    //     vm.pretenderdate=response.data.pretenderdate
                    //    预计投标费
                    vm.pretenderfee=response.data.pretenderfee
                    //    预计合同金额
                    vm.pretenderamount=response.data.pretenderamount
                    vm.pretenderamounts=response.data.pretenderamounts
                    //    建设单位
                    vm.buildcompany=response.data.buildcompany
                    //    联系人
                    vm.contactor=response.data.contactor
                    //    联系电话
                    vm.contactphone=response.data.contactphone
                    //    设计单位
                    vm.designcompany=response.data.designcompany
                    //    监理单位
                    vm.supervidercompany=response.data.supervidercompany
                    //    备注
                    vm.comment=response.data.comment
                    //    项目性质
                    vm.projectnaturn=response.data.projectnaturn


                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    },
    created(){
        var tpid=document.getElementById("tpid").value
        document.getElementById("tpiid").innerHTML=tpid
        this.showtable()
    }
})