package javabasic.date;

import java.time.LocalDate;

/**
 * @ClassName LocalDateDemo
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/13 9:29
 * @Version 1.0
 **/
public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate timeNow = LocalDate.now();
        System.out.println("timeNow = " + timeNow);

//        timeNow = LocalDate.of(2012,12,24);
//        System.out.println("timeNow = " + timeNow);

        LocalDate aThousandDaysLater = timeNow.plusDays(-1000);
//        String s = aThousandDaysLater.toString();
//        System.out.println("s = " + s);
        System.out.println("aThousandDaysLater = " + aThousandDaysLater);
    }
}
