package BiConsumerBiFunctonBiPredicate;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.log4j.Log4j2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by qizhi on 2016/5/30.
 */

@Log4j2
public class BiConsumerDemo {


    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = Maps.newHashMap();

        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(3, "C");

        BiConsumer<Integer, String> integerStringBiConsumer = (integer, s) -> log.info(integer + " : " + s);

        hashMap.forEach(integerStringBiConsumer);

    }

}
