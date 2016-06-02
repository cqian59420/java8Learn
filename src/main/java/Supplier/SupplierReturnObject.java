package Supplier;

import lombok.extern.log4j.Log4j2;

import java.util.function.Supplier;


/**
 * Created by qizhi on 2016/5/30.
 */

@Log4j2
public class SupplierReturnObject {

    public static void main(String[] args) {
        Supplier<Item> supplier = Item::new;

        Item item = supplier.get();

        log.info(item.getMsg());
    }
}
