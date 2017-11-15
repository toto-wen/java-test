package com.wen.smark.entity;

import java.util.Date;

/**
 * @ClassName ShortMessage
 * @Description 短信实体类
 * @author wen_toto
 * @date 2017/8/20
 */

public class ShortMessage extends IdEntity<Long> {
    /**
     * 发送短信的用户信息Id
     */
    private Customer sendCustomerId;
    /**
     * 接收短信的用户Id
     */
    private Customer receiveCustomerId;
    /**
     * 短信费用
     */
    private Double consumption;
    /**
     * 发送短信的时间 格式为：yyyy-MM-dd HH:mm:ss
     */
    private Date sendMessageTime;
    /**
     * 送达短信的时间 格式为：yyyy-MM-dd HH:mm:ss
     */
    private Date receiveMessageTime;
    /**
     * 发送短信的类型：0-彩信，1-短信，其他待以后扩展
     */
    private Byte messageType;
    /**
     * 短信是否发送或成功接收：0-false(未成功), 1-true(成功)
     */
    private Boolean isSendSuccess;
    /**
     * 所发送的短信内容，短信内容不超过250字，彩信大于于250字小于500字
     */
    private String messageContent;

    public Customer getSendCustomerId() {
        return sendCustomerId;
    }

    public void setSendCustomerId(Customer sendCustomerId) {
        this.sendCustomerId = sendCustomerId;
    }

    public Customer getReceiveCustomerId() {
        return receiveCustomerId;
    }

    public void setReceiveCustomerId(Customer receiveCustomerId) {
        this.receiveCustomerId = receiveCustomerId;
    }

    public Double getConsumption() {
        return consumption;
    }

    public void setConsumption(Double consumption) {
        this.consumption = consumption;
    }

    public Date getSendMessageTime() {
        return sendMessageTime;
    }

    public void setSendMessageTime(Date sendMessageTime) {
        this.sendMessageTime = sendMessageTime;
    }

    public Date getReceiveMessageTime() {
        return receiveMessageTime;
    }

    public void setReceiveMessageTime(Date receiveMessageTime) {
        this.receiveMessageTime = receiveMessageTime;
    }

    public Byte getMessageType() {
        return messageType;
    }

    public void setMessageType(Byte messageType) {
        this.messageType = messageType;
    }

    public Boolean getIsSendSuccess() {
        return isSendSuccess;
    }

    public void setIsSendSuccess(Boolean isSendSuccess) {
        this.isSendSuccess = isSendSuccess;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }
}
