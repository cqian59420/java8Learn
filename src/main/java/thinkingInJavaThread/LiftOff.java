package thinkingInJavaThread;

/**
 * Created by qizhi on 2016/6/25.
 */

public class LiftOff implements Runnable {

    private static int taskCount = 0;
    public final int id = taskCount++;
    protected int countDown = 10;

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public LiftOff() {
    }

    public static void main(String[] args) {
        LiftOff liftOff = new LiftOff(50);
        LiftOff liftOff_2 = new LiftOff(50);
        new Thread(liftOff).start();
        new Thread(liftOff_2).start();
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + ").";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            Thread.yield();
        }
    }
}
