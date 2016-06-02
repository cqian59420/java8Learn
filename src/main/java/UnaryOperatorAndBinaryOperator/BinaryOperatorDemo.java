package UnaryOperatorAndBinaryOperator;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Created by qizhi on 2016/5/30.
 */

@Log4j2
public class BinaryOperatorDemo {

    public static void main(String[] args) {
        HashMap<String,String> map = Maps.newHashMap();
        map.put("X", "A");
        map.put("Y", "B");
        map.put("Z", "C");

        binaryOpratorFun((s1, s2) -> s1 + "_" + s2, map).forEach(x -> log.info(x));

    }

    private static List<String> binaryOpratorFun(BinaryOperator<String> binaryOperator, HashMap<String, String> map) {
        ArrayList<String> list = Lists.newArrayList();
        map.forEach((s, s2) -> list.add(binaryOperator.apply(s,s2)));
        return list;
    }
}
