package Optional;

import java.util.Optional;

/**
 * Created by qizhi on 2016/5/30.
 */

public class OptionifPresent {

    public static void main(String[] args) {
        Optional<PrimeMinister> primeMinister = Optional.of(new PrimeMinister("Terrabce"));

        primeMinister.ifPresent(primeMinister1 -> System.out.println(primeMinister1.getName()));
        System.out.println(primeMinister.isPresent());
    }
}
