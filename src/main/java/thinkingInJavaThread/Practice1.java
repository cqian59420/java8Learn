package thinkingInJavaThread;

import static java.lang.Thread.yield;

/**
 * Created by qizhi on 2016/6/27.
 */

public class Practice1 {

}


class worker implements Runnable {

    @Override
    public void run() {
        System.out.println("haha");
        yield();
        yield();
        yield();
    }
}
