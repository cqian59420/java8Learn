package StringJoiner;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import java.util.StringJoiner;

/**
 * Created by qizhi on 2016/5/30.
 */

@Log4j2
public class StringJoinDemo {



    @Test
    public void testStringJoin(){
        StringJoiner stringJoiner = new StringJoiner(",");

        stringJoiner.add("Sam").add("terrance");

        log.info(stringJoiner);
    }



    @Test
    public void testStringInnerJoin(){
        log.info( String.join(",","A","B","C").toString());


    }
}
