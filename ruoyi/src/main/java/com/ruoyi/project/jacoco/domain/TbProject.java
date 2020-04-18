package com.ruoyi.project.jacoco.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 覆盖率项目对象 tb_project
 * 
 * @author wanghuiyong
 * @date 2020-03-02
 */
public class TbProject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 项目编号 */
    private Long id;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String projectname;

    /** 团队 */
    @Excel(name = "团队")
    private String projectgroup;

    /** 代码路径 */
    @Excel(name = "代码路径")
    private String codepath;

    /** 代码分支 */
    @Excel(name = "代码分支")
    private String codebranch;

    /** $column.columnComment */
    @Excel(name = "代码分支")
    private String projectconfig;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setProjectname(String projectname) 
    {
        this.projectname = projectname;
    }

    public String getProjectname() 
    {
        return projectname;
    }
    public void setProjectgroup(String projectgroup) 
    {
        this.projectgroup = projectgroup;
    }

    public String getProjectgroup() 
    {
        return projectgroup;
    }
    public void setCodepath(String codepath) 
    {
        this.codepath = codepath;
    }

    public String getCodepath() 
    {
        return codepath;
    }
    public void setCodebranch(String codebranch) 
    {
        this.codebranch = codebranch;
    }

    public String getCodebranch() 
    {
        return codebranch;
    }
    public void setProjectconfig(String projectconfig)
    {
        this.projectconfig = projectconfig;
    }

    public String getProjectconfig()
    {
        return projectconfig;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("projectname", getProjectname())
            .append("projectgroup", getProjectgroup())
            .append("codepath", getCodepath())
            .append("codebranch", getCodebranch())
            .append("projectconfig", getProjectconfig())
            .toString();
    }
}
