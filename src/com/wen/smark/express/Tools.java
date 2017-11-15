package com.wen.smark.express;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

/**
 * @ClassName Tools
 * @Description 该类为处理快递员及快递物品的工具类被final修饰不能被继承。提供快递员及快递物品两个类的一些业务处理方法
 * @author wen_toto
 * @date 2017/8/13
 */

public final class Tools {
    /**
     * 获取Calendar日历对象实例
     */
    private static Calendar calendar = Calendar.getInstance();

    /**
     * 设置日期显示格式
     */
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * @Title initDate
     * @Description 用于初始化数据
     * @author wen_toto
     * @date 2017/8/13
     * @param dateValue
     */
    private static void initDate(Date dateValue){
        if(dateValue != null){
            calendar.setTime(dateValue);
        }else {
            System.out.println("dateValue的值为空！！获取得时间有错误");
        }
    }

    /**
     *@Title Toools
     * @Description Tools类的构造函数，修饰为私有类型，不能被创建实例
     * @author wen_toto
     * @date 2017/8/13
     */
    private Tools(){}

    /**
     * @Title getCurrentDate
     * @Description 该方法用于获取当前的时间
     * @author wen_toto
     * @return Date
     */
    public static Date getCurrentDate(){
        //获取当前日期
        return new Date();
    }

    /**
     * @Title getWeekYear
     * @Description 获取全年第几周
     * @author wen_toto
     * @date 2017/8/13
     * @param dateValue
     * @return Integer
     */
    public static Integer getWeekYear(Date dateValue){
        //初始化Calendar实例的time属性
        initDate(dateValue);

        return calendar.get(Calendar.WEEK_OF_YEAR);
    }

    /**
     * @Title
     * @Description 将获取得星期值1-7转换为星期一-星期天
     * @author wen_toto
     * @data 2017/8/13
     * @param dateValue
     * @return String
     */
    public static String getDay_week(Date dateValue){
        String weekDay = null;
        //如果dateValue为空，则返回无
        if(dateValue != null){
            initDate(dateValue);
            int day_week = calendar.get(Calendar.DAY_OF_WEEK);

            switch(day_week){
                case 1:
                    weekDay = "星期天"; break;
                case 2:
                    weekDay = "星期一"; break;
                case 3:
                    weekDay = "星期二"; break;
                case 4:
                    weekDay = "星期三"; break;
                case 5:
                    weekDay = "星期四"; break;
                case 6:
                    weekDay = "星期五"; break;
                case 7:
                    weekDay = "星期六"; break;
                default:
                    weekDay = "无法获取该值所代表的星期数"; break;
            }
        }else {
            weekDay = "无";
        }

        return weekDay;
    }

    /**
     * @Title UpStatusAndReceipt_time
     * @Description 改变某一快递物品的快递状态（已收件或者未收件）,同事改变物品的收件日期
     * @author wen_toto
     * @date 2017/8/13
     * @param expressMan,expressThing
     * @return boolean
     */
    public static boolean UpStatusAndReceipt_time(ExpressMan expressMan, ExpressThing expressThing){
        //定义及初始化返回值
        boolean result = false;
        //判断是否存在快递员信息
        if(expressMan != null){
            //判断快递物品信息是否存在
            if(expressThing != null){
                //查找是否存在该
                ExpressThing exThing = searchExpressIndex(expressMan.getExpressThings(), expressThing);
                if(exThing != null){
                    //更新快递物品状态为“已收件”
                    exThing.setExpress_status("已收件");
                    //更新快递物品签收时间
                    exThing.setReceipt_time(Tools.getCurrentDate());
                    result = true;
                }else {
                    System.out.println("没有该快递物品信息！！");
                }
            }else {
                System.out.println("缺少需要更新的快递物品信息！！");
            }
        }else {
            System.out.println("没有快递员信息！！");
        }

        return result;
    }

    /**
     * @Title searchExpressIndex
     * @Description 在ExpressThing数组中搜索我们想要的值得下标
     * @author wen_toto
     * @date 2017/8/13
     * @param expressThings,expressThing
     * @return ExpressThing
     */
    private static ExpressThing searchExpressIndex(ExpressThing[] expressThings, ExpressThing expressThing){
        //通过for循环查找我们匹配的ExpressThing对象实例
        for(ExpressThing express: expressThings){
            //找到相应对象后返回该对象，程序终止。
            if(express.equals(expressThing)){
                return express;
            }
        }
        //如果没有找到则返回null，说明没有该类物品信息。。
        return null;
    }

    /**
     *
     */
    public static void PrintPassage(ExpressThing[] expressThings){
        Date dateInput = null;
        for(ExpressThing ex:expressThings) {
            System.out.println("商品名称：" + ex.getCommodity_name());
            System.out.println("收件状态：" + ex.getExpress_status());
            //获取接收日期dateInput
            dateInput = ex.getReceipt_time();
            //判断接收日期是否为空
            if (dateInput != null) {
                //获取接收日期的String类型
                String dateString = new SimpleDateFormat("yyyy-MM-dd").format(dateInput);
                //获取全年第几周
                int weekYear = Tools.getWeekYear(dateInput);
                //获取星期数
                String dayWeek = Tools.getDay_week(dateInput);
                System.out.println("收件日期：" + dateString + " " + "全年第" + weekYear + "周" + dayWeek);
            } else {
                System.out.println("收件日期：暂未被用户接收!!");
            }
        }
    }

    /**
     * @Title canwas_picture
     * @Descript 等腰梯形中画等边三角形
     * @author wen_toto
     * @date 2017/8/13
     */
    public static void canwas_picture(){
        for (int i = 0; i < 2; i++) {
            String ma = "";
            for (int k = 0; k < 6 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i + 2; j++) {
                ma = ma + "* ";
            }
            System.out.println(ma);
        }
        //下部梯形
        for (int i = 0; i < 4; i ++) {
            //左边三角行
            for (int k = 0; k < 4 - i; k++) {
                System.out.print(" ");
            }
            //中间三角形
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            //右边三角行
            for (int j = 0; j < 3 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
