package com.wen.smark.begin;

/**
 * @Title Package
 * @Description 该类为与数据库中Package表所对应的实体类
 * @author wen_toto
 * @date 2017/8/14
 */
public class Package {


    /**
     * 套餐编号
     */
    private Integer packageId;

    /**
     * 套餐名称
     */
    private String packagBame;

    /**
     * 送的短信条数：单位为条
     */
    private Integer packageMessageNum;

    /**
     * 送的通话分钟数：单位为分钟
     */
    private Integer packageBillMinute;

    /**
     * 套餐送的流量数：单位为G,M,KB
     */
    private Integer packageFlowNum;

    /**
     * 是否有来电提醒：false-表示没有，true-表示有
     */
    private Boolean packageCallReminder;

    /**
     * 是否有开通彩铃：false-表示没有，true-表示有
     */
    private Boolean packageSing;

    /**
     * 套餐租金：$/月
     */
    private Float packageMonthly;

    /**
     * 套餐描述:如好消息好消息，大礼包等
     */
    private String packageDescribe;

    /**
     * 流量的单位
     */
    private Byte FlowUnit;

    /**
     * @Tile get,set
     * @Description 一下方法为该类各个属性变量的set,get方法
     * @author wen_toto
     * @date 2017/8/14
     * @param ：依据属性变量的具体类型，get方法没有参数
     * @return get方法：依据属性变量的具体类型,set方法没有返回值
     */
    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getPackagBame() {
        return packagBame;
    }

    public void setPackagBame(String packagBame) {
        this.packagBame = packagBame;
    }

    public Integer getPackageMessageNum() {
        return packageMessageNum;
    }

    public void setPackageMessageNum(Integer packageMessageNum) {
        this.packageMessageNum = packageMessageNum;
    }

    public Integer getPackageBillMinute() {
        return packageBillMinute;
    }

    public void setPackageBillMinute(Integer packageBillMinute) {
        this.packageBillMinute = packageBillMinute;
    }

    public Integer getPackageFlowNum() {
        return packageFlowNum;
    }

    public void setPackageFlowNum(Integer packageFlowNum) {
        this.packageFlowNum = packageFlowNum;
    }

    public Boolean getPackageCallReminder() {
        return packageCallReminder;
    }

    public void setPackageCallReminder(Boolean packageCallReminder) {
        this.packageCallReminder = packageCallReminder;
    }

    public Boolean getPackageSing() {
        return packageSing;
    }

    public void setPackageSing(Boolean packageSing) {
        this.packageSing = packageSing;
    }

    public Float getPackageMonthly() {
        return packageMonthly;
    }

    public void setPackageMonthly(Float packageMonthly) {
        this.packageMonthly = packageMonthly;
    }

    public String getPackageDescribe() {
        return packageDescribe;
    }

    public void setPackageDescribe(String packageDescribe) {
        this.packageDescribe = packageDescribe;
    }

    public Byte getFlowUnit() {
        return FlowUnit;
    }

    public void setFlowUnit(Byte flowUnit) {
        FlowUnit = flowUnit;
    }
}