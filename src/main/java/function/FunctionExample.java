package function;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Java8的函数API @see http://www.concretepage.com/java/jdk-8/java-8-function-examples
 *
 * Function DoubleFunction ;DoubleToIntFunction;DoubleToIntFunction;DoubleToLongFunction;IntFunction;IntToDoubleFunction;
 * IntToLongFunction;LongFunction;LongToDoubleFunction;LongToIntFunction;ToDoubleBiFunction;ToDoubleFunction;ToIntBiFunction;
 * ToIntFunction;ToLongBiFunction;ToLongFunction
 *
 * Created by qizhi on 2016/5/30.
 */

@Log4j2
public class FunctionExample {

    @Test
    public void testFunction(){
        Function<Integer, String> ob = f1 ->"age:"+f1;

        BiFunction<Integer,Integer,Integer> xx = (f1, f2) -> f1 + f2;

        log.info(ob.apply(20));

        log.info(xx.apply(12,12));

    }
}
