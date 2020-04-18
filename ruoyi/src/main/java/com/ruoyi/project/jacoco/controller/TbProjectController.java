package com.ruoyi.project.jacoco.controller;

import java.util.List;
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
import com.ruoyi.project.jacoco.domain.TbProject;
import com.ruoyi.project.jacoco.service.ITbProjectService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 覆盖率项目Controller
 * 
 * @author wanghuiyong
 * @date 2020-03-02
 */
@RestController
@RequestMapping("/jacoco/project")
public class TbProjectController extends BaseController
{
    @Autowired
    private ITbProjectService tbProjectService;

    /**
     * 查询覆盖率项目列表
     */
    @PreAuthorize("@ss.hasPermi('jacoco:project:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbProject tbProject)
    {
        startPage();
        List<TbProject> list = tbProjectService.selectTbProjectList(tbProject);
        return getDataTable(list);
    }

    /**
     * 导出覆盖率项目列表
     */
    @PreAuthorize("@ss.hasPermi('jacoco:project:export')")
    @Log(title = "覆盖率项目", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TbProject tbProject)
    {
        List<TbProject> list = tbProjectService.selectTbProjectList(tbProject);
        ExcelUtil<TbProject> util = new ExcelUtil<TbProject>(TbProject.class);
        return util.exportExcel(list, "project");
    }

    /**
     * 获取覆盖率项目详细信息
     */
    @PreAuthorize("@ss.hasPermi('jacoco:project:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tbProjectService.selectTbProjectById(id));
    }

    /**
     * 新增覆盖率项目
     */
    @PreAuthorize("@ss.hasPermi('jacoco:project:add')")
    @Log(title = "覆盖率项目", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbProject tbProject)
    {
        return toAjax(tbProjectService.insertTbProject(tbProject));
    }

    /**
     * 修改覆盖率项目
     */
    @PreAuthorize("@ss.hasPermi('jacoco:project:edit')")
    @Log(title = "覆盖率项目", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbProject tbProject)
    {
        return toAjax(tbProjectService.updateTbProject(tbProject));
    }

    /**
     * 删除覆盖率项目
     */
    @PreAuthorize("@ss.hasPermi('jacoco:project:remove')")
    @Log(title = "覆盖率项目", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tbProjectService.deleteTbProjectByIds(ids));
    }
}
