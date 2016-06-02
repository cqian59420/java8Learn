package Optional;

import java.util.Optional;

/**
 * Created by qizhi on 2016/5/30.
 */

public class OptionDemoTwo {

    public static void main(String[] args) {
        Optional<PrimeMinister> primeMinister = Optional.of(new PrimeMinister("Terrance"));

        Optional<Country> country = Optional.of(new Country(primeMinister));

        Optional<Person> person = Optional.of(new Person(country));

        String pmName = person.flatMap(Person::getCountry).flatMap(Country::getPrimeMinister).map(PrimeMinister::getName).orElse("None");

        System.out.println(pmName);
    }
}
