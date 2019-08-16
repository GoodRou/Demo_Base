package javabasic.oop;

import java.util.Date;

/**
 * @ClassName StringBuilderDemo
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/13 8:50
 * @Version 1.0
 **/
public class StringBuilderDemo {
    public static void main(String[] args) {
        //String StringBuilder StringBuffer都是用来处理字符串的
        //都是final类,都不允许被继承
        //String长度不可变,其余俩长度可变
        //StringBuffer线程安全,StringBuilder线程不安全
        /**
         * StringBuilder是5.0新增的
         */
        String s = new Date().toString();
        System.out.println("s = " + s);

    }
}
