package com.ruoyi.project.jacoco.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.jacoco.mapper.TbProjectMapper;
import com.ruoyi.project.jacoco.domain.TbProject;
import com.ruoyi.project.jacoco.service.ITbProjectService;

/**
 * 覆盖率项目Service业务层处理
 * 
 * @author wanghuiyong
 * @date 2020-03-02
 */
@Service
public class TbProjectServiceImpl implements ITbProjectService 
{
    @Autowired
    private TbProjectMapper tbProjectMapper;

    /**
     * 查询覆盖率项目
     * 
     * @param id 覆盖率项目ID
     * @return 覆盖率项目
     */
    @Override
    public TbProject selectTbProjectById(Long id)
    {
        return tbProjectMapper.selectTbProjectById(id);
    }

    /**
     * 查询覆盖率项目列表
     * 
     * @param tbProject 覆盖率项目
     * @return 覆盖率项目
     */
    @Override
    public List<TbProject> selectTbProjectList(TbProject tbProject)
    {
        return tbProjectMapper.selectTbProjectList(tbProject);
    }

    /**
     * 新增覆盖率项目
     * 
     * @param tbProject 覆盖率项目
     * @return 结果
     */
    @Override
    public int insertTbProject(TbProject tbProject)
    {
        return tbProjectMapper.insertTbProject(tbProject);
    }

    /**
     * 修改覆盖率项目
     * 
     * @param tbProject 覆盖率项目
     * @return 结果
     */
    @Override
    public int updateTbProject(TbProject tbProject)
    {
        return tbProjectMapper.updateTbProject(tbProject);
    }

    /**
     * 批量删除覆盖率项目
     * 
     * @param ids 需要删除的覆盖率项目ID
     * @return 结果
     */
    @Override
    public int deleteTbProjectByIds(Long[] ids)
    {
        return tbProjectMapper.deleteTbProjectByIds(ids);
    }

    /**
     * 删除覆盖率项目信息
     * 
     * @param id 覆盖率项目ID
     * @return 结果
     */
    @Override
    public int deleteTbProjectById(Long id)
    {
        return tbProjectMapper.deleteTbProjectById(id);
    }
}
