package thinkingInJavaThread;

import java.util.concurrent.TimeUnit;

/**
 * Created by qizhi on 2016/7/11.
 */

public class ThreadVariations {

    public static void main(String[] args) {
        new InnerThread1("InnerThead1");
        new InnerThread2("InnerThread2");
        new InnerRunnable1("InnerRunnable1");
        new InnerRunnable2("InnerRunnable2");
        new ThreadMethod("ThreadMethod").runTask();
    }


    private static class InnerThread1 {

        private int countDown = 5;
        private Inner inner;


        public InnerThread1(String name) {
            inner = new Inner(name);
        }

        private class Inner extends Thread {
            Inner(String name) {
                super(name);
                start();
            }


            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.println(this);
                        if (--countDown == 0) {
                            return;
                        }
                        sleep(10);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
            }
        }
    }


    //使用匿名内部类
    private static class InnerThread2 {
        private Thread t;
        private int countDown = 5;


        public InnerThread2(String name) {
            t = new Thread(name) {

                @Override
                public void run() {
                    try {
                        while (true) {
                            System.out.println(this);
                            if (--countDown == 0) {
                                return;
                            }
                            sleep(5);
                        }
                    } catch (InterruptedException e) {
                        System.out.println("sleep is interrupted");
                    }
                }

                @Override
                public String toString() {
                    return getName() + ":" + countDown;
                }
            };

            t.start();
        }

    }

    private static class InnerRunnable1 {
        private int countDown = 5;
        private Inner inner;


        public InnerRunnable1(String name) {
            inner = new Inner(name);

        }

        private class Inner implements Runnable {
            Thread t;


            public Inner(String name) {
                t = new Thread(this, name);
                t.start();
            }

            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.println(this);
                        if (--countDown == 0) {
                            return;
                        }
                        TimeUnit.SECONDS.sleep(5);

                    }
                } catch (InterruptedException e) {
                    System.out.println("sleep() is interrupted");
                }
            }
        }
    }

    private static class InnerRunnable2 {

        private int countDown = 5;

        private Thread t;

        public InnerRunnable2(String name) {
            t = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            System.out.println(this);
                            if (--countDown == 0) {
                                return;
                            }
                            TimeUnit.SECONDS.sleep(5);
                        }
                    } catch (InterruptedException e) {
                        System.out.println("sleep() is interrupted");
                    }
                }

                @Override
                public String toString() {
                    return Thread.currentThread().getName() + " :" + countDown;
                }
            }, name);
            t.start();
        }
    }

    private static class ThreadMethod {

        private int countDown = 5;
        private Thread t;
        private String name;

        public ThreadMethod(String name) {
            this.name = name;
        }


        public void runTask() {
            if (t == null) {
                t = new Thread(name) {
                    @Override
                    public void run() {
                        try {
                            while (true) {
                                System.out.println(this);
                                if (--countDown == 0) return;
                                sleep(10);
                            }
                        } catch (InterruptedException e) {
                            System.out.println("sleep() is interrupted");
                        }
                    }

                    @Override
                    public String toString() {
                        return getName() + " : " + countDown;
                    }
                };
                t.start();
            }
        }
    }
}
