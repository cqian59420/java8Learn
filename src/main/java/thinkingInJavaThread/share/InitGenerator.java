package thinkingInJavaThread.share;

/**
 * Created by qizhi on 2016/7/15.
 */

public abstract class InitGenerator {

    private volatile boolean cancaled = false;

    public abstract int next();

    public void cancel() {
        cancaled = true;
    }

    public boolean isCancaled() {
        return cancaled;
    }
}
