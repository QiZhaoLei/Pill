package com.qzl.pill.domain;

import com.qzl.common.core.domain.BaseEntity;

/**
 * @author 齐兆磊
 * @create 2023/06/09
 */
public class PillFactory extends BaseEntity {
    private static final long serialVersionUID = 1L;
    /**
     * 厂家ID
     */
    private Long factoryId;
    /**
     * 厂家名称
     */
    private String factoryName;
    /**
     * 厂家编码
     */
    private String factoryCode;
    /**
     * 联系人
     */
    private String contact;
    /**
     * 电话
     */
    private String phone;
    /**
     * 关键字
     */
    private String keyword;
    /**
     * 状态
     */
    private String status;

    public Long getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Long factoryId) {
        this.factoryId = factoryId;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(String factoryCode) {
        this.factoryCode = factoryCode;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PillFactory{" +
                "factoryId=" + factoryId +
                ", factoryName='" + factoryName + '\'' +
                ", factoryCode='" + factoryCode + '\'' +
                ", contact='" + contact + '\'' +
                ", phone='" + phone + '\'' +
                ", keyword='" + keyword + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
