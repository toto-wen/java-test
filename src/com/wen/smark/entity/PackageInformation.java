package com.wen.smark.entity;

import java.util.Date;

/**
 * @ClassName PackageInformation
 * @Description 对应数据库中的package_informateion表
 * @author wen_toto
 * @date 2017/8/16
 */

public class PackageInformation extends IdEntity<Long> {
//    /**
//     * 套餐主键ID
//     */
//    private Long id;
    /**
     * 套餐表的套餐编号
     */
    private String mealNumber;
    /**
     * 套餐名称
     */
    private String mealName;
    /**
     * 短信数量：单位条
     */
    private Integer messageNumber;
    /**
     * 通话分钟数：单位分钟
     */
    private Integer minuteNumber;
    /**
     * 套餐流量；单位KB-0,MB-1,GB -2
     */
    private Integer flowNumber;
    /**
     * 来电提醒
     */
    private Boolean isCall;
    /**
     * 套餐彩铃
     */
    private Boolean isColorBack;
    /**
     * 套餐租金
     */
    private Double monthlyRent;
    /**
     * 套餐描述
     */
    private String mealDescribe;
    /**
     * 套餐开始时间： yyyy-MM-dd
     */
    private Date mealStartDate;
    /**
     * 套餐结束时间：yyyy-MM-dd
     */
    private Date mealEndDate;
    /**
     * 套餐流量单位
     */
    private Byte unit;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getMealNumber() {
        return mealNumber;
    }

    public void setMealNumber(String mealNumber) {
        this.mealNumber = mealNumber;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public Integer getMessageNumber() {
        return messageNumber;
    }

    public void setMessageNumber(Integer messageNumber) {
        this.messageNumber = messageNumber;
    }

    public Integer getMinuteNumber() {
        return minuteNumber;
    }

    public void setMinuteNumber(Integer minuteNumber) {
        this.minuteNumber = minuteNumber;
    }

    public Integer getFlowNumber() {
        return flowNumber;
    }

    public void setFlowNumber(Integer flowNumber) {
        this.flowNumber = flowNumber;
    }

    public Boolean getIsCall() {
        return isCall;
    }

    public void setIsCall(Boolean isCall) {
        this.isCall = isCall;
    }

    public Boolean getIsColorBack() {
        return isColorBack;
    }

    public void setIsColorBack(Boolean isColorBack) {
        this.isColorBack = isColorBack;
    }

    public Double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(Double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public String getMealDescribe() {
        return mealDescribe;
    }

    public void setMealDescribe(String mealDescribe) {
        this.mealDescribe = mealDescribe;
    }

    public Date getMealStartDate() {
        return mealStartDate;
    }

    public void setMealStartDate(Date mealStartDate) {
        this.mealStartDate = mealStartDate;
    }

    public Date getMealEndDate() {
        return mealEndDate;
    }

    public void setMealEndDate(Date mealEndDate) {
        this.mealEndDate = mealEndDate;
    }

    public Byte getUnit() {
        return unit;
    }

    public void setUnit(Byte unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "PackageInformation{"+"id="+ getId() +
                ", mealNumber='" + mealNumber + '\'' +
                ", mealName='" + mealName + '\'' +
                ", messageNumber=" + messageNumber +
                ", minuteNumber=" + minuteNumber +
                ", flowNumber=" + flowNumber +
                ", isCall=" + isCall +
                ", isColorBack=" + isColorBack +
                ", monthlyRent=" + monthlyRent +
                ", mealDescribe='" + mealDescribe + '\'' +
                ", mealStartDate=" + mealStartDate +
                ", mealEndDate=" + mealEndDate +
                ", unit=" + unit +
                '}';
    }
}
