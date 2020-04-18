package com.ruoyi.project.monitor.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.monitor.mapper.JobMapper;
import com.ruoyi.project.monitor.domain.Job;
import com.ruoyi.project.monitor.service.IJobService;

/**
 * 定时任务调度Service业务层处理
 * 
 * @author wanghuiyong
 * @date 2020-03-02
 */
@Service
public class JobServiceImpl implements IJobService 
{
    @Autowired
    private JobMapper jobMapper;

    /**
     * 查询定时任务调度
     * 
     * @param jobId 定时任务调度ID
     * @return 定时任务调度
     */
    @Override
    public Job selectJobById(Long jobId)
    {
        return jobMapper.selectJobById(jobId);
    }

    /**
     * 查询定时任务调度列表
     * 
     * @param job 定时任务调度
     * @return 定时任务调度
     */
    @Override
    public List<Job> selectJobList(Job job)
    {
        return jobMapper.selectJobList(job);
    }

    /**
     * 新增定时任务调度
     * 
     * @param job 定时任务调度
     * @return 结果
     */
    @Override
    public int insertJob(Job job)
    {
        job.setCreateTime(DateUtils.getNowDate());
        return jobMapper.insertJob(job);
    }

    /**
     * 修改定时任务调度
     * 
     * @param job 定时任务调度
     * @return 结果
     */
    @Override
    public int updateJob(Job job)
    {
        job.setUpdateTime(DateUtils.getNowDate());
        return jobMapper.updateJob(job);
    }

    /**
     * 批量删除定时任务调度
     * 
     * @param jobIds 需要删除的定时任务调度ID
     * @return 结果
     */
    @Override
    public int deleteJobByIds(Long[] jobIds)
    {
        return jobMapper.deleteJobByIds(jobIds);
    }

    /**
     * 删除定时任务调度信息
     * 
     * @param jobId 定时任务调度ID
     * @return 结果
     */
    @Override
    public int deleteJobById(Long jobId)
    {
        return jobMapper.deleteJobById(jobId);
    }
}
