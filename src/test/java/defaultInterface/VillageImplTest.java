/**
 * qizhi 学习
 * 2016-5-28 16:46:55
 *
 */
package defaultInterface;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author qizhi
 */
public class VillageImplTest {
    
    public VillageImplTest() {
    }

    @Test
    public void testSomeMethod() {
        VillageImpl villageImpl = new VillageImpl();
        
        //Assert.assertEquals("Farming", villageImpl.getBusinessType()); 
        Assert.assertEquals(Village.getVillageId(), villageImpl.getVillageId()); 
    }
    
}
