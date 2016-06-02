/**
 * qizhi 学习
 * 2016-5-28
 */
package lambda;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.function.Function;

/**
 * @author qizhi
 */
@Getter
@Setter
@ToString
public class Student {
    public String name;
    public int age;
    public String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String customShow(Function<Student, String> fun) {
        return fun.apply(this);
    }

    public static void printData(Student student) {
        System.out.println("ddwada");
    }

    public void printData2() {

    }

    public void printData3() {

    }
}
