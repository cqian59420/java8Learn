/**
 * qizhi 学习
 * 2016-5-28 17:01:16
 *
 */
package predicate;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import javafx.beans.binding.Bindings;
import lambda.Student;

/**
 *
 * @author qizhi
 */
public class PredicateTest {

    public static void main(String[] args) {
//        Predicate<Studenet> maleStudent = s-> s.age>20 &&　"male".equals(s.gender);
        
        Predicate<Student> maleStudent= s -> s.age >= 20 && "male".equals(s.gender);
        Predicate<Student> femaleStudent= s -> s.age >= 20 && "female".equals(s.gender);
        
        Function<Student,String> maleStyle = s-> "hi you are male and age is "+ s.age;
        Function<Student,String> femaleStyle = s-> "hi you are female and age is "+ s.age;
        
        Student s1 = new Student("Long", 21, "male");
        
        if(maleStudent.test(s1)){
            System.out.println(s1.customShow(maleStyle));
        }
    }
    
}
