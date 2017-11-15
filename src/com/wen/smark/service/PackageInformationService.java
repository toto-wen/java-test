package com.wen.smark.service;

import com.wen.smark.entity.PackageInformation;

import java.util.Map;

/**
 * @InterfaceName PackageInformationService
 * @Description 该接口提供PackageInformation实体类的一些业务方法
 * @author wen_toto
 * @date 2017/8/17
 */
public interface PackageInformationService extends BaseService<PackageInformation, Long>{

    /**
     * @Title sale
     * @Description 该类为根据短信数量和通话分钟数进行促销活动的方法
     * @author wen_toto
     * @date 2017/8/21
     * @param messageNumber 短信数量
     * @param minuteNumber 通话分钟数
     * @return
     */
    public boolean sale(Integer messageNumber, Integer minuteNumber);

    /**
     * @Title sale
     * @Description 根据套餐的彩铃及月租来销售套餐
     * @author wen_toto
     * @date 2017/8/22
     * @param isColorBack 彩铃
     * @param monthlyRent 租金
     * @return boolean
     */
    public boolean sale(Boolean isColorBack, Double monthlyRent);

    /**
     * @Title sale
     * @Description 根据套餐所提供的通话分钟数及套餐所赠送的流量数量来进行销售，其中传入的map集合中的key为String类型，
     * 代表分钟数(minuteNumber),代表流量数量(messageNumber), 代表月租金额(monthlyRent)
     * @author wen_toto
     * @date 2017/8/22
     * @param map 传入的参数map集合
     * @return boolean
     */
    public boolean sale(Map<String, Object> map);
}
