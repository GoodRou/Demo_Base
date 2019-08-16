package javabasic.number;

/**
 * @ClassName TestNumber
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/8 10:41
 * @Version 1.0
 **/
public class Number {
    public static void main(String[] args) {
        int i1 = 1;
        Integer ii = new Integer(i1);//基本类型转封装类型
        System.out.println(ii instanceof java.lang.Number);

        int i2 = ii.intValue();//封装类型转基本类型

        /*
        基本类型和封装类型互转有什么用?
         */

        Integer iii = i1;//自动装箱
        int i4 = ii;//自动拆箱

        //Integer封装的方法
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        /*
        1. 对byte,short,float,double进行自动拆箱和自动装箱
        2. byte和Integer之间能否进行自动拆箱和自动装箱
        3. 通过Byte获取byte的最大值
         */

        byte b1 = 'b';
        char c1 = 'c';
        short s1 = 's';
        float f1 = 3.10f;
        double d1 = 6.17d;

        //自动装箱
        Byte bb1 = b1;
        Character cc1 = c1;
        Short ss1 = s1;
        Float ff1 = f1;
        Double dd1 = d1;
        //自动拆箱
        byte b11 = bb1;
        char c11 = cc1;
        short s11 = ss1;
        float f11 = ff1;
        double d11 = dd1;
        System.out.println(b11+"-"+c11+"-"+s11+"-"+f11+"-"+d11);

        char num1 = 'a';
//        System.out.println("num1 = " + num1);

        String name = new String("rr");
//        System.out.println("name="+name);


        String s = "1000";
        System.out.println(Integer.parseInt(s,2));
    }
}
