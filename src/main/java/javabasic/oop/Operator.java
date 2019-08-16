package javabasic.oop;

/**
 * @ClassName operator
 *  * @Description TODO
 *  * @Author GOODRR
 *  * @Date 2019/8/9 10:37
 *  * @Version 1.0
 **/
public class Operator {
    public static void main(String[] args) {
        int i = 1;
        int j = ++i + i++ + ++i + i++;// 2 2 +4 +4
        System.out.println("j = " + j);
        int y = 1;
        int g = y++ + ++y;//2 + 2  +3
        System.out.println("g = " + g);

        boolean a = true;
        boolean b = false;
        boolean c = true;
        System.out.println(a^b);
        System.out.println(a^c);

        //^异或 ~取反 <<左移运算符 >>右移运算符   a>>2 a的二进制向右移2位
        int aa = 4;
        int bb = 11;
        int aaa = aa>>>2;
        System.out.println(aaa);
        //15
        //0000 1111
        System.out.println("~15="+~1 );
        /**
         * 原码
         * 反码
         * 补码
         *
         * 正数的反码和补码都是原码本身
         * 负数的补码 符号位不变,其余取反 末尾+1
         * 负数的反码 末尾不+1
         * ~9 01001 取反 10110
         *
         * 二进制在内存中是以补码的形式存放的 正数的补码 是本身 1:0001
         * 计算机计算时 都是以补码的形式计算的
         */
        int i2 = 2<<4;
        System.out.println("2<<5 = " + i2);

    }
}
