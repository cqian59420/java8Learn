package stream;

import lombok.extern.log4j.Log4j2;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by qizhi on 2016/5/30.
 */

@Log4j2
public class StreamContactCountSortedDistinct {


    List<String> list1;
    List<String> list2;

    @Before
    public void genList(){
        list1 = Arrays.asList("A1", "V2", "A3");
        list2 = Arrays.asList("B1", "B2", "B3");

    }


    @Test
    public  void testContact() {
        Stream<String> concat = Stream.concat(list1.stream(), list2.stream());
        concat.forEach(o -> log.info(o));
    }


    @Test
    public void testStreamCount(){
        log.info(list1.stream().count());
    }

    @Test
    public void testStreamSort(){
        list1.stream().sorted(String::compareTo).forEach(s -> log.info(s));
    }
    @Test
    public void testStreamDistinct(){
        list1.stream().distinct().forEach(s -> log.info(s));
    }

    @Test
    public void testPeek(){
//        Stream.of("A","B","V").peek(s -> log.info(s+"1")).forEach(s -> log.info(s));
        Stream.of("A","B","V").peek(s -> log.info(s+"1")).collect(Collectors.toList());
    }

}
