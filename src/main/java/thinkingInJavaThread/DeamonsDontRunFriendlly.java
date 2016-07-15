package thinkingInJavaThread;

import java.util.concurrent.TimeUnit;

/**
 * Created by qizhi on 2016/7/11.
 */

public class DeamonsDontRunFriendlly {

    public static void main(String[] args) {
        Thread thread = new Thread(new ADaemon());
        thread.setDaemon(true);
        thread.start();
    }

    private static class ADaemon implements Runnable {
        @Override
        public void run() {
            System.out.println("starting DaemonThread");

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("通过异常退出程序 ");
            } finally {
                System.out.println("this should always run?");
            }
        }
    }
}
