package com.ruoyi.project.jacoco.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.jacoco.mapper.ProjectMapper;
import com.ruoyi.project.jacoco.domain.Project;
import com.ruoyi.project.jacoco.service.IProjectService;

/**
 * jacoco项目Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-04-19
 */
@Service
public class ProjectServiceImpl implements IProjectService 
{
    @Autowired
    private ProjectMapper projectMapper;

    /**
     * 查询jacoco项目
     * 
     * @param id jacoco项目ID
     * @return jacoco项目
     */
    @Override
    public Project selectProjectById(Long id)
    {
        return projectMapper.selectProjectById(id);
    }

    /**
     * 查询jacoco项目列表
     * 
     * @param project jacoco项目
     * @return jacoco项目
     */
    @Override
    public List<Project> selectProjectList(Project project)
    {
        return projectMapper.selectProjectList(project);
    }

    /**
     * 新增jacoco项目
     * 
     * @param project jacoco项目
     * @return 结果
     */
    @Override
    public int insertProject(Project project)
    {
        return projectMapper.insertProject(project);
    }

    /**
     * 修改jacoco项目
     * 
     * @param project jacoco项目
     * @return 结果
     */
    @Override
    public int updateProject(Project project)
    {
        return projectMapper.updateProject(project);
    }

    /**
     * 批量删除jacoco项目
     * 
     * @param ids 需要删除的jacoco项目ID
     * @return 结果
     */
    @Override
    public int deleteProjectByIds(Long[] ids)
    {
        return projectMapper.deleteProjectByIds(ids);
    }

    /**
     * 删除jacoco项目信息
     * 
     * @param id jacoco项目ID
     * @return 结果
     */
    @Override
    public int deleteProjectById(Long id)
    {
        return projectMapper.deleteProjectById(id);
    }

    @Override
    public void run() {

    }
}
