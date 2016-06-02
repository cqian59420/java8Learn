package stream;

import Supplier.Item;
import com.sun.org.apache.xml.internal.utils.StringComparable;
import lombok.extern.log4j.Log4j2;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by qizhi on 2016/5/30.
 */

@Log4j2
public class StreamFindLimitMAXMIN {

    List list1 = Arrays.asList("A", "V", "B");

    @Test
    public void streamFind(){
//        list1.stream().findAny();
        list1.stream().limit(2).findFirst().ifPresent(o -> log.info(o));

        list1.stream().max((o1, o2) -> o1.toString().compareTo(o2.toString()));
    }

    //感受一下区别就知道flatMap的用法
    @Test
    public void flatMap(){
        List list2 = Arrays.asList("M", "M", "M");
        Stream.of(list1,list2).forEach(list -> log.info(list));
        Stream.of(list1,list2).flatMap(list -> list.stream()).forEach(list -> log.info(list));
    }


    @Test
    //无限输出AA。不明所以
    public void streamGenerateTest() {
        Item item = new Item("AA");
        Stream.generate(item::getName).forEach(s -> log.info(s));

    }




}
