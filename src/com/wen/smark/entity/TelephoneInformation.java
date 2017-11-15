package com.wen.smark.entity;

import java.util.Date;

/**
 * @ClassName TelephoneInformation
 * @Description 通话记录实体类
 * @author wen_toto
 * @date 2017/8/17
 */

public class TelephoneInformation extends IdEntity<Long> {
    /**
     * 拨打电话的用户ID,直接用用户对象来代替
     */
    private Customer dialCustomerId;
    /**
     * 接听电话的用户ID,直接用用户对象来代替
     */
    private Customer answerCustomerId;
    /**
     * 接听时间,单位：秒
     */
    private Long conversationTime;
    /**
     * 通话所扣除的电话费
     */
    private Double callConsumption;
    /**
     * 通话开始时间 格式为：yyyy-MM-dd HH:mm:ss
     */
    private Date callBeginTime;
    /**
     * 通话结束时间 格式为：yyyy-MM-dd HH:mm:ss
     */
    private Date callEndTime;
    /**
     * 通话类型 1-本地,2-长途,3-漫游
     */
    private Byte callType;
    /**
     * 是否通话成功 0-false(未成功),1-true(成功)
     */
    private Boolean answerState;
    /**
     * 拨打类型 0-false(拨打),1-true(接听)
     */
    private Boolean dialType;

    public Customer getDialCustomerId() {
        return dialCustomerId;
    }

    public void setDialCustomerId(Customer dialCustomerId) {
        this.dialCustomerId = dialCustomerId;
    }

    public Customer getAnswerCustomerId() {
        return answerCustomerId;
    }

    public void setAnswerCustomerId(Customer answerCustomerId) {
        this.answerCustomerId = answerCustomerId;
    }

    public Long getConversationTime() {
        return conversationTime;
    }

    public void setConversationTime(Long conversationTime) {
        this.conversationTime = conversationTime;
    }

    public Double getCallConsumption() {
        return callConsumption;
    }

    public void setCallConsumption(Double callConsumption) {
        this.callConsumption = callConsumption;
    }

    public Date getCallBeginTime() {
        return callBeginTime;
    }

    public void setCallBeginTime(Date callBeginTime) {
        this.callBeginTime = callBeginTime;
    }

    public Date getCallEndTime() {
        return callEndTime;
    }

    public void setCallEndTime(Date callEndTime) {
        this.callEndTime = callEndTime;
    }

    public Byte getCallType() {
        return callType;
    }

    public void setCallType(Byte callType) {
        this.callType = callType;
    }

    public Boolean getAnswerState() {
        return answerState;
    }

    public void setAnswerState(Boolean answerState) {
        this.answerState = answerState;
    }

    public Boolean getDialType() {
        return dialType;
    }

    public void setDialType(Boolean dialType) {
        this.dialType = dialType;
    }

    @Override
    public String toString() {
        return "TelephoneInformation{" +
                "dialCustomerId=" + dialCustomerId +
                ", answerCustomerId=" + answerCustomerId +
                "\n conversationTime=" + conversationTime +
                ", callConsumption=" + callConsumption +
                ", callBeginTime=" + callBeginTime +
                "\n callEndTime=" + callEndTime +
                ", callType=" + callType +
                ", answerState=" + answerState +
                "\n dialType=" + dialType +
                '}';
    }
}
