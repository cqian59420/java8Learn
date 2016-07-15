package thinkingInJavaThread.share;

/**
 * Created by qizhi on 2016/7/15.
 */

public class SynchronizedEventGenerator extends InitGenerator {
    private int currentEvenValue;


    @Override
    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }
}
