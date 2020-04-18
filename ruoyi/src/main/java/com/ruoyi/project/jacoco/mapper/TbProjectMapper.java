package com.ruoyi.project.jacoco.mapper;

import com.ruoyi.project.jacoco.domain.TbProject;
import java.util.List;

/**
 * 覆盖率项目Mapper接口
 * 
 * @author wanghuiyong
 * @date 2020-03-02
 */
public interface TbProjectMapper 
{
    /**
     * 查询覆盖率项目
     * 
     * @param id 覆盖率项目ID
     * @return 覆盖率项目
     */
    public TbProject selectTbProjectById(Long id);

    /**
     * 查询覆盖率项目列表
     * 
     * @param tbProject 覆盖率项目
     * @return 覆盖率项目集合
     */
    public List<TbProject> selectTbProjectList(TbProject tbProject);

    /**
     * 新增覆盖率项目
     * 
     * @param tbProject 覆盖率项目
     * @return 结果
     */
    public int insertTbProject(TbProject tbProject);

    /**
     * 修改覆盖率项目
     * 
     * @param tbProject 覆盖率项目
     * @return 结果
     */
    public int updateTbProject(TbProject tbProject);

    /**
     * 删除覆盖率项目
     * 
     * @param id 覆盖率项目ID
     * @return 结果
     */
    public int deleteTbProjectById(Long id);

    /**
     * 批量删除覆盖率项目
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbProjectByIds(Long[] ids);
}
