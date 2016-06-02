package Optional;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

import java.util.Optional;

/**
 * Created by qizhi on 2016/5/30.
 */

@Log4j2
public class OptionalDemoOne {

    public static void main(String[] args) {

        Optional<PrimeMinister> pm = Optional.of(new PrimeMinister());

        String pmName = pm.map(PrimeMinister::getName).orElse("none");

        System.out.println(pmName);
    }
}
