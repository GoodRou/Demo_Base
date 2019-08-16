package javabasic.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName FomatDemo
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/8 15:58
 * @Version 1.0
 **/
public class Fomat {
    /**
     *  y   M   d   H(24    h(12    m   s   S(毫秒
     */
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //日期转字符串
        String today = sf.format(date);
//        System.out.println("today = " + today);
        //字符串转日期
        String todayString = "2019-09-11 16:48:16";
        date = sf.parse(todayString);
//        System.out.println("date = " + date);

        /*
        准备一个长度是9的日期数组
        使用1970年-2000年之间的随机日期初始化该数组
        按照这些日期的时间进行升序排序
        比如 1988-1-21 12:33:22 就会排在 1978-4-21 19:07:23 前面，因为它的时间更小，虽然日期更大
         */
        Date[] dateArr = new Date[9];
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long y2000 = sdf.parse("2000-1-1 00:00:00").getTime();

        for (int i = 0; i < 9; i++) {
            long random = (long) (Math.random()*(y2000+1));
            date = new Date(random);
            //一个1970-2000随机日期
            dateArr[i] = date;
        }

        for (int i = 0; i < dateArr.length - 1; i++) {
            for (int j = 0; j < dateArr.length - 1 - i; j++) {
                if (dateArr[j].compareTo(dateArr[j+1])<0){
                    Date d;
                    d = dateArr[j];
                    dateArr[j] = dateArr[j+1];
                    dateArr[j+1] = d;
                }
            }
        }

        for (Date da : dateArr) {
            System.out.println("da = " + da);
        }
    }

}
