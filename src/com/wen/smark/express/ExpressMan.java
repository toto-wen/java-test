package com.wen.smark.express;

/**
 * @ClassName ExpressMan
 * @Description 快递员信息类
 * @author wen_toto
 * @date 2017/8/13
 */

public class ExpressMan {
    /**
     * 快递员姓名
     */
    private String name = "";
    /**
     * 快递员性别
     */
    private String sex = "";
    /**
     * 快递员年龄
     */
    private Integer age = 0;
    /**
     * 快递员身高
     */
    private Float height = 0.00f;
    /**
     * 快递员学历
     */
    private String education = "";
    /**
     * 快递员身份证号码
     */
    private Long id_card = 0L;
    /**
     * 快递员电话
     */
    private Long telephone_card = 0L;
    /**
     * 该快递员所持有的快递物品数组
     */
    private ExpressThing[] expressThings = null;

    /**
     *@Title: set,get
     *@Description: 该类属性的set，get方法用于设置和获取该类的属性值
     * @author; wen_toto
     * @data: 2017/8/13
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Long getId_card() {
        return id_card;
    }

    public void setId_card(Long id_card) {
        this.id_card = id_card;
    }

    public Long getTelephone_card() {
        return telephone_card;
    }

    public void setTelephone_card(Long telephone_card) {
        this.telephone_card = telephone_card;
    }

    public ExpressThing[] getExpressThings() {
        return expressThings;
    }

    public void setExpressThings(ExpressThing[] expressThings) {
        this.expressThings = expressThings;
    }

    /**
     * @Title toString
     * @Description 重写的toString 方法，用于返回ExperssMan中各个属性的值。。
     * @author wen_toto
     * @data 2017/8/13
     * @return String
     */
    @Override
    public String toString() {
        return "ExpressMan{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", education='" + education + '\'' +
                ", id_card='" + id_card + '\'' +
                ", telephone_card='" + telephone_card + '\'' +
                '}';
    }
}
