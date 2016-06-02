package java8DateApi;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * Created by qizhi on 2016/5/30.
 */

public class Durationdemo {

    public static void main(String[] args) {
        Duration duration = Duration.of(2, ChronoUnit.DAYS);

        System.out.println(duration.getSeconds());
    }
}
