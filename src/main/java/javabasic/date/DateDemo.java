package javabasic.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @ClassName DateDemo
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/8 14:29
 * @Version 1.0
 **/
public class DateDemo {
    /*
    0在java的日期中代表时间原点,1970年1月1日 8:00 ,
    因为1969年发布了第一个unix版本,之后的时间每过1毫秒就+1
     */
    public static void main(String[] args) throws ParseException {
        java.util.Date zero = new java.util.Date(0);
//        System.out.println("当前时间getTime的返回值是:"+date.getTime());
//        System.out.println("用0作为返回值是:"+zero);
//        System.out.println(System.currentTimeMillis());

//        借助随机数，创建一个从1995.1.1 00:00:00 到 1995.12.31 23:59:59 之间的随机日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date date = new java.util.Date();
        java.util.Date date2 = date;
        date = sdf.parse("1995-1-1 00:00:00");
        date2 = sdf.parse("1995-12-31 00:00:00");

        long l = date2.getTime() - date.getTime();  //1月1日 - 12月31日 相差的Long值
        long r = (long) (Math.random()*(l+1));  //1月1日 - 12月31日 随机的long值
//        System.out.println(r);
//        System.out.println("1995年的第一天: " + date);
//        System.out.println("1995年的最后一天: " + date2);
//        System.out.println("1995年的随机一个时间: " + new java.util.Date(r+date.getTime()));  //初始的long+相差的long


    }
}
