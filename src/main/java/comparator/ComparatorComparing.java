package comparator;

import com.google.common.collect.Lists;
import lambda.Student;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * comparator thenComparing
 *
 *
 *
 * Created by qizhi on 2016/5/31.
 */

@Log4j2
public class ComparatorComparing {

    @Test
    public void testComparator(){
        List<Student> students = Lists.newArrayList(new Student("Alin", 32, "A"), new Student("Sum", 22, "B"));

        Comparator<Student> ageComparator = Comparator.comparing(Student::getAge);
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

        List<Student> collect = students.stream().sorted(ageComparator).collect(Collectors.toList());

        collect.forEach(s -> log.info(s));

        Collections.sort(students,ageComparator.thenComparing(nameComparator));


        List<Model> lists = Lists.newArrayList();
//        Collections.sort(lists,Comparator.naturalOrder());
//        Collections.sort(lists,Comparator.reverseOrder());
    }

    class Model{

    }
}
