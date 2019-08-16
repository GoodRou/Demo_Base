package javabasic.arr;

import java.util.Arrays;

/**
 * @ClassName ArrDemo
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/12 16:38
 * @Version 1.0
 **/
public class ArrDemo {

    public static void main(String[] args) {
        int[] a = {5,2,1,5,6};
        int[] b = new int[5];
        b = Arrays.copyOf(a,a.length);//Arrays.copyOf数组拷贝
        System.out.println(Arrays.toString(b));//Arrays类中的toString方法可以打印数组.
        Arrays.sort(a);//对数组进行增序排序
        System.out.println("a = " + Arrays.toString(a));
        int i = (int) (Math.random() * 2);
        System.out.println("i = " + i);

        double[][] balances;//在初始化之前不能使用


    }


}
