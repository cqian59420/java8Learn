package UnaryOperatorAndBinaryOperator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * Created by qizhi on 2016/5/30.
 */

@Log4j2
public class MaxByMinBy {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Tom", 12, "A"), new Student("Jerry", 22, "B"));

        Comparator<Student> ageComparator = Comparator.comparing(Student::getAge);

        log.info("------------------------- max -----------------------");

        Map<String, Optional<Student>> eldestByClass = students.stream().collect(Collectors.groupingBy(Student::getClassName, Collectors.reducing(BinaryOperator.maxBy(ageComparator))));
        eldestByClass.forEach((k, v) -> log.info("class:"+k+" Age:"+ ((Optional<Student>) v).get().getAge()+" Name:" +((Optional<Student>) v).get().getName()));

    }

    @AllArgsConstructor
    @Getter
    @Setter
    static class Student {
        private String name;
        private Integer age;
        private String className;
    }
}
