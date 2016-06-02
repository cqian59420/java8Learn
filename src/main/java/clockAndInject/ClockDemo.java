package clockAndInject;

import com.google.common.cache.LoadingCache;

import java.time.LocalDate;

/**
 * Created by qizhi on 2016/5/30.
 */

public class ClockDemo {


    public static void main(String[] args) {

        IClockInjector clockInjector = new SystemDefaultZoneInjector();

        IProcessClock processClock = clockInjector.getClockInstance();

        processClock.process(LocalDate.MAX);

        clockInjector = new SystemUTCInjector();

        processClock = clockInjector.getClockInstance();

        processClock.process(LocalDate.now());

    }
}
