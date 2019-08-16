package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @ClassName Main
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/15 16:56
 * @Version 1.0
 **/
public class Main
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println("Print all numbers:");
        evaluate(list,(n) -> true);
        System.out.println("Print all numbers:");
        evaluate(list,(n) -> false);
        System.out.println("Print all numbers:");
        evaluate(list,(n) -> n%2 == 0);
        System.out.println("Print all numbers:");
        evaluate(list,(n) -> n%2 == 1);
        System.out.println("Print all numbers:");
        evaluate(list,(n) -> n > 5);
    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate)
    {
        for (Integer n : list)
        {
            if(predicate.test(n)){
                System.out.println("n = " + n);
            }
        }
    }
}
