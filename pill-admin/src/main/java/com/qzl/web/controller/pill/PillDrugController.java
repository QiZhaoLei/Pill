package com.qzl.web.controller.pill;

import com.qzl.common.annotation.Log;
import com.qzl.common.core.controller.BaseController;
import com.qzl.common.core.domain.AjaxResult;
import com.qzl.common.core.page.TableDataInfo;
import com.qzl.common.enums.BusinessType;
import com.qzl.common.utils.poi.ExcelUtil;
import com.qzl.pill.domain.PillDrug;
import com.qzl.pill.service.IPillDrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 药品信息Controller
 * 
 * @author é½åç£
 * @date 2023-06-10
 */
@RestController
@RequestMapping("/pill/drug")
public class PillDrugController extends BaseController
{
    @Autowired
    private IPillDrugService pillDrugService;

    /**
     * 查询药品信息列表
     */
    @PreAuthorize("@ss.hasPermi('pill:drug:list')")
    @GetMapping("/list")
    public TableDataInfo list(PillDrug pillDrug)
    {
        startPage();
        List<PillDrug> list = pillDrugService.selectPillDrugList(pillDrug);
        return getDataTable(list);
    }

    /**
     * 导出药品信息列表
     */
    @PreAuthorize("@ss.hasPermi('pill:drug:export')")
    @Log(title = "药品信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PillDrug pillDrug)
    {
        List<PillDrug> list = pillDrugService.selectPillDrugList(pillDrug);
        ExcelUtil<PillDrug> util = new ExcelUtil<PillDrug>(PillDrug.class);
        util.exportExcel(response, list, "药品信息数据");
    }

    /**
     * 获取药品信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('pill:drug:query')")
    @GetMapping(value = "/{drugId}")
    public AjaxResult getInfo(@PathVariable("drugId") Long drugId)
    {
        return success(pillDrugService.selectPillDrugByDrugId(drugId));
    }

    /**
     * 新增药品信息
     */
    @PreAuthorize("@ss.hasPermi('pill:drug:add')")
    @Log(title = "药品信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PillDrug pillDrug)
    {
        return toAjax(pillDrugService.insertPillDrug(pillDrug));
    }

    /**
     * 修改药品信息
     */
    @PreAuthorize("@ss.hasPermi('pill:drug:edit')")
    @Log(title = "药品信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PillDrug pillDrug)
    {
        return toAjax(pillDrugService.updatePillDrug(pillDrug));
    }

    /**
     * 删除药品信息
     */
    @PreAuthorize("@ss.hasPermi('pill:drug:remove')")
    @Log(title = "药品信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{drugIds}")
    public AjaxResult remove(@PathVariable Long[] drugIds)
    {
        return toAjax(pillDrugService.deletePillDrugByDrugIds(drugIds));
    }
}
