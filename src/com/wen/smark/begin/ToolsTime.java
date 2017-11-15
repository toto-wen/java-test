package com.wen.smark.begin;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName ToolsTime
 * @Description 时间操作工具类，该类被final修饰，不能被继承，该类只提供一些方法工具且所有方法除构造函数外均为静态方法。使用时不必
 *  创建实例，所以该类的构造方法被定义为私有类型。。。
 * @author wen_toto
 * @date 2017/8/14
 */
public final class ToolsTime {

    private final static String DATEYEAR = "yyyy-MM-dd";
    /**
     * 定义指定时间格式
     */
    private  static SimpleDateFormat simpleDate;
    /**
     * 获取Calendar日历对象
     */
    private static Calendar calendar;
    /**
     * 本类中一到十二月对应的数值为0-11，从零开始算起:
     * 0  -- 一月
     * 1  -- 二月
     * 2  -- 三月
     * 3  -- 四月
     * 4  -- 五月
     * 5  -- 六月
     * 6  -- 七月
     * 7  -- 八月
     * 8  -- 九月
     * 9  -- 十月
     * 10 -- 十一月
     * 11 -- 十二月
     */
    public final static int JANUARY = 0;
    public final static int FEBRUARY = 1;
    public final static int MARCH = 2;
    public final static int APRIL = 3;
    public final static int MAY = 4;
    public final static int JUNE = 5;
    public final static int JULY = 6;
    public final static int AUGUST = 7;
    public final static int SEPTEMBER = 8;
    public final static int OCTOBER = 9;
    public final static int NOVEMBER = 10;
    public final static int DECENBER = 11;

    /**
     * 星期一到星期天的数值表示为:
     * 1 -- 星期天
     * 2 -- 星期一
     * 3 -- 星期二
     * 4 -- 星期三
     * 5 -- 星期四
     * 6 -- 星期五
     * 7 -- 星期六
     */
    public final static int SUNDAY = 1;
    public final static int MONDAY = 2;
    public final static int TUESDAY = 3;
    public final static int WEDNESDAY = 4;
    public final static int THURSDAY = 5;
    public final static int FRIDAY = 6;
    public final static int SATURDAY = 7;

    /**
     * @Title ToolsTime
     * @Description 将该类的构造方法重构为私有方法，不允许在外部创建对象
     * @author wen_toto
     * @date 2017/8/14
     */
    private ToolsTime() {}

    /**
     * @Title initValue
     * @Description 设置Calendar方法的Time,当本类中有日志方法需要使用到初始化方法
     * @author wen_toto
     * @date 2017/8/14
     * @param date
     */
    private static void initValue(Date date) {
        if(date != null) {
            calendar = Calendar.getInstance();
            calendar.setTime(date);
        }else {
            throw new NullPointerException("date的值不能为空") ;
        }

    }

    /**
     * @Title getNewTimeDate
     * @Description 用于将指定的时间按指定的格式类型转换并且返回给调用者
     * @author wen_toto
     * @date 2017/8/14
     * @param date
     * @return String
     */
    public static String getNewTimeDate(Date date, String dateFormat) {
        if(date == null) {
            return null;
        }
        if(dateFormat == null || dateFormat.equals("")) {
            simpleDate = new SimpleDateFormat(ToolsTime.DATEYEAR);
        }else {
            simpleDate = new SimpleDateFormat(dateFormat);
        }
        return simpleDate.format(date);
    }

    /**
     * @Title getDateMonthWeekDayString
     * @Description 获取当前时间的月份周数几星期数
     * @author wen_toto
     * @date 2017/8/14
     * @param date
     * @return String
     */
    public static String getDateMonthWeekDayString(Date date) {
        //初始化
        initValue(date);
        return simpleDate.format(date)+" "+(getDateMonth(date)+1)+"月"+"第"+getWeekOfMonth(date)+"周"+"星期"+getDayOfWeekInMonth(date);
    }

    /**
     * @Title getDateMonth
     * @Description 获取指定时间所在的月份
     * @author wen_toto
     * @date 2017/8/14
     * @param date
     * @return int
     */
    public static int getDateMonth(Date date) {
        //初始化
        initValue(date);
        return calendar.get(Calendar.MONTH);
    }

    /**
     * @Title getWeekOfMonth
     * @Description 获取当前时间所在当前月份的第几周
     * @author wen_toto
     * @date 2017/8/14
     * @param date
     * @return int
     */
    public static int getWeekOfMonth(Date date) {
        //初始化
        initValue(date);
        return calendar.get(Calendar.WEEK_OF_MONTH);
    }

    /**
     * @Title getDayOfWeekInMonth
     * @Description 获取当前时间所在月份的星期几
     * @author wen_toto
     * @date 2017/8/14
     * @param date
     * @return int
     */
    public static int getDayOfWeekInMonth(Date date) {
        //初始化
        initValue(date);
        return calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
    }

    public static int getDayOfMonth(Date date) {
        initValue(date);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * @Title getDatePreviousWeek
     * @Description 该方法用于获取指定时间上星期五的时间方法。
     * @author wen_toto
     * @date 2017/8/14
     * @param date
     * @return Date
     */
    public static Date getDatePreviousWeek(Date date) {
        //初始化
        initValue(date);
        //使用Calendar累的add方法实现对时间date的加减
        calendar.add(Calendar.DATE, -(calendar.get(Calendar.DAY_OF_WEEK) +1));
        return calendar.getTime();
    }

    /**
     * @Title sort
     * @Description 该方法使用选择排序法进行数组的排序
     * @author wen_toto
     * @date 2017/8/15
     * @param intA
     */
    public static void sort(Integer[] intA) {
        int value = 0;
        for(int i = 0; i < intA.length - 1; i ++) {
            int tem = i;
            for(int j = i +1; j < intA.length - 1; j ++) {
                if(intA[i] > intA[j]) {
                    tem = j;
                }
            }
            value = intA[i];
            intA[i] = intA[tem];
            intA[tem] = value;
        }
    }

}
