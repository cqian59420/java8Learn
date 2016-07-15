package thinkingInJavaThread.share;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by qizhi on 2016/7/15.
 */

public class EventChecker implements Runnable {

    private final int id;
    private InitGenerator generator;

    public EventChecker(int id, InitGenerator generator) {
        this.id = id;
        this.generator = generator;
    }

    public static void main(String[] args) {
        System.out.println("press control c to exit program");
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new EventChecker(i, null));
        }
        executorService.shutdown();
    }

    public static void test(EventGenerator gp) {
        test(gp);
    }

    @Override
    public void run() {
        while (!generator.isCancaled()) {
            int val = generator.next();
            if (val % 2 != 0) {
                System.out.println(val + " is not even");
                generator.cancel();
            }
        }
    }
}
