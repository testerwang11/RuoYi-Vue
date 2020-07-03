package com.ruoyi.project.jacoco.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * jacoco项目对象 jacoco_project
 * 
 * @author ruoyi
 * @date 2020-04-19
 */
public class Project extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 项目编号 */
    private Long id;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String name;

    /** 团队 */
    @Excel(name = "团队")
    private String team;

    /** 代码地址 */
    @Excel(name = "代码地址")
    private String remote;

    /** 主干分支 */
    @Excel(name = "主干分支")
    private String branch;

    /** 服务器信息 */
    @Excel(name = "服务器信息")
    private String config;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setTeam(String team) 
    {
        this.team = team;
    }

    public String getTeam() 
    {
        return team;
    }
    public void setRemote(String remote) 
    {
        this.remote = remote;
    }

    public String getRemote() 
    {
        return remote;
    }
    public void setBranch(String branch) 
    {
        this.branch = branch;
    }

    public String getBranch() 
    {
        return branch;
    }
    public void setConfig(String config) 
    {
        this.config = config;
    }

    public String getConfig() 
    {
        return config;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("team", getTeam())
            .append("remote", getRemote())
            .append("branch", getBranch())
            .append("config", getConfig())
            .toString();
    }
}
