/**
 * qizhi 学习
 * 2016-5-28 16:08:42
 *
 */
package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 *
 * @author qizhi
 */
public class StudenetTest {
    
    private Logger log = LogManager.getLogger(StudenetTest.class);
    /**
     * Test of customShow method, of class Student.
     */
    @Test
    public void testCustomShow() {
        Student student1 = new Student("Li", 25,"male");
        Student student2 = new Student("Zhao", 25, "male");
        Student student3 = new Student("Wang", 25, "male");
        
        List<Student> list = new ArrayList<>();
        
        for(Student st : list){
            log.info(st.customShow(s -> s.name+":"+s.age));
            System.out.println(st.customShow(s -> s.name+":"+s.age));
        }
                
    }
    
}
