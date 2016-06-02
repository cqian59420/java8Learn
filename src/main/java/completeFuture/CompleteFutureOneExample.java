package completeFuture;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Created by qizhi on 2016/5/31.
 */


@Log4j2
public class CompleteFutureOneExample {

    @Test
    public void testCompeteFutureOne(){
        List<Integer> list = Arrays.asList(10, 20, 30, 40);

        list.stream().map(data -> CompletableFuture.supplyAsync(() -> getNum(data))).map(compFuture -> compFuture.thenApply(n -> n*n)).map(t->t.join()).forEach(s->log.info(s));

    }

    /**
     * 测试thenAccept
     */
    @Test
    public void testCompeteFutureTwo(){
        List<String> list = Arrays.asList("10", "20", "30", "40");

        list.stream().map(data -> CompletableFuture.supplyAsync(() -> "Processing:"+data)).map(compFuture -> compFuture.thenAccept(S -> log.info(S))).map(t->t.join()).count();

    }


    /**
     * 测试whenComplete
     */
    @Test
    public void testCompeteFuture3(){
        List<String> list = Arrays.asList("10", "20", "30", "40");

        list.stream().map(data -> CompletableFuture.supplyAsync(() -> data + data)).map(compFuture -> compFuture.whenComplete((result, error) -> log.info(result + " error " + error))).count();

    }

    /**
     * 测试getNow
     */
    @Test
    public void testCompeteFuture4(){
        List<String> list = Arrays.asList("A", "B", "C", "D");

        list.stream().map(data -> CompletableFuture.supplyAsync(() -> data + data)).map(compFuture -> compFuture.getNow("Not null")).forEach(s ->log.info(s));

    }

    private static int getNum(Integer data) {
        return data * data;
    }
}
