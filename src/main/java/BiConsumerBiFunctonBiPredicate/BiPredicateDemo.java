package BiConsumerBiFunctonBiPredicate;

import lombok.extern.log4j.Log4j2;

import java.util.function.BiPredicate;
import java.util.function.BooleanSupplier;

/**
 * Created by qizhi on 2016/5/30.
 */

@Log4j2
public class BiPredicateDemo {

    public static void main(String[] args) {
        BiPredicate<Integer, Boolean> check = (integer, aBoolean) -> integer > 200 && aBoolean == true;

        log.info(check.test(201,true));
    }
}
