package generic;

/**
 * @ClassName PairTest1
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/19 11:23
 * @Version 1.0
 **/
public class PairTest1
{
    public static void main(String[] args)
    {
        String[] words = {"Mary", "rr", "gcy", "q", "lamb", "little"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("min = " + mm.getSecond());

        String middle = ArrayAlg.<String>getMiddle("Jhon");
        System.out.println("middle = " + middle);

        String[] arr = {"1","22","33","0"};
        String arr2 = ArrayAlg.<String >min(arr);
        System.out.println("arr2 = " + arr2);
    }
}

class ArrayAlg
{
    public static Pair<String> minmax(String[] a)
    {
        if (a == null || a.length == 0)
        {
            return null;
        }
        String min = a[0];
        String max = a[0];
        for (int i = 0; i < a.length; i++)
        {
            if (min.compareTo(a[i]) > 0)
            {
                min = a[i];
            }
            if (max.compareTo(a[i]) < 0)
            {
                max = a[i];
            }
        }
        return new Pair<>(min, max);
    }

//    定义一个泛型方法
    public static <T> T getMiddle(T... a)
    {
        return a[a.length / 2];
    }

//    计算最小的元素
    public static <T extends Comparable> T min(T[] a)
    {
        if (a == null || a.length == 0)
        {
            return null;
        }
        T smallest = a[0];
        for (int i = 0; i < a.length; i++)
        {
            if (smallest.compareTo(a[i]) > 0)
            {
                smallest = a[i];
            }
        }
        return smallest;
    }
}
