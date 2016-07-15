package thinkingInJavaThread.share;

/**
 * Created by qizhi on 2016/7/15.
 */

public class EventGenerator extends InitGenerator {
    private int currentEvent = 0;

    public static void main(String[] args) {
        EventChecker.test(new EventGenerator());

    }

    @Override
    public int next() {
        ++currentEvent;
        ++currentEvent;
        return currentEvent;
    }

}
