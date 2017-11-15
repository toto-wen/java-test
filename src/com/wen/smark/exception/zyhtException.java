package com.wen.smark.exception;

/**
 * @ClassName: zyhtException
 * @Description: 自定义的异常类，用于在service业务中抛出需要抛出的异常
 * @author wen_toto
 * @date 2017/8/22
 */

public class zyhtException extends Exception {
    static final long serialVersionUID = 0L;

    /**
     * @Title: zyhtException
     * @Description: 自定义的异常类的空构造函数
     * @author wen_toto
     * @date 2017/8/22
     */
    public zyhtException(){
        super();
    }

    /**
     * @Title: zyhtException
     * @Description: 定义一个带指定详细信息的异常构造方法
     * @author wen_toto
     * @date 2017/8/22
     * @param message 指定的异常详细信息
     */
    public zyhtException(String message){
        super(message);
    }

    /**
     * @Title: zyhtException
     * @Description: 构造指定详细信息及异常的原因的异常构造方法，其中cause为一个Throwable的类实例
     * @author wen_toto
     * @date 2017/8/22
     * @param message 异常的详细信息
     * @param cause 异常的原因
     */
    public zyhtException(String message, Throwable cause){
        super(message, cause);
    }

    /**
     * @Title: zyhtException
     * @Description: 根据指定的原因来构造异常。
     * @param cause 异常的原因
     */
    public zyhtException(Throwable cause){
        super(cause);
    }
}
