package guava.Preconditions;

import com.google.common.base.Preconditions;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;

/**
 * Created by qizhi on 2016/6/2.
 */

@Log4j2
public class ProConditionDemo {

    @Test
    public void checkArgumentTest(){
        Preconditions.checkArgument(1<2,"true");
    }
}
