package javabasic.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName Calendar
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/9 9:36
 * @Version 1.0
 **/
public class CalendarDemo {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
//        Calendar与Date进行转换
//        采用单例模式获取日历对象Calendar.getInstance();
        Calendar c = Calendar.getInstance();
//        通过日历对象得到日期对象
        Date d = c.getTime();
        Date d2 = new Date(0);
        c.setTime(d2);
//        System.out.println("d = " + d);
//        System.out.println("d2 = " + d2);
//        翻日历
        Calendar cc = Calendar.getInstance();
        Date now = cc.getTime();
        System.out.println("now = " + sdf.format(cc.getTime()));
//        下个月的今天
        cc.setTime(now);
        cc.add(Calendar.MONTH,1);
        System.out.println("nextMonth = " + sdf.format(cc.getTime()));
//        去年的今天
        cc.setTime(now);
        cc.add(Calendar.YEAR,-1);
        System.out.println("lastYear = " + sdf.format(cc.getTime()));
//        上个月的第三天
        cc.setTime(now);
        cc.add(Calendar.MONTH,-1);
        cc.set(Calendar.DATE,3);
        System.out.println("上个月的第三天 = " + sdf.format(cc.getTime()));

//        找出下个月的倒数第3天是哪天
        Date dd = new Date();
        //当前日期 +2个月 -3天
        System.out.println("dd = " + sdf.format(dd));
        cc.setTime(dd);
        cc.add(Calendar.MONTH,2);
        cc.set(Calendar.DATE,-2);
        System.out.println("sdf.format(cc.getTime()) = " + sdf.format(cc.getTime()));
    }
}
