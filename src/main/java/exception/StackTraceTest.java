package exception;

import java.util.Scanner;

/**
 * @ClassName StackTraceTest
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/14 16:59
 * @Version 1.0
 **/
public class StackTraceTest
{
    public static int faceorial(int n)
    {
        System.out.println("factorial(" + n + "):");
        Throwable t = new Throwable();
        StackTraceElement[] farmes = t.getStackTrace();
        int i = 1;
        for (StackTraceElement f : farmes)
        {
            System.out.println(i + "farnes = " + f);
            ++i;
        }
        int r;
        if (n <= 1)
        {
            r = 1;
        }
        else
        {
            r = n * faceorial(n - 1);
        }
        System.out.println("return " + r);
        return r;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = in.nextInt();
        faceorial(n);
    }
}
