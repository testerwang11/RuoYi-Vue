package com.ruoyi.project.jacoco.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.jacoco.mapper.TbExecuterecordsMapper;
import com.ruoyi.project.jacoco.domain.TbExecuterecords;
import com.ruoyi.project.jacoco.service.ITbExecuterecordsService;

/**
 * 覆盖率拉取记录Service业务层处理
 * 
 * @author wanghuiyong
 * @date 2020-03-02
 */
@Service
public class TbExecuterecordsServiceImpl implements ITbExecuterecordsService 
{
    @Autowired
    private TbExecuterecordsMapper tbExecuterecordsMapper;

    /**
     * 查询覆盖率拉取记录
     * 
     * @param id 覆盖率拉取记录ID
     * @return 覆盖率拉取记录
     */
    @Override
    public TbExecuterecords selectTbExecuterecordsById(Long id)
    {
        return tbExecuterecordsMapper.selectTbExecuterecordsById(id);
    }

    /**
     * 查询覆盖率拉取记录列表
     * 
     * @param tbExecuterecords 覆盖率拉取记录
     * @return 覆盖率拉取记录
     */
    @Override
    public List<TbExecuterecords> selectTbExecuterecordsList(TbExecuterecords tbExecuterecords)
    {
        return tbExecuterecordsMapper.selectTbExecuterecordsList(tbExecuterecords);
    }

    /**
     * 新增覆盖率拉取记录
     * 
     * @param tbExecuterecords 覆盖率拉取记录
     * @return 结果
     */
    @Override
    public int insertTbExecuterecords(TbExecuterecords tbExecuterecords)
    {
        return tbExecuterecordsMapper.insertTbExecuterecords(tbExecuterecords);
    }

    /**
     * 修改覆盖率拉取记录
     * 
     * @param tbExecuterecords 覆盖率拉取记录
     * @return 结果
     */
    @Override
    public int updateTbExecuterecords(TbExecuterecords tbExecuterecords)
    {
        return tbExecuterecordsMapper.updateTbExecuterecords(tbExecuterecords);
    }

    /**
     * 批量删除覆盖率拉取记录
     * 
     * @param ids 需要删除的覆盖率拉取记录ID
     * @return 结果
     */
    @Override
    public int deleteTbExecuterecordsByIds(Long[] ids)
    {
        return tbExecuterecordsMapper.deleteTbExecuterecordsByIds(ids);
    }

    /**
     * 删除覆盖率拉取记录信息
     * 
     * @param id 覆盖率拉取记录ID
     * @return 结果
     */
    @Override
    public int deleteTbExecuterecordsById(Long id)
    {
        return tbExecuterecordsMapper.deleteTbExecuterecordsById(id);
    }
}
