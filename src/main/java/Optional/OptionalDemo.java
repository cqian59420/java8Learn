package Optional;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import javax.management.ValueExp;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Created by qizhi on 2016/6/2.
 */

@Log4j2
public class OptionalDemo {

    @Test
    public void fullNull(){
        String s  = "";
        //of不能存放null的值
        Optional<String> s1 = Optional.of(s);
        Optional<String> s2 = Optional.ofNullable(null);

        assertTrue(s1.isPresent());
        assertFalse(s2.isPresent());

    }


    @Test
    public void test(){
        ArrayList<String> arrayList = Lists.newArrayList();
        arrayList.add(0,"A");
        arrayList.add(1,"BC");
        arrayList.add(2,"CD");


        Stream<String> stringStream = arrayList.stream().filter(s -> s.length() > 1);

        Optional<ArrayList<String>> arrayList1 = Optional.of(arrayList);

    }
}
