//package com.tl;
//
//import java.util.concurrent.ThreadPoolExecutor;
//
///**
// * @author ：yanpeidong371
// * @description：
// * @date : 2019年06月13日
// * @since: 1.0.0
// */
//public class OrderExceptionThreadExecutor extends ThreadPoolExecutor {
//
//    private OrderService orderService;
//
//    public OrderExceptionThreadExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
//        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
//        init();
//    }
//
//    public OrderExceptionThreadExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory) {
//        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory);
//        init();
//    }
//
//    public OrderExceptionThreadExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler) {
//        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, handler);
//        init();
//    }
//
//    public OrderExceptionThreadExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler) {
//        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler);
//        init();
//    }
//
//    private void init() {
//        this.orderService = new OrderService();
//        new Cache
//    }
//
//    @Override
//    protected void afterExecute(Runnable r, Throwable t) {
//        super.afterExecute(r, t);
////        Future<?> f = (Future<?>) r;
//        try {
//            f.get();
//        } catch (InterruptedException e) {
//            logger.error("线程池中发现异常，被中断", e);
//        } catch (ExecutionException e) {
//            logger.error("线程池中发现异常，被中断", e);
//        }
//
//    }
//}
//
