package com.wen.smark.begin;

import com.wen.smark.entity.Customer;
import com.wen.smark.entity.PackPurInformation;
import com.wen.smark.entity.PackageInformation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestMain {


    /**
     * @Title main
     * @Description main main main
     * @author wen_toto
     * @date 2017/8/14
     * @param args
     */
    public static void main(String[] args) {
        //创建一个存放套餐购买信息的集合
        List<PackPurInformation> purInformationList = new ArrayList<PackPurInformation>();
        PackageInformation packageinformation = new PackageInformation();

        packageinformation.setId(2L);
        packageinformation.setMealNumber("abcd");
        packageinformation.setMealName("A套餐");
        packageinformation.setMessageNumber(199);
        packageinformation.setMinuteNumber(200);
        packageinformation.setFlowNumber(2);
        packageinformation.setIsCall(false);
        packageinformation.setIsColorBack(true);
        packageinformation.setMonthlyRent(25.d);
        packageinformation.setMealDescribe("买套餐，奔小康");
        packageinformation.setMealStartDate(new Date());
        packageinformation.setMealEndDate(new Date());
        packageinformation.setUnit((byte) 1);

        //创建5个用户
        Customer customerFive = new Customer();
        //设置五个用户的信息
        customerFive.setId(1L);
        customerFive.setName("肖世杰");
        customerFive.setPhoneCode("156286");
        customerFive.setSex((byte) 2);
        customerFive.setIdCard("256214846x4546f");
        customerFive.setAddress("djakljlf");
        customerFive.setBalance(234d);
        customerFive.setPackageInformation(packageinformation);
        customerFive.setIsShutdown(true);
        customerFive.setIsStopArrears(false);
        customerFive.setStarStates((byte) 2);

        System.out.println(customerFive.toString());

        //创建销售平台对象
//        Service service = new Service();
//        //创建套餐对象
//        PackageInformation packageInformation = null;
//
//        //开始推出套餐并向用户推销
//        //A套餐推出
//        if((packageInformation =service.salesPromotion(400, 200)) != null){
//            //第一个用户购买
//           service.addList(purInformationList, customerFive, packageInformation);
//        }
//        for(PackPurInformation packPurInformation: purInformationList){
//
//        }
    }
    /**
     * @Title RoundRun
     * @Description this is round
     * @author wen_toto
     * @date 2017/8/14
     */
    public static void RoundRun() {
        //预先换行三次
        System.out.println();
        System.out.println();
        System.out.println();

        //控制整个外部梯形的高度。
        for(int i = 0, j = 0; i < 15; i ++) {
            //输出空格
            for(j = 0; j < 15 - i; j ++) {
                System.out.print(" ");
            }
            //在5-9行之间打印三角形
            if(i >4 && i < 11 ) {
                //打印左侧实心三角形
                for(j = 0; j < 7 + 2*(i - 5); j ++) {
                    System.out.print("*");
                }
                //打印中间空心三角形
                for(j = 0; j < 11 - 2*(i - 5); j ++) {
                    if(i%2 == 0) {
                        System.out.print("<");
                    }else {
                        System.out.print(">");
                    }
                }
                //打印右侧实心三角形
                for(j = 0; j < 5 + 2*(i - 5); j ++) {
                    System.out.print("*");
                }

            }else {
                //输出梯形部分
                for(j = 0; j < 13+i*2; j ++) {
                    System.out.print("*");
                }
            }
            //换行
            System.out.println();
        }
    }

    public static void printDate() {
        String[] dateStr = {"2017-8-10","2017-8-15","2017-8-20","2017-8-9"};
        int j = (int)(Math.random()*4);
        System.out.println(j);
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr[j]);
            int i = ToolsTime.getDayOfMonth(date);
            System.out.println("DayOfWeekInMonth: "+i);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void Method(Object ... objects) {
        for (Object object : objects) {
            try {
                System.out.println(object.getClass().getName());
                @SuppressWarnings("unused")
                Class<?> cla = Class.forName(object.getClass().getName());
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println(object.getClass());
            System.out.println(object);
        }
    }


}
