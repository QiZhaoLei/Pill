package com.qzl.pill.mapper;

import com.qzl.pill.domain.PillFactory;

import java.util.List;

/**
 * @author 齐兆磊
 * @create 2023/06/09
 */
public interface PillFactoryMapper {

    /**
     * 查询工厂数据
     *
     * @param factory 工厂
     * @return 工厂信息集合
     */
    public List<PillFactory> selectPillFactoryList(PillFactory factory);
}
