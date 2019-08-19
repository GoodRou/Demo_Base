package generic;

import lombok.Data;

/**
 * @ClassName Pair
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/19 11:10
 * @Version 1.0
 **/
@Data
public class Pair<T>
{
    //泛型类可看作普通的类工厂
    private T first;
    private T second;

    public Pair()
    {
        first = null;
        second = null;
    }

    public Pair(T first,T second)
    {
        this.first = first;
        this.second = second;
    }

    public static void main(String[] args)
    {
        Pair<String> p = new Pair();
        p.setFirst("123");
        System.out.println("p = " + p.toString());

        Pair<Integer> pp = new Pair<>();
        pp.setSecond(456);
        System.out.println("pp = " + pp.getSecond());
    }
}
