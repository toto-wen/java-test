package com.wen.smark.express;

import java.util.Date;

/**
 * @ClassName ExpressThing
 * @Description 快递物品类，描述快递物品的基本信息
 * @author wen_toto
 * @date 2017/8/13
 */

public class ExpressThing {
    /**
     * 商品名称
     */
    private String commodity_name = "";
    /**
     * 送货地址
     */
    private String delivery_address = "";
    /**
     * 收货人
     */
    private String consignee = "";
    /**
     * 收货人电话
     */
    private Long consignee_telephone_card = 0L;
    /**
     * 送货时间
     */
    private Date send_time = null;
    /**
     * 价值金额
     */
    private Double value_amount = 0D;
    /**
     * 邮件状态：已收件或未收件
     */
    private String express_status = "";
    /**
     * 收件日期
     */
    private Date receipt_time = null;

    /**
     *@Title: set,get
     *@Description: 该类属性的set，get方法用于设置和获取该类的属性值
     * @author; wen_toto
     * @data: 2017/8/13
     */
    public String getCommodity_name() {
        return commodity_name;
    }

    public void setCommodity_name(String commodity_name) {
        this.commodity_name = commodity_name;
    }

    public String getDelivery_address() {
        return delivery_address;
    }

    public void setDelivery_address(String delivery_address) {
        this.delivery_address = delivery_address;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public Long getConsignee_telephone_card() {
        return consignee_telephone_card;
    }

    public void setConsignee_telephone_card(Long consignee_telephone_card) {
        this.consignee_telephone_card = consignee_telephone_card;
    }

    public Date getSend_time() {
        return send_time;
    }

    public void setSend_time(Date send_time) {
        this.send_time = send_time;
    }

    public Double getValue_amount() {
        return value_amount;
    }

    public void setValue_amount(Double value_amount) {
        this.value_amount = value_amount;
    }

    public String getExpress_status() {
        return express_status;
    }

    public void setExpress_status(String express_status) {
        this.express_status = express_status;
    }

    public Date getReceipt_time() {
        return receipt_time;
    }

    public void setReceipt_time(Date receipt_time) {
        this.receipt_time = receipt_time;
    }
}
