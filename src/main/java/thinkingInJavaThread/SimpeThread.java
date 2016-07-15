package thinkingInJavaThread;

/**
 * Created by qizhi on 2016/7/11.
 */

public class SimpeThread extends Thread {
    private static int threadCount = 0;
    private int countDown = 5;

    public SimpeThread() {
        super(Integer.toString(++threadCount));
        start();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new SimpeThread();
        }
    }

    @Override
    public String toString() {
        return "#" + getName() + "(" + countDown + ")";
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(this);
            if (--countDown == 0) {
                return;
            }
        }
    }
}
