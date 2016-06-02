import com.google.common.collect.Lists;
import parallelAndStream.ParallerlStreamDemo;

import java.util.ArrayList;

/**
 * Created by qizhi on 2016/5/30.
 */

public class iteratorDemo {

    public static void main(String[] args) {
        ArrayList<ParallerlStreamDemo.Employee> employees = Lists.newArrayList(new ParallerlStreamDemo.Employee(1, "Tom", 30), new ParallerlStreamDemo.Employee(2, "Tom2", 300), new ParallerlStreamDemo.Employee(3, "Tom3", 3000));

        employees.forEach(e -> e.salary=e.salary*2);

        employees.forEach(e -> System.out.println(e.salary+" : "+e.name));
    }
}
