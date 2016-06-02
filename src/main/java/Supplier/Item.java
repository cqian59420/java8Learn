package Supplier;

import lombok.*;
import lombok.extern.log4j.Log4j2;

/**
 * Created by qizhi on 2016/5/30.
 */

@NoArgsConstructor
@AllArgsConstructor
@Log4j2
public class Item {

    @Setter
    @Getter
    private String name;

    public static String getStaticVal(){
        return "static val";
    }

    public String getMsg(){
        return "Hello world";
    }



}
