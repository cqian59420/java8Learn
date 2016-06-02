package Supplier;

import com.google.common.base.Supplier;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;

/**
 * Created by qizhi on 2016/5/30.
 */

@Log4j2
public class DataSupplier {

    @Test
    public void testBooleanSuppiler(){
        Item item = new Item(true, 123);
        BooleanSupplier getStatus = item::getStatus;
         IntSupplier intSupplier= item::getVal;
        log.info(getStatus.getAsBoolean());
        log.info(intSupplier.getAsInt());


        //LongSupplier DoubleSupplier
    }


    @AllArgsConstructor
    @Getter
    class Item{
        private Boolean status;
        private Integer val;

    }

}

