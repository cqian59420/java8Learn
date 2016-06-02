/**
 * qizhi 学习
 * 2016-5-28 18:40:22
 *
 */
package consumer;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import lambda.Student;

/**
 * 感受下有什么不同
 * @author qizhi
 */
public class ConsumerTest {
    
    public static void main(String[] args) {
        
        final Student student1 = new Student("Ram", 20,"male");
        final Student student2 = new Student("Shyam", 22,"male");
        final Student student3 = new Student("Kabir", 18,"male");
        
        final ArrayList<Student> userList = Lists.newArrayList(student1,student2,student3);
        
        userList.forEach(student -> System.out.println(student.name));
        userList.forEach(Student::printData);
        userList.forEach(s -> s.printData(s));
        userList.forEach(s -> s.printData2());
        userList.forEach(Student::printData3);

    }
 
    
}
