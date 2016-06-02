package clockAndInject;

import java.time.Clock;
import java.time.LocalDate;

/**
 * Created by qizhi on 2016/5/30.
 */

public class ProcessClock implements IProcessClock {

    private Clock clock;

    public ProcessClock(Clock clock) {
        this.clock = clock;
    }

    @Override
    public void process(LocalDate localDate) {
        if (localDate.isEqual(LocalDate.now(clock))) {
            System.out.println(clock.getZone());
        } else {
            System.out.println("Does not Match");
        }
    }
}
