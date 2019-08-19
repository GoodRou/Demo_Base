package set;

/**
 * @ClassName IteratorDemo
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/19 15:39
 * @Version 1.0
 **/
public class IteratorDemo
{
    /**
     * Iterator接口包含4个方法:
     * E next();
     * boolean hasNext();
     * void remove();
     * default void forEachRemaining(Consumer<? superE> action);
     * 通过反复调用next方法,可以逐个访问集合中的每个元素.
     * 但是到达了集合的末尾,next方法将抛出一个NoSuchElementException.
     * 因此,调用next()方法之前要调用hasNext();
     */
    public static void main(String[] args)
    {
//        Collection<String> c =...;
//        Iterator<String> iter = c.iterator();
//        while (iter.hasNext())
//        {
//            String element = iter.next();
//            //doSomething
//        }
//        for (String s : c)
//        {
//            //doSomething
//        }
//        编译器简单地将"foreach"循环翻译为带有迭代器的循环

        /**
         * Iterator接口的remove方法将会删除上次调用next()方法时返回的元素.
         * it.next();
         * it.remove();
         * 对next方法和remove方法的调用具有依赖关系,如果调用remove之前没有调用next是不合法的,
         * 将会抛出一个IllegalStateException异常.
         *
         */
    }
}
