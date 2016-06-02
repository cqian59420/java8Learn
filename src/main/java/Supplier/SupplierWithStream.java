package Supplier;

import com.google.common.collect.Lists;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by qizhi on 2016/5/30.
 */

@Log4j2
public class SupplierWithStream {

    public static void main(String[] args) {
        ArrayList<Item> items = Lists.newArrayList(new Item("AA"), new Item("BB"), new Item("CC"));

        Stream<String> names = items.stream().map(Item::getName);
//        Stream<String> names = items.parallelStream().map(Item::getName);

        names.forEach(n -> log.info(n));
    }
}
