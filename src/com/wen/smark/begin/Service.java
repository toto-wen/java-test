package com.wen.smark.begin;

import com.wen.smark.entity.Customer;
import com.wen.smark.entity.PackPurInformation;
import com.wen.smark.entity.PackageInformation;

import java.util.List;

/**
 * @ClassName Service
 * @Description 业务类，套餐业务操作的类
 * @author  wen_toto
 * @date 2017/8/16
 */

public class Service {
    /**
     * @Title salesPromotion
     * @Description 创建及设置以短信及通话时间的促销方案
     * @author wen_toto
     * @date 2017/8/16
     * @param messageNumber
     * @param minuteNumber
     * @return PackageInformation
     */
    public PackageInformation salesPromotion(Integer messageNumber, Integer minuteNumber){
        PackageInformation packageInformation = null;
        //判断参数是否正确
        if(messageNumber != null && minuteNumber != null){
            packageInformation = new PackageInformation();
            //设置套餐信息(实际上就是获取套餐信息)
            packageInformation.setMealName("jsjs");
            packageInformation.setId(4L);
            packageInformation.setMessageNumber(messageNumber);
            packageInformation.setMinuteNumber(minuteNumber);
        }
        //返回套餐信息
        return packageInformation;
    }

    /**
     * @Title salesPromotion
     * @Description 根具彩铃和套餐月租的促销方案
     * @author wen_toto
     * @date 2017/8/16
     * @param isColorBack
     * @param monthlyRent
     * @return PackageInformation
     */
    public PackageInformation salesPromotion(Boolean isColorBack, Double monthlyRent){
        PackageInformation packageInformation = null;
        //判断输入信息是否正确
        if(isColorBack != false && monthlyRent != null) {
            packageInformation = new PackageInformation();
            //设置套餐信息
            packageInformation.setMealName("eiie");
            packageInformation.setId(5L);
            packageInformation.setIsColorBack(isColorBack);
            packageInformation.setMonthlyRent(monthlyRent);
        }
        //返回套餐信息
        return packageInformation;
    }

    /**
     * @Title salesPromotionk
     * @Description 根据通话时间、流量、月租设置的套餐优惠方案并返回
     * @author wen_toto
     * @date 2017/8/16
     * @param minuteNumber
     * @param flowNumber
     * @param monthlyRent
     * @return PackageInformation
     */
    public PackageInformation salesPromotion(Integer minuteNumber, Integer flowNumber, Double monthlyRent){
        PackageInformation packageInformation = null;
        //判断输入信息是否正确
        if(minuteNumber != null && flowNumber != null && monthlyRent != null) {
            packageInformation = new PackageInformation();
            //设置套餐信息
            packageInformation.setMealName("sadf");
            packageInformation.setId(6L);
            packageInformation.setMinuteNumber(minuteNumber);
            packageInformation.setFlowNumber(flowNumber);
            packageInformation.setMonthlyRent(monthlyRent);
        }
        //返回套餐信息
        return packageInformation;
    }

    /**
     * @Title addList
     * @Description 用户购买套餐操作
     * @author wen_toto
     * @dete 2017/8/16
     * @param purInformationList
     * @param customer
     * @param packageInformation
     */
    public void addList(List<PackPurInformation> purInformationList, Customer customer,PackageInformation packageInformation){
        //创建两个PackPurInformation对象存储套餐销售信息
        PackPurInformation packPurInformationOne = new PackPurInformation();

        purInformationList.add(packPurInformationOne);

    }
}
