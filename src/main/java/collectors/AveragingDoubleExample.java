package collectors;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * averagingDouble;averagingInt;averagingLong;collectingAndThen;counting;joining;maxBy;minBy;summingInt;summingLong;summingDouble;toList;toSet;toMap;
 *
 * groupingBy;
 *
 * partitioningBy;
 *
 * Created by qizhi on 2016/5/31.
 */

@Log4j2
public class AveragingDoubleExample {

    @Test
    public void testCollectorsAverage(){
        List<Integer> integers = Arrays.asList(2, 4, 5, 67, 4);
        Double collect = integers.stream().collect(Collectors.averagingDouble(Integer::doubleValue));
        Double collect2 = integers.stream().collect(Collectors.averagingDouble(value -> value*2));
        log.info(collect);
        log.info(collect2);
    }

}
