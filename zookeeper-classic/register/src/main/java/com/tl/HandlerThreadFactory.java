package com.tl;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ：yanpeidong371
 * @description：
 * @date : 2019年06月12日
 * @since: 1.0.0
 */
public class HandlerThreadFactory implements ThreadFactory {
    private final AtomicInteger threadNumber = new AtomicInteger(1);

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread( r,"Thread" + threadNumber.getAndIncrement());
        t.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程名字===="+t.getName());
                System.out.println("捕获异常" + e.toString());
            }
        });
        return t;
    }

}

