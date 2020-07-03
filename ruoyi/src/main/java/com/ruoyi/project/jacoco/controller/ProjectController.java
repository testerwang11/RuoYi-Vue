package com.ruoyi.project.jacoco.controller;

import java.util.List;

import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.jacoco.domain.Executerecords;
import com.ruoyi.project.jacoco.service.IExecuterecordsService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.jacoco.domain.Project;
import com.ruoyi.project.jacoco.service.IProjectService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * jacoco项目Controller
 * 
 * @author ruoyi
 * @date 2020-04-19
 */
@RestController
@RequestMapping("/jacoco/project")
public class ProjectController extends BaseController
{
    @Autowired
    private IProjectService projectService;
    @Autowired
    private IExecuterecordsService executerecordsService;
    /**
     * 查询jacoco项目列表
     */
    @PreAuthorize("@ss.hasPermi('jacoco:project:list')")
    @GetMapping("/list")
    public TableDataInfo list(Project project)
    {
        startPage();
        List<Project> list = projectService.selectProjectList(project);
        return getDataTable(list);
    }

    /**
     * 导出jacoco项目列表
     */
    @PreAuthorize("@ss.hasPermi('jacoco:project:export')")
    @Log(title = "jacoco项目", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Project project)
    {
        List<Project> list = projectService.selectProjectList(project);
        ExcelUtil<Project> util = new ExcelUtil<Project>(Project.class);
        return util.exportExcel(list, "project");
    }

    /**
     * 获取jacoco项目详细信息
     */
    @PreAuthorize("@ss.hasPermi('jacoco:project:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(projectService.selectProjectById(id));
    }

    /**
     * 新增jacoco项目
     */
    @PreAuthorize("@ss.hasPermi('jacoco:project:add')")
    @Log(title = "jacoco项目", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Project project)
    {
        return toAjax(projectService.insertProject(project));
    }

    /**
     * 修改jacoco项目
     */
    @PreAuthorize("@ss.hasPermi('jacoco:project:edit')")
    @Log(title = "jacoco项目", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Project project)
    {
        return toAjax(projectService.updateProject(project));
    }

    /**
     * 删除jacoco项目
     */
    @PreAuthorize("@ss.hasPermi('jacoco:project:remove')")
    @Log(title = "jacoco项目", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(projectService.deleteProjectByIds(ids));
    }

    /**
     * 拉取覆盖率
     * @return
     */
    @Log(title = "jacoco项目", businessType = BusinessType.RUN)
    @PostMapping("/run")
    public AjaxResult run(@RequestBody JSONObject request) {
        logger.info("请求参数为:"+request.getInteger("id"));
        Project project = projectService.selectProjectById(request.getLong("id"));
        Executerecords executerecords = new Executerecords();
        executerecords.setProjectname(project.getName());
        executerecords.setDiffurl("d:/");
        executerecords.setExecutetime(DateUtils.getNowDate());
        executerecords.setReportpath("/sjb-pay-gateway/2020_02_17_11_25_09/coveragereport/index.html");
        executerecords.setServerip("192.168.32.12:2182,192.168.32.13:2181");
        executerecords.setRemote("matser");
        executerecordsService.insertExecuterecords(executerecords);
        return AjaxResult.success("开始执行");
    }
}
