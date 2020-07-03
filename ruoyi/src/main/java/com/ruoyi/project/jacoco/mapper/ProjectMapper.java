package com.ruoyi.project.jacoco.mapper;

import java.util.List;
import com.ruoyi.project.jacoco.domain.Project;

/**
 * jacoco项目Mapper接口
 * 
 * @author ruoyi
 * @date 2020-04-19
 */
public interface ProjectMapper 
{
    /**
     * 查询jacoco项目
     * 
     * @param id jacoco项目ID
     * @return jacoco项目
     */
    public Project selectProjectById(Long id);

    /**
     * 查询jacoco项目列表
     * 
     * @param project jacoco项目
     * @return jacoco项目集合
     */
    public List<Project> selectProjectList(Project project);

    /**
     * 新增jacoco项目
     * 
     * @param project jacoco项目
     * @return 结果
     */
    public int insertProject(Project project);

    /**
     * 修改jacoco项目
     * 
     * @param project jacoco项目
     * @return 结果
     */
    public int updateProject(Project project);

    /**
     * 删除jacoco项目
     * 
     * @param id jacoco项目ID
     * @return 结果
     */
    public int deleteProjectById(Long id);

    /**
     * 批量删除jacoco项目
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteProjectByIds(Long[] ids);
}
