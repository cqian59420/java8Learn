package parallelAndStream;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.OptionalDouble;

/**
 * Created by qizhi on 2016/5/30.
 *
 * 集合有parallelStream()和　stream() ，分别有并行和串行
 *
 */

public class ParallerlStreamDemo {

    public static void main(String[] args) {
        ArrayList<Employee> employees = Lists.newArrayList(new Employee(1, "A", 2000), new Employee(2, "B", 3000), new Employee(3, "V", 4000));

        OptionalDouble average = employees.parallelStream().filter(employee -> employee.salary > 2000).mapToDouble(employee -> employee.salary).average();

        System.out.println(average.getAsDouble());
    }

    public static class Employee {

        public int id;
        public String name;
        public double salary;

        public Employee(int id, String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
    }
}
