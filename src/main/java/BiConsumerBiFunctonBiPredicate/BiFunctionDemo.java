package BiConsumerBiFunctonBiPredicate;

import lombok.extern.log4j.Log4j2;

import java.util.function.BiFunction;

/**
 * Created by qizhi on 2016/5/30.
 */
@Log4j2
public class BiFunctionDemo {

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction = (num1, num2) -> num1 + num2;

        log.info(biFunction.apply(12, 22));
    }
}
