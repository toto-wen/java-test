package com.wen.smark.entity;

import java.util.List;
import java.util.Set;

/**
 * @ClassName Customer
 * @Description 实体类，对应数据库表customer
 * @author wen_toto
 * @date 2017/8/16
 */

public class Customer extends IdEntity<Long> {
//    /**
//     * 用户ID
//     */
//    private Long ID;
    /**
     * 用户名称
     */
    private String name;
    /**
     * 用户电话
     */
    private String phoneCode;
    /**
     * 用户性别 1-男，0-女
     */
    private Byte sex;
    /**
     * 用户身份证
     */
    private String idCard;
    /**
     * 用户地址
     */
    private String address;
    /**
     * 账号余额
     */
    private Double balance;
    /**
     * 用户使用套餐
     */
    private PackageInformation packageInformation;
    /**
     * 用户是否停机 1-true,0-false
     */
    private Boolean isShutdown;
    /**
     * 用户是否欠费 1-true,0-false
     */
    private Boolean isStopArrears;
    /**
     * 用户的星级:1-一星级,2-二星级,3-三星级,4-四星级,5-五星级,6-超级vip
     */
    private Byte starStates;

    /**
     * 用户的短信记录List集合
     */
    private List<ShortMessage> shortMessageList = null;

    /**
     * 用户的短信记录Set集合
     */
    private Set<ShortMessage> shortMessageSet = null;

    /**
     * 用户的通话记录List集合
     */
    private List<TelephoneInformation> telephoneInformationList = null;

    /**
     * 用户的通话记录Set集合
     */
    private Set<TelephoneInformation> telephoneInformationSet = null;

    /**
     * 用户所购买的所有套餐购买记录List集合
     */
    private List<PackPurInformation> packPurInformationList = null;

    /**
     * 用户所购买的所有套餐购买记录的Set集合
     */
    private Set<PackPurInformation> packPurInformationSet = null;

//    public Long getID() {
//        return ID;
//    }
//
//    public void setID(Long ID) {
//        this.ID = ID;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public PackageInformation getPackageInformation() {
        return packageInformation;
    }

    public void setPackageInformation(PackageInformation packageInformation) {
        this.packageInformation = packageInformation;
    }

    public List<ShortMessage> getShortMessageList() {
        return shortMessageList;
    }

    public void setShortMessageList(List<ShortMessage> shortMessageList) {
        this.shortMessageList = shortMessageList;
    }

    public Set<ShortMessage> getShortMessageSet() {
        return shortMessageSet;
    }

    public void setShortMessageSet(Set<ShortMessage> shortMessageSet) {
        this.shortMessageSet = shortMessageSet;
    }

    public List<TelephoneInformation> getTelephoneInformationList() {
        return telephoneInformationList;
    }

    public void setTelephoneInformationList(List<TelephoneInformation> telephoneInformationList) {
        this.telephoneInformationList = telephoneInformationList;
    }

    public Set<TelephoneInformation> getTelephoneInformationSet() {
        return telephoneInformationSet;
    }

    public void setTelephoneInformationSet(Set<TelephoneInformation> telephoneInformationSet) {
        this.telephoneInformationSet = telephoneInformationSet;
    }

    public List<PackPurInformation> getPackPurInformationList() {
        return packPurInformationList;
    }

    public void setPackPurInformationList(List<PackPurInformation> packPurInformationList) {
        this.packPurInformationList = packPurInformationList;
    }

    public Set<PackPurInformation> getPackPurInformationSet() {
        return packPurInformationSet;
    }

    public void setPackPurInformationSet(Set<PackPurInformation> packPurInformationSet) {
        this.packPurInformationSet = packPurInformationSet;
    }

    public Boolean getIsShutdown() {
        return isShutdown;
    }

    public void setIsShutdown(Boolean isShutdown) {
        this.isShutdown = isShutdown;
    }

    public Boolean getIsStopArrears() {
        return isStopArrears;
    }

    public void setIsStopArrears(Boolean isStopArrears) {
        this.isStopArrears = isStopArrears;
    }

    public Byte getStarStates() {
        return starStates;
    }

    public void setStarStates(Byte starStates) {
        this.starStates = starStates;
    }


    @Override
    public String toString() {
        return "Customer{"+"id="+ getId() +
                ", name='" + name + '\'' +
                "\n phoneCode='" + phoneCode + '\'' +
                ", sex=" + sex +
                "\n idCard='" + idCard + '\'' +
                ", address='" + address + '\'' +
                "\n balance=" + balance +
                ", packageInformationId=" + packageInformation +
                "\n isShutdown=" + isShutdown +
                ", isStopArrears=" + isStopArrears +
                ", starStates=" + starStates +
                '}';
    }
}
