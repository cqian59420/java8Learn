package thinkingInJavaThread;

/**
 * Created by qizhi on 2016/7/13.
 */

public class Joining {
    public static void main(String[] args) {
        Sleeper sleepy = new Sleeper("Sleepy", 1500),
                grumpy = new Sleeper("Grumpy", 1500);
        Joiner dopey = new Joiner("Dopey", sleepy),
                doc = new Joiner("Doc", grumpy);

        grumpy.interrupt();
    }
}


class Joiner extends Thread {

    private Sleeper sleeper;

    public Joiner(String name, Sleeper sleepy) {
        super(name);
        this.sleeper = sleepy;
        start();
    }

    @Override
    public void run() {
        try {
            sleeper.join();
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
        System.out.println(getName() + " join completed");
    }
}

class Sleeper extends Thread {

    private int duration;

    public Sleeper(String name, int sleepTime) {
        super(name);
        duration = sleepTime;
        start();
    }


    @Override
    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName() + "  is interrupted" + " is interrupted " + isInterrupted());
            return;
        }
        System.out.println(getName() + " has awakened");
    }
}