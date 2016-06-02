package stream;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by qizhi on 2016/5/30.
 */

@Log4j2
public class MatchDemo {

    public static void main(String[] args) {
        Predicate<Employee> p1 = e -> e.id<10 &&e.name.startsWith("A");

        boolean allMatch = Employee.getEmps().stream().allMatch(p1);
        boolean anyMatch = Employee.getEmps().stream().anyMatch(p1);
        boolean noneMatch = Employee.getEmps().stream().noneMatch(p1);

        log.info("allMatch=${?}",allMatch);
        log.info("anyMatch="+anyMatch);
        log.info("noneMatch="+noneMatch);
    }


    @AllArgsConstructor
    static class Employee{

        public int id;
        public String name;

        public int salary;

        static List<Employee> getEmps(){
            ArrayList<Employee> employees = Lists.newArrayList(new Employee(1, "ATerrance", 2000));
            return employees;
        }
    }
}
