package com.ruoyi.project.jacoco.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.jacoco.mapper.ExecuterecordsMapper;
import com.ruoyi.project.jacoco.domain.Executerecords;
import com.ruoyi.project.jacoco.service.IExecuterecordsService;

/**
 * 覆盖率拉取记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-04-20
 */
@Service
public class ExecuterecordsServiceImpl implements IExecuterecordsService 
{
    @Autowired
    private ExecuterecordsMapper executerecordsMapper;

    /**
     * 查询覆盖率拉取记录
     * 
     * @param id 覆盖率拉取记录ID
     * @return 覆盖率拉取记录
     */
    @Override
    public Executerecords selectExecuterecordsById(Long id)
    {
        return executerecordsMapper.selectExecuterecordsById(id);
    }

    /**
     * 查询覆盖率拉取记录列表
     * 
     * @param executerecords 覆盖率拉取记录
     * @return 覆盖率拉取记录
     */
    @Override
    public List<Executerecords> selectExecuterecordsList(Executerecords executerecords)
    {
        return executerecordsMapper.selectExecuterecordsList(executerecords);
    }

    /**
     * 新增覆盖率拉取记录
     * 
     * @param executerecords 覆盖率拉取记录
     * @return 结果
     */
    @Override
    public int insertExecuterecords(Executerecords executerecords)
    {
        return executerecordsMapper.insertExecuterecords(executerecords);
    }

    /**
     * 修改覆盖率拉取记录
     * 
     * @param executerecords 覆盖率拉取记录
     * @return 结果
     */
    @Override
    public int updateExecuterecords(Executerecords executerecords)
    {
        return executerecordsMapper.updateExecuterecords(executerecords);
    }

    /**
     * 批量删除覆盖率拉取记录
     * 
     * @param ids 需要删除的覆盖率拉取记录ID
     * @return 结果
     */
    @Override
    public int deleteExecuterecordsByIds(Long[] ids)
    {
        return executerecordsMapper.deleteExecuterecordsByIds(ids);
    }

    /**
     * 删除覆盖率拉取记录信息
     * 
     * @param id 覆盖率拉取记录ID
     * @return 结果
     */
    @Override
    public int deleteExecuterecordsById(Long id)
    {
        return executerecordsMapper.deleteExecuterecordsById(id);
    }
}
