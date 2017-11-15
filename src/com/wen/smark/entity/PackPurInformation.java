package com.wen.smark.entity;

import java.util.Date;

/**
 * @ClassName PackPurInformation
 * @Description 该类为数据库中pack_pur_information表的实体类
 * @author wen_toto
 * @date 2017/8/16
 */
public class PackPurInformation extends IdEntity<Long> {
//    /**
//     * 购买的套餐信息ID
//     */
//    private Long id;
    /**
     * 套餐购买日期 yyyy-MM-dd HH:mm:ss
     */
    private Date buyTime;
    /**
     * 客户信息Id
     */
    private Customer customerId;
    /**
     * 套餐信息Id
     */
    private PackageInformation packageInformationId;
    /**
     * 支付金额
     */
    private Double amountOfPayment;
    /**
     * 套餐是否购买成功:false(未成功),true(成功)
     */
    private Boolean isSuccess;
    /**
     * 套餐执行时间
     */
    private Date effectTime;


//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public PackageInformation getPackageInformationId() {
        return packageInformationId;
    }

    public void setPackageInformationId(PackageInformation packageInformationId) {
        this.packageInformationId = packageInformationId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Double getAmountOfPayment() {
        return amountOfPayment;
    }

    public void setAmountOfPayment(Double amountOfPayment) {
        this.amountOfPayment = amountOfPayment;
    }

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Date getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(Date effectTime) {
        this.effectTime = effectTime;
    }

    @Override
    public String toString() {
        return "PackPurInformation{"+"id="+ id +
                ", buyTime=" + buyTime +
                ", customerId=" + customerId +
                ", packageInformationId=" + packageInformationId +
                ", amountOfPayment=" + amountOfPayment +
                ", isSuccess=" + isSuccess +
                ", effectTime=" + effectTime +
                '}';
    }
}
