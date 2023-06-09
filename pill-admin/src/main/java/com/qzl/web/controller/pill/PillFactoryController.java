package com.qzl.web.controller.pill;

import com.qzl.common.core.controller.BaseController;
import com.qzl.common.core.domain.AjaxResult;
import com.qzl.common.core.page.TableDataInfo;
import com.qzl.pill.domain.PillFactory;
import com.qzl.pill.service.IPillFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 齐兆磊
 * @create 2023/06/09
 */
@RestController
@RequestMapping("/pill/factory")
public class PillFactoryController extends BaseController {

    @Autowired
    private IPillFactoryService pillFactoryService;

    @PreAuthorize("@ss.hasPermi('pill:factory:list')")
    @GetMapping("/list")
    public TableDataInfo list(PillFactory factory) {
        startPage();
        List<PillFactory> list = pillFactoryService.selectPillFactoryList(factory);
        return getDataTable(list);
    }

}
