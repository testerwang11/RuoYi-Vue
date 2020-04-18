package com.ruoyi.project.jacoco.mapper;

import com.ruoyi.project.jacoco.domain.TbExecuterecords;
import java.util.List;

/**
 * 覆盖率拉取记录Mapper接口
 * 
 * @author wanghuiyong
 * @date 2020-03-02
 */
public interface TbExecuterecordsMapper 
{
    /**
     * 查询覆盖率拉取记录
     * 
     * @param id 覆盖率拉取记录ID
     * @return 覆盖率拉取记录
     */
    public TbExecuterecords selectTbExecuterecordsById(Long id);

    /**
     * 查询覆盖率拉取记录列表
     * 
     * @param tbExecuterecords 覆盖率拉取记录
     * @return 覆盖率拉取记录集合
     */
    public List<TbExecuterecords> selectTbExecuterecordsList(TbExecuterecords tbExecuterecords);

    /**
     * 新增覆盖率拉取记录
     * 
     * @param tbExecuterecords 覆盖率拉取记录
     * @return 结果
     */
    public int insertTbExecuterecords(TbExecuterecords tbExecuterecords);

    /**
     * 修改覆盖率拉取记录
     * 
     * @param tbExecuterecords 覆盖率拉取记录
     * @return 结果
     */
    public int updateTbExecuterecords(TbExecuterecords tbExecuterecords);

    /**
     * 删除覆盖率拉取记录
     * 
     * @param id 覆盖率拉取记录ID
     * @return 结果
     */
    public int deleteTbExecuterecordsById(Long id);

    /**
     * 批量删除覆盖率拉取记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbExecuterecordsByIds(Long[] ids);
}
