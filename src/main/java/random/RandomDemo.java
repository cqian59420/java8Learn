package random;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by qizhi on 2016/5/31.
 */

@Log4j2
public class RandomDemo {

    private static final List<Integer> VALID_PWD_CHARS = new ArrayList<>();

    static{
        IntStream.rangeClosed('0','9').forEach(VALID_PWD_CHARS::add);
        IntStream.rangeClosed('a','z').forEach(VALID_PWD_CHARS::add);
        IntStream.rangeClosed('A','Z').forEach(VALID_PWD_CHARS::add);
        IntStream.rangeClosed('!','*').forEach(VALID_PWD_CHARS::add);
    }

    @Test
    public void randomTest1() {

        int passwordLength = 8;

        for (int i = 0; i < 5; i++) {
            new Random().ints(passwordLength,0,VALID_PWD_CHARS.size()).map(VALID_PWD_CHARS::get).forEach(s-> System.out.print((char)s));
            System.out.println();
        }

        log.info("------------------------------------");

        for (int i = 0; i < 5; i++) {
            new SecureRandom().ints(passwordLength,0,VALID_PWD_CHARS.size()).map(VALID_PWD_CHARS::get).forEach(s-> System.out.print((char)s));
            System.out.println();
        }
    }
}
