package com.ruoyi.project.jacoco.mapper;

import java.util.List;
import com.ruoyi.project.jacoco.domain.Executerecords;

/**
 * 覆盖率拉取记录Mapper接口
 * 
 * @author ruoyi
 * @date 2020-04-20
 */
public interface ExecuterecordsMapper 
{
    /**
     * 查询覆盖率拉取记录
     * 
     * @param id 覆盖率拉取记录ID
     * @return 覆盖率拉取记录
     */
    public Executerecords selectExecuterecordsById(Long id);

    /**
     * 查询覆盖率拉取记录列表
     * 
     * @param executerecords 覆盖率拉取记录
     * @return 覆盖率拉取记录集合
     */
    public List<Executerecords> selectExecuterecordsList(Executerecords executerecords);

    /**
     * 新增覆盖率拉取记录
     * 
     * @param executerecords 覆盖率拉取记录
     * @return 结果
     */
    public int insertExecuterecords(Executerecords executerecords);

    /**
     * 修改覆盖率拉取记录
     * 
     * @param executerecords 覆盖率拉取记录
     * @return 结果
     */
    public int updateExecuterecords(Executerecords executerecords);

    /**
     * 删除覆盖率拉取记录
     * 
     * @param id 覆盖率拉取记录ID
     * @return 结果
     */
    public int deleteExecuterecordsById(Long id);

    /**
     * 批量删除覆盖率拉取记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteExecuterecordsByIds(Long[] ids);
}
