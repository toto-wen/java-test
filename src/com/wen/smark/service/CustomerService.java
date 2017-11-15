package com.wen.smark.service;

import com.wen.smark.entity.Customer;
import com.wen.smark.exception.MyException;

import java.util.Date;

/**
 * @InterfaceName CustomerService
 * @Description 该接口提供Customer实体类的一些业务方法
 * @author wen_toto
 * @date 2017/8/17
 */
public interface CustomerService extends BaseService<Customer, Long>{

    /**
     * @Title reduceCustomerBalance
     * @Description 在用户使用了需要付费的服务时，用来从用户的余额中扣除相应的服务费
     * @author wen_toto
     * @date 2017/8/21
     * @param customer 用户信息
     * @param reduceBalance 需扣除的金额
     * @return boolean
     */
    public boolean reduceCustomerBalance(Customer customer, double reduceBalance);

    /**
     * @Title subCustomerBalance
     * @Description 用于添加用户的余额
     * @param customer 用户对象信息
     * @param subBalance 需添加的用户余额
     * @return boolean
     */
    public boolean subCustomerBalance(Customer customer, double subBalance);

    /**
     * @Title dial
     * @Description 拨打电话的方法
     * @author wen_toto
     * @date 2017/8/22
     * @param customer1 拨打电话的用户
     * @param customer2 被拨打电话的用户
     * @return boolean
     */
    public boolean dial(Customer customer1, Customer customer2);

    /**
     * @Title answer
     * @Description 用于用户接听电话的动作方法
     * @author wen_toto
     * @date 2017/8/22
     * @param customer1 拨号用户
     * @param customer2 接听用户
     * @return
     */
    public boolean answer(Customer customer1, Customer customer2) throws MyException;

    /**
     * @Title conversation
     * @Description 用户之间的通话方法，用于两个用户之间的通讯
     * @author wen_toto
     * @date 2017/8/22
     * @param customer1 主动拨号用户
     * @param customer2 被动拨号用户
     * @return Date
     */
    public Date conversation(Customer customer1, Customer customer2);
}
