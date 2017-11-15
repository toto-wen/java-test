package com.wen.smark.serviceimpl;

import com.wen.smark.entity.PackageInformation;
import com.wen.smark.service.PackageInformationService;

import java.util.Map;

/**
 * Created by wen_toto on 2017/8/25.
 */

public class PackageInformationImpService extends BaseImpService<PackageInformation, Long> implements PackageInformationService {

    /**
     * @Title: sale
     * @Description: 根据套餐的短信数量及拨打电话的免费分钟数来进行销售
     * @author wen_toto
     * @date 2017/8/25
     * @param messageNumber 短信数量
     * @param minuteNumber 通话分钟数
     * @return boolean
     */
    @Override
    public boolean sale(Integer messageNumber, Integer minuteNumber) {
        return false;
    }

    /**
     * @Title: sale
     * @Description: 通过套餐的彩铃和租金来进行销售活动
     * @author wen_toto
     * @date 2017/8/25
     * @param isColorBack 彩铃
     * @param monthlyRent 租金
     * @return boolean
     */
    @Override
    public boolean sale(Boolean isColorBack, Double monthlyRent) {
        return false;
    }

    /**
     * @Title: sale
     * @Description: 根据套餐所提供的通话分钟数及套餐所赠送的流量数量来进行销售，其中传入的map集合中的key为String类型，
     * 代表分钟数(minuteNumber),代表流量数量(messageNumber), 代表月租金额(monthlyRent)
     * @author wen_toto
     * @date 2017/8/25
     * @param map 传入的参数值集合
     * @return
     */
    @Override
    public boolean sale(Map<String, Object> map) {
        //获取传入的电话分钟数参数
        Integer minuteNumber = (Integer) map.get("minuteNumber");
        //获取传入的短信数量参数
        Integer messageNumber = (Integer) map.get("messageNumber");
        //获取传入的月租金额参数
        Double monthlyRent = (Double) map.get("monthlyRent");

        System.out.println(map);

        return false;
    }


}
