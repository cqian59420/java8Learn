package DoubleSummaryStatisticsAndIntSummaryStatistics;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;

/**
 * Created by qizhi on 2016/5/30.
 */

public class DoubleSummaryStatisticsDemo {

    public static void main(String[] args) {
        DoubleSummaryStatistics dblSumStat = new DoubleSummaryStatistics();
        dblSumStat.accept(123.34);
        dblSumStat.accept(100.25);
        dblSumStat.accept(20.55);
        dblSumStat.accept(323.84);
        dblSumStat.accept(67.14);
        //Find the average
        System.out.println("Average:"+dblSumStat.getAverage());
        //Find maximum
        System.out.println("Maximum:"+dblSumStat.getMax());
        //Find minimum
        System.out.println("Minimum:"+dblSumStat.getMin());
        //Find Sum
        System.out.println("Sum:"+dblSumStat.getSum());
        //Find count
        System.out.println("Count:"+dblSumStat.getCount());


        DoubleSummaryStatistics dblSumStatOne = new DoubleSummaryStatistics();
        dblSumStatOne.accept(123.34);
        dblSumStatOne.accept(100.25);
        dblSumStatOne.accept(20.55);
        //Find the average
        System.out.println("Average:"+dblSumStatOne.getAverage());
        //Find count
        System.out.println("Count:"+dblSumStatOne.getCount());
        DoubleSummaryStatistics dblSumStatTwo = new DoubleSummaryStatistics();
        dblSumStatTwo.accept(323.84);
        dblSumStatTwo.accept(67.14);
        // Combine another DoubleSummaryStatistics
        dblSumStatOne.combine(dblSumStatTwo);
        System.out.println("Average and Count after combining second DoubleSummaryStatistics");
        //Average after combining second DoubleSummaryStatistics
        System.out.println("Average:"+dblSumStatOne.getAverage());
        //Count after combining second DoubleSummaryStatistics
        System.out.println("Count:"+dblSumStatOne.getCount());



        IntSummaryStatistics intSumStatOne = new IntSummaryStatistics();
        intSumStatOne.accept(123);
        intSumStatOne.accept(100);
        intSumStatOne.accept(20);
        //Find the average
        System.out.println("Average:"+intSumStatOne.getAverage());
        //Find count
        System.out.println("Count:"+intSumStatOne.getCount());
        IntSummaryStatistics intSumStatTwo = new IntSummaryStatistics();
        intSumStatTwo.accept(323);
        intSumStatTwo.accept(67);
        // Combine another IntSummaryStatistics
        intSumStatTwo.combine(intSumStatTwo);
        System.out.println("Average and Count after combining second IntSummaryStatistics");
        //Average after combining second IntSummaryStatistics
        System.out.println("Average:"+intSumStatTwo.getAverage());
        //Count after combining second IntSummaryStatistics
        System.out.println("Count:"+intSumStatTwo.getCount());
    }
}
