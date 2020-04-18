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
import com.ruoyi.project.jacoco.domain.TbExecuterecords;
import com.ruoyi.project.jacoco.service.ITbExecuterecordsService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 覆盖率拉取记录Controller
 * 
 * @author wanghuiyong
 * @date 2020-03-02
 */
@RestController
@RequestMapping("/jacoco/executerecords")
public class TbExecuterecordsController extends BaseController
{
    @Autowired
    private ITbExecuterecordsService tbExecuterecordsService;

    /**
     * 查询覆盖率拉取记录列表
     */
    @PreAuthorize("@ss.hasPermi('jacoco:executerecords:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbExecuterecords tbExecuterecords)
    {
        startPage();
        List<TbExecuterecords> list = tbExecuterecordsService.selectTbExecuterecordsList(tbExecuterecords);
        return getDataTable(list);
    }

    /**
     * 导出覆盖率拉取记录列表
     */
    @PreAuthorize("@ss.hasPermi('jacoco:executerecords:export')")
    @Log(title = "覆盖率拉取记录", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TbExecuterecords tbExecuterecords)
    {
        List<TbExecuterecords> list = tbExecuterecordsService.selectTbExecuterecordsList(tbExecuterecords);
        ExcelUtil<TbExecuterecords> util = new ExcelUtil<TbExecuterecords>(TbExecuterecords.class);
        return util.exportExcel(list, "executerecords");
    }

    /**
     * 获取覆盖率拉取记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('jacoco:executerecords:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tbExecuterecordsService.selectTbExecuterecordsById(id));
    }

    /**
     * 新增覆盖率拉取记录
     */
    @PreAuthorize("@ss.hasPermi('jacoco:executerecords:add')")
    @Log(title = "覆盖率拉取记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbExecuterecords tbExecuterecords)
    {
        return toAjax(tbExecuterecordsService.insertTbExecuterecords(tbExecuterecords));
    }

    /**
     * 修改覆盖率拉取记录
     */
    @PreAuthorize("@ss.hasPermi('jacoco:executerecords:edit')")
    @Log(title = "覆盖率拉取记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbExecuterecords tbExecuterecords)
    {
        return toAjax(tbExecuterecordsService.updateTbExecuterecords(tbExecuterecords));
    }

    /**
     * 删除覆盖率拉取记录
     */
    @PreAuthorize("@ss.hasPermi('jacoco:executerecords:remove')")
    @Log(title = "覆盖率拉取记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tbExecuterecordsService.deleteTbExecuterecordsByIds(ids));
    }
}
