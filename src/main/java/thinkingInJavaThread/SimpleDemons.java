package thinkingInJavaThread;

import java.util.concurrent.TimeUnit;

/**
 * Created by qizhi on 2016/6/30.
 */

public class SimpleDemons implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread demon = new Thread(new SimpleDemons());
            demon.setDaemon(true);
            demon.start();
        }

        System.out.println("all demons started");
        TimeUnit.MILLISECONDS.sleep(1750);
    }

    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch (Exception e) {
            System.out.println("sleep() interrupted");
        }
    }
}
