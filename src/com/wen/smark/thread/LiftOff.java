package com.wen.smark.thread;

/**
 * Created by wen_toto on 2017/8/23.
 */

public class LiftOff implements Runnable {
    protected int countDown = 10; //Default
    private static int taskCount = 0;//task:任务，工作 work number
    private final int id = taskCount++;//将id定义为一个值为1的常量

    public LiftOff(){}

    /**
     * 初始化countDown
     * @param countDown
     */
    public LiftOff(int countDown){
        this.countDown = countDown;
    }

    /**
     * @Title: status
     * @Description:
     * @author: wen_toto
     * @date 2017/8/23
     * @return String
     */
    public String status(){
        return "#"+id+"("+(+countDown>0?countDown:"LiffOff!")+"),";
    }

    @Override
    public void run(){
        while(countDown -- > 0){
            System.out.println(status());
            //Thread累的yield静态方法的作用为将正在执行的线程变为可执行状态（就绪状态）
            //也就是别人所说的线程让步，让出自己cpu的执行时间，让自己或者其他的线程运行
//            Thread.yield();
        }
    }
}
