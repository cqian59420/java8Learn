package filterAndMap;

import com.google.common.collect.Lists;
import lombok.extern.log4j.Log4j2;
import parallelAndStream.ParallerlStreamDemo;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by qizhi on 2016/5/30.
 */

@Log4j2
public class FilterDemo {

    public static void main(String[] args) {
        ArrayList<Object> list = Lists.newArrayList();

        list.stream().filter(o -> o.toString()!="").forEach(o -> log.info(o.hashCode()));


        // stream.map is used to transform one stream into another stream on a basic lambda function
        Stream<Object> anotherStream = list.stream().map(o -> new Object());
    }
}
