package generic;

import java.time.LocalDate;

/**
 * @ClassName PairTest2
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/19 14:31
 * @Version 1.0
 **/
public class PairTest2
{
    public static void main(String[] args)
    {
        LocalDate[] birthdays =
                {
                        LocalDate.of(1906,12,9),
                        LocalDate.of(1815,11,8),
                        LocalDate.of(1903,10,7),
                        LocalDate.of(1910,9,6),
                };
        Pair<LocalDate> mm =ArrayAlg2.minmax(birthdays);
        System.out.println("mm = " + mm.getFirst());
        System.out.println("mm = " + mm.getSecond());
    }
}
//计算泛型数组的最大值和最小值
class ArrayAlg2
{
    public static <T extends Comparable> Pair<T> minmax(T[] a)
    {
        if (a == null || a.length == 0)
        {
            return null;
        }
        T min = a[0];
        T max = a[0];
        for (int i = 0; i < a.length; i++)
        {
            if (max.compareTo(a[i]) < 0)
            {
                max = a[i];
            }
            if (min.compareTo(a[i]) > 0)
            {
                min = a[i];
            }
        }
        return new Pair<>(min, max);
    }

}
