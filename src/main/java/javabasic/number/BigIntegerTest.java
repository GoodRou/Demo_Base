package javabasic.number;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @ClassName BigIntegerTest
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/12 16:30
 * @Version 1.0
 **/
public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();//读一个数,nextLine读一行 next读一个字符

        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();

        BigInteger lottertOdds = BigInteger.valueOf(1);

        for (int i = 1 ; i <= k ; i++) {
            lottertOdds = lottertOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
        }
        System.out.println("Your odds are 1 in "+lottertOdds+". Good Luck!");
    }
}
