package com.qzl;

import com.qzl.pill.domain.PillFactory;
import com.qzl.pill.service.IPillFactoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 齐兆磊
 * @create 2023/06/09
 */
@SpringBootTest
public class PssTest {

    @Autowired
    private IPillFactoryService pillFactoryService;

    @Test
    public void testSelectFactory() {
        PillFactory pillFactory = new PillFactory();
        pillFactory.setFactoryName("云南");
        System.out.println(pillFactoryService.selectPillFactoryList(pillFactory));
    }
}
