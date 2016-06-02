/**
 * qizhi 学习
 * 2016-5-28 16:28:16
 *
 */
package lambda;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author qizhi
 */
public class AddInterfaceTest {
    
    /**
     *
     */
    @Test
    public void AddInterfaceTest() {
        ADD add = (int a,int b) -> a+b;
        int sum = add.add(4, 5);
        Assert.assertTrue(9==sum);
        
    }
    
}
