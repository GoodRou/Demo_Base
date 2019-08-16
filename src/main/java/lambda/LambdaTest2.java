package lambda;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @ClassName LambdaTest2
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/15 14:50
 * @Version 1.0
 **/
public class LambdaTest2
{
    /**
     * Lambda 表达式是一种匿名函数(对 Java 而言这并不完全正确，但现在姑且这么认为)，
     * 简单地说，它是没有声明的方法，也即没有访问修饰符、返回值声明和名字。
     *
     * 你可以将其想做一种速记，在你需要使用某个方法的地方写上它。
     * 当某个方法只使用一次，而且定义很简短，使用这种速记替代之尤其有效，
     * 这样，你就不必在类中费力写声明与方法了。
     *
     * 语法: (argument) -> (body)
     *       (arg1, arg2...) -> { body }
     *       (type1 arg1, type2 arg2...) -> { body }
     *
     *       (int a, int b) -> {  return a + b; }
     *       () -> System.out.println("Hello World");
     *       (String s) -> { System.out.println(s); }
     *       () -> 42
     *       () -> { return 3.1415 };
     *
     *       什么是函数式接口
     * 在 Java 中，Marker（标记）类型的接口是一种没有方法或属性声明的接口，
     * 简单地说，marker 接口是空接口。相似地，函数式接口是只包含一个抽象方法声明的接口。
     *
     * java.lang.Runnable 就是一种函数式接口，在 Runnable 接口中只声明了一个方法 void run()，
     * 相似地，ActionListener 接口也是一种函数式接口，我们使用匿名内部类来实例化函数式接口的对象，
     * 有了 Lambda 表达式，这一方式可以得到简化。
     *
     * 每个 Lambda 表达式都能隐式地赋值给函数式接口，
     * 例如，我们可以通过 Lambda 表达式创建 Runnable 接口的引用。
     *
     */
    public static void main(String[] args)
    {
//        通过 Lambda 表达式创建 Runnable 接口的引用。
        Runnable r = () ->
        {
            System.out.println(new Date());
        };
//        当不指明函数式接口时，编译器会自动解释这种转化
        new Thread(
                () -> System.out.println(new Date())
        ).run();

        /**
         * @FunctionalInterface 是 Java 8 新加入的一种接口，
         * 用于指明该接口类型声明是根据 Java 语言规范定义的函数式接口。
         * Java 8 还声明了一些 Lambda 表达式可以使用的函数式接口，
         * 当你注释的接口不是有效的函数式接口时，可以使用 @FunctionalInterface 解决编译层面的错误。
         *
         * 详见 WirjerUbterfaceTest   execute() 方法现在可以将 Lambda 表达式作为参数。
         */

//        线程可以通过以下方法初始化
//        旧方法
        new Thread().start();


//        Old way:
//        asList不能使用add remove
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for(Integer n: list) {
            System.out.println(n);
        }

//        New way:
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list2.forEach(n -> System.out.println(n));

//        or we can use :: double colon operator in Java 8
        list2.forEach(System.out::println);

        /**
         * 下面的例子使用 Lambda 表达式打印数值中每个元素的平方，
         * 注意我们使用了 .stream() 方法将常规数组转化为流。
         * Java 8 增加了一些超棒的流 APIs。java.util.stream.Stream 接口包含许多有用的方法，
         * 能结合 Lambda 表达式产生神奇的效果。我们将 Lambda 表达式 x -> x*x 传给 map() 方法，
         * 该方法会作用于流中的所有元素。之后，我们使用 forEach 方法打印数据中的所有元素：
         */
//        old way
        List<Integer> list5 = Arrays.asList(1,2,3,4,5,6,7);
        for (Integer i : list5)
        {
            int x = i * i;
            System.out.println("x = " + x);
        }
//        new way
        List<Integer> list6 = Arrays.asList(1,2,3,4,5,6,7);
        list6.stream().map((x) -> x*x).forEach(System.out::println);

        /**
         * 下面的例子会计算给定数值中每个元素平方后的总和。
         * 请注意，Lambda 表达式只用一条语句就能达到此功能，
         * 这也是 MapReduce 的一个初级例子。我们使用 map() 给每个元素求平方，
         * 再使用 reduce() 将所有元素计入一个数值：
         */
//        old way
        List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7);
        int sum = 0;
        for (Integer integer : list3)
        {
            int x = integer * integer;
            sum += x;
        }
        System.out.println("sum = " + sum);

//        new way
        List<Integer> list4 = Arrays.asList(1,2,3,4,5,6,7);
        int sum2 = list.stream().map((x) -> x*x).reduce((x,y) -> x+y).get();
        System.out.println("sum2 = " + sum2);

        /**
         * 使用匿名类与 Lambda 表达式的一大区别在于关键词的使用。
         * 对于匿名类，关键词 this 解读为匿名类，
         * 而对于 Lambda 表达式，关键词 this 解读为写就 Lambda 的外部类。
         *
         * Lambda 表达式与匿名类的另一不同在于两者的编译方法。
         * Java 编译器编译 Lambda 表达式并将他们转化为类里面的私有函数，
         * 它使用 Java 7 中新加的 invokedynamic 指令动态绑定该方法，
         */
    }

}
