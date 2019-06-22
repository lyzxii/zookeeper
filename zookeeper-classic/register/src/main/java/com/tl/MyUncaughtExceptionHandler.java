package com.tl;

/**
 * @author ：yanpeidong371
 * @description：
 * @date : 2019年06月12日
 * @since: 1.0.0
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("线程名字===="+t.getName());
        System.out.println("捕获异常" + e.toString());
    }

}

