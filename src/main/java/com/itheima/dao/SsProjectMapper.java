package com.itheima.dao;

import com.itheima.pojo.ProjectInfo;
import com.itheima.pojo.SsPageProject;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Ss project mapper
 */
@Repository
public interface SsProjectMapper {
    /**
     * Find all list
     *
     * @param page page
     * @return the list
     */
    public List<ProjectInfo> findAll(SsPageProject page);

    /**
     * Find count long
     *
     * @return the long
     */
    public long findCount();

    public ProjectInfo findAllOne(String projectName);

    public List<ProjectInfo> findAlls();

}
