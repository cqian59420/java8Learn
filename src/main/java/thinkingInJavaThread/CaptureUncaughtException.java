package thinkingInJavaThread;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by qizhi on 2016/7/13.
 */

public class CaptureUncaughtException {

    @Test
    public void testRun() {
        ExecutorService executorService = Executors.newCachedThreadPool(new HandlerThreadFactory());
        executorService.execute(new ExceptionThread2());
    }

    private static class ExceptionThread2 implements Runnable {
        @Override
        public void run() {
            Thread t = Thread.currentThread();
            System.out.println("run() by" + t);
            System.out.println("eh  = " + t.getUncaughtExceptionHandler());
            throw new RuntimeException();
        }
    }

    private class HandlerThreadFactory implements ThreadFactory {
        @Override
        public Thread newThread(Runnable r) {
            System.out.println(this + "is creating a thread");
            Thread t = new Thread(r);
            System.out.println("created" + t);
            t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
            System.out.println("eh = " + t.getUncaughtExceptionHandler());
            return t;
        }
    }

    class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println("caught " + e);
        }
    }

}
