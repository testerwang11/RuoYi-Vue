package com.ruoyi.project.jacoco.service;

import java.util.List;
import com.ruoyi.project.jacoco.domain.Project;

/**
 * jacoco项目Service接口
 * 
 * @author ruoyi
 * @date 2020-04-19
 */
public interface IProjectService 
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
     * 批量删除jacoco项目
     * 
     * @param ids 需要删除的jacoco项目ID
     * @return 结果
     */
    public int deleteProjectByIds(Long[] ids);

    /**
     * 删除jacoco项目信息
     * 
     * @param id jacoco项目ID
     * @return 结果
     */
    public int deleteProjectById(Long id);

    public void run();
}
