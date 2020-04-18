package com.ruoyi.project.jacoco.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 覆盖率拉取记录对象 tb_executerecords
 * 
 * @author wanghuiyong
 * @date 2020-03-02
 */
public class TbExecuterecords extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 项目编号 */
    private Long id;

    /** 项目编号 */
    @Excel(name = "项目编号")
    private String projectname;

    /** 分支 */
    @Excel(name = "分支")
    private String codebranch;

    /** 代码路径 */
    @Excel(name = "代码路径")
    private String diffurl;

    /** 执行时间 */
    @Excel(name = "执行时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date executetime;

    /** 服务器IP */
    @Excel(name = "服务器IP")
    private String serverip;

    /** 报告路径 */
    @Excel(name = "报告路径")
    private String reportpath;

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
    public void setCodebranch(String codebranch) 
    {
        this.codebranch = codebranch;
    }

    public String getCodebranch() 
    {
        return codebranch;
    }
    public void setDiffurl(String diffurl) 
    {
        this.diffurl = diffurl;
    }

    public String getDiffurl() 
    {
        return diffurl;
    }
    public void setExecutetime(Date executetime) 
    {
        this.executetime = executetime;
    }

    public Date getExecutetime() 
    {
        return executetime;
    }
    public void setServerip(String serverip) 
    {
        this.serverip = serverip;
    }

    public String getServerip() 
    {
        return serverip;
    }
    public void setReportpath(String reportpath) 
    {
        this.reportpath = reportpath;
    }

    public String getReportpath() 
    {
        return reportpath;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("projectname", getProjectname())
            .append("codebranch", getCodebranch())
            .append("diffurl", getDiffurl())
            .append("executetime", getExecutetime())
            .append("serverip", getServerip())
            .append("reportpath", getReportpath())
            .toString();
    }
}
