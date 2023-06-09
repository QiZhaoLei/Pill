package com.qzl.pill.service.impl;

import com.qzl.pill.domain.PillFactory;
import com.qzl.pill.mapper.PillFactoryMapper;
import com.qzl.pill.service.IPillFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 齐兆磊
 * @create 2023/06/09
 */
@Service
public class PillFactoryServiceImpl implements IPillFactoryService {

    @Autowired
    private PillFactoryMapper pillFactoryMapper;

    /**
     * 查询工厂数据
     *
     * @param factory 工厂
     * @return 工厂信息集合
     */
    @Override
    public List<PillFactory> selectPillFactoryList(PillFactory factory) {
        return pillFactoryMapper.selectPillFactoryList(factory);
    }
}
