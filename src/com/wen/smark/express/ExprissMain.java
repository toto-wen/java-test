package com.wen.smark.express;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @ClassName ExprssMain
 * @Description 主程序运行入口
 * @author wen_toto
 * @date 2017/8/13
 */

public class ExprissMain {
    /**
     * @Title main
     * @Description 主程序入口方法
     * @author wen_toto
     * @date 2017/8/13
     */

    public static void main(String[] args)throws ParseException{
        int i = 2;
        if(i < 2){
            System.out.println("laiba");
        }else {
            System.out.println("bulai");
        }

        ExpressThing[] expressThings = new ExpressThing[3];
        //第一条数据
        expressThings[0] = new ExpressThing();
        expressThings[0].setCommodity_name("红糖");
        expressThings[0].setDelivery_address("天府3街大马路");
        expressThings[0].setConsignee("马大哈");
        expressThings[0].setConsignee_telephone_card(18696366699L);
        expressThings[0].setSend_time(new SimpleDateFormat("yyyy-MM-dd").parse("2017-8-11"));
        expressThings[0].setValue_amount(12.50D);
        expressThings[0].setExpress_status("未收件");
        expressThings[0].setReceipt_time(null);

        //第二条数据
        expressThings[1] = new ExpressThing();
        expressThings[1].setCommodity_name("冰糖");
        expressThings[1].setDelivery_address("天府3街大马路中路");
        expressThings[1].setConsignee("马二哈");
        expressThings[1].setConsignee_telephone_card(18696364569L);
        expressThings[1].setSend_time(new SimpleDateFormat("yyyy-MM-dd").parse("2017-8-11"));
        expressThings[1].setValue_amount(20.520D);
        expressThings[1].setExpress_status("未收件");
        expressThings[1].setReceipt_time(null);

        //第三条数据
        expressThings[2] = new ExpressThing();
        expressThings[2].setCommodity_name("TNT烈性炸药");
        expressThings[2].setDelivery_address("某个山卡卡里头");
        expressThings[2].setConsignee("国防部长");
        expressThings[2].setConsignee_telephone_card(11011001100L);
        expressThings[2].setSend_time(new SimpleDateFormat("yyyy-MM-dd").parse("2017-8-11"));
        expressThings[2].setValue_amount(30.00D);
        expressThings[2].setExpress_status("未收件");
        expressThings[2].setReceipt_time(null);

        //创建第一个快递员
        ExpressMan expressManOne = new ExpressMan();
        expressManOne.setName("顺丰-三毛");
        expressManOne.setAge(25);
        expressManOne.setEducation("博士");
        expressManOne.setSex("男");
        expressManOne.setHeight(163.5f);
        expressManOne.setId_card(230123197403182211L);
        expressManOne.setTelephone_card(15125368969L);

        //创建第二个快递员
        ExpressMan expressManTwo = new ExpressMan();
        expressManTwo.setName("申通-三毛");
        expressManTwo.setAge(24);
        expressManTwo.setEducation("博士后");
        expressManTwo.setSex("男");
        expressManTwo.setHeight(255.5f);
        expressManTwo.setId_card(230123197403182211L);
        expressManTwo.setTelephone_card(15125368969L);

        //创建第三个快递员
        ExpressMan expressManThree = new ExpressMan();
        expressManThree.setName("邮政-三毛");
        expressManThree.setAge(26);
        expressManThree.setEducation("海龟");
        expressManThree.setSex("男");
        expressManThree.setHeight(300.5f);
        expressManThree.setId_card(230123197403182211L);
        expressManThree.setTelephone_card(15125368969L);

        expressManThree.setExpressThings(expressThings);
//        for(int i = 0; i < 10; i ++){
//            System.out.println((int)(Math.random()*3));
//        }

       if(Tools.UpStatusAndReceipt_time(expressManThree, expressThings[(int)(Math.random()*3)])){
           System.out.println("一个快递已成功被接收！！！以下为接收后的物品信息:");

       }
        //输出相应的快递物品信息
        Tools.PrintPassage(expressThings);
        //剔除已修改的物品
        //转换为List集合
        List<ExpressThing> listOld = Arrays.asList(expressThings);
        //新的List集合
        List<ExpressThing> listNew = new ArrayList<ExpressThing>();
        //将未收件添加入listNew中
        for(ExpressThing exs: listOld){
            if(exs.getExpress_status() != null && exs.getExpress_status().equals("未收件")){
                listNew.add(exs);
            }
        }
        //listNew.toArray返回的是Object类型的数组不能强制转换，解决办法为1，在循环Object数组时强制转换对象类型。
        //2.如下代码所示指定该数组类型
        ExpressThing[] expressThings1 = listNew.toArray(expressThings);
        //输出剔除已接收数据后的信息
        System.out.println("剔除已接收数据后的信息显示：");
        Tools.PrintPassage(expressThings1);

        //计算未收件的价值总金额
        double Number = 0.0d;
        for(ExpressThing expressThing: expressThings1){
            Number += expressThing.getValue_amount().doubleValue();
        }
        //输出价格
        System.out.println("总价格："+Number);
        Tools.canwas_picture();


//        Date date = Tools.getCurrentDate();
//
//        if(date != null){
//            System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date)+" "+"全年第"+Tools.getWeekYear(date)+"周"+Tools.getDay_week(date));
//        }else {
//            System.out.println("没有取得date信息");
//        }



       /*
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = dateFormat.parse("2017-08-12");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        calendar.setTime(date);

        int day_week = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(day_week);
        */

        testCalendar();
    }

    /**
     * 首席Calendar日历类的测试方法
     */
    public static void testCalendar(){
        /**
         * 获取Calendar实例
         */
        Calendar calendar = Calendar.getInstance();
        /**
         * 设置日期格式
         */
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        /**
         * 设置当前时间
         */
        calendar.setTime(new Date());
        /**
         * 获取当前时间的String类型
         */
        String string = dateFormat.format(calendar.getTime());
        /**
         * 获取年份
         */
        int years = calendar.get(Calendar.YEAR);
        /**
         * 获取全年月份
         */
        int month = calendar.get(Calendar.MONTH);
        /**
         * 获取全年第几周
         */
        int years_week = calendar.get(Calendar.WEEK_OF_YEAR);
        /**
         * 获取本月第几周
         */
        int Month_week = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        /**
         * 获取本周星期的数值代表
         */
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        /**
         * 获取本周是星期几
         */
        String s = calendar.getCalendarType();
        System.out.println(s);
        //calendar.getDisplayName();
        System.out.println(string +"yars: "+years+"month: "+month+"week_of_year: " +
                ""+years_week+"week_of_month: "+Month_week+"week: "+week);
    }
}
