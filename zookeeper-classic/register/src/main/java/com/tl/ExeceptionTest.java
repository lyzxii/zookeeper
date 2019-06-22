package com.tl;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ：yanpeidong371
 * @description：
 * @date : 2019年06月12日
 * @since: 1.0.0
 */
public class ExeceptionTest implements Callable {

    @Override
    public Object call() throws Exception {
        return new RuntimeException("抛异常");
    }

    public static void main(String[] args){
        //创建线程池 指定线程池创建线程的 ThreadFactory 并设置线程名字
        ExecutorService service = Executors.newCachedThreadPool(new HandlerThreadFactory());
        service.submit(new ExeceptionTest());
        System.out.println("finsh");
    }

}
