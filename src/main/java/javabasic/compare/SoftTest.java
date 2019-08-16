package javabasic.compare;

import java.util.Arrays;

/**
 * @ClassName SoftTest
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/14 11:18
 * @Version 1.0
 **/
public class SoftTest {
    public static void main(String[] args) {
        String[] f1 = {"rr","gcy","rourou","guochenyu"};
        Arrays.sort(f1,new LengthComparator());
        System.out.println(Arrays.toString(f1));

        String[] f2 = {"rr","gcy","rourou","guochenyu"};
        Arrays.sort(f2,
                ((o1, o2) -> o1.length() - o2.length()));
        System.out.println(Arrays.toString(f2));





    }
}
