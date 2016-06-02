package clockAndInject;

import java.time.Clock;

/**
 * Created by qizhi on 2016/5/30.
 */

public class SystemUTCInjector implements IClockInjector {
    @Override
    public IProcessClock getClockInstance() {
        return new ProcessClock(Clock.systemUTC());
    }
}
