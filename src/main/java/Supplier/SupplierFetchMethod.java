package Supplier;

import com.google.common.base.Supplier;
import lombok.extern.log4j.Log4j2;

/**
 * Created by qizhi on 2016/5/30.
 */

@Log4j2
public class SupplierFetchMethod {

    public static void main(String[] args) {
        Supplier<String> supplier = Item::getStaticVal;

        String val = supplier.get();

        log.info(val);
    }
}
