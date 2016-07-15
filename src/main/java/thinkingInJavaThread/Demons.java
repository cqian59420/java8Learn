package thinkingInJavaThread;

import java.util.concurrent.TimeUnit;

/**
 * Created by qizhi on 2016/7/11.
 */

public class Demons {

    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(new Deamon());
        thread.setDaemon(true);
        thread.start();
        System.out.println("d is Deamon" + thread.isDaemon());
        TimeUnit.SECONDS.sleep(1);

    }

    private static class Deamon implements Runnable {

        Thread[] threads = new Thread[10];

        @Override
        public void run() {
            for (int i = 0; i < threads.length; i++) {
                threads[i] = new Thread(new DaemonSpawn());
                threads[i].start();
                System.out.println("Daemon" + i + " started");
            }

            for (int i = 0; i < threads.length; i++) {
                System.out.println("thread[" + i + "]  is Daemon" + threads[i].isDaemon());
            }

            while (true) {
                Thread.yield();
            }

        }

        private class DaemonSpawn implements Runnable {

            @Override
            public void run() {
                while (true) {
                    Thread.yield();
                }
            }
        }
    }
}
