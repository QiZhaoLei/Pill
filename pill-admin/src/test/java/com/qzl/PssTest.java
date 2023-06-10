package com.qzl;

import com.qzl.pill.domain.PillDrug;
import com.qzl.pill.domain.PillFactory;
import com.qzl.pill.service.IPillDrugService;
import com.qzl.pill.service.IPillFactoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author 齐兆磊
 * @create 2023/06/09
 */
@SpringBootTest
public class PssTest {

    @Autowired
    private IPillFactoryService pillFactoryService;

    @Autowired
    private IPillDrugService pillDrugService;

    @Test
    public void testSelectFactory() {
        PillFactory pillFactory = new PillFactory();
        pillFactory.setFactoryName("云南");
        System.out.println(pillFactoryService.selectPillFactoryList(pillFactory));
    }

    @Test
    public void testSelectDrug() {
        PillDrug pillDrug = new PillDrug();
        PillFactory pillFactory = new PillFactory();
        pillFactory.setFactoryName("哈药");
        pillDrug.setPillFactory(pillFactory);
        List<PillDrug> pillDrugs = pillDrugService.selectPillDrugList(pillDrug);
        System.out.println(pillDrugs);
    }




}
