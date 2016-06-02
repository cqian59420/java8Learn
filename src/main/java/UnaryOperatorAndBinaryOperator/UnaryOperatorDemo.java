package UnaryOperatorAndBinaryOperator;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Created by qizhi on 2016/5/30.
 */


@Log4j2
public class UnaryOperatorDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 40, 30);

        unaryOperationFun(i->i*2,list).forEach(integer -> log.info(integer));

    }


    public static List<Integer> unaryOperationFun(UnaryOperator<Integer> unaryOpt,List<Integer> list){
        List<Integer> uniList = new ArrayList<>();
        list.forEach(i->uniList.add(unaryOpt.apply(i)));
        return uniList;
    }
}
