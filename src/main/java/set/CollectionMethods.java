package set;

/**
 * @ClassName CollectionMethods
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/19 15:59
 * @Version 1.0
 **/
public class CollectionMethods
{
    /**
     * Iterrator<E> iterator()
     *      返回一个用于访问集合中每个元素的迭代器
     * int size()
     *      返回当前存储在集合中的元素个数
     * boolean isEmpty()
     *      如果集合中没有元素, 返回true
     * boolean contains(Object obj)
     *      如果集合中包含了一个与obj相等的对象, 返回true
     * boolean containsAll(Collection<?> other)
     *      如果这个集合包含other集合中的所有元素, 返回true
     * boolean add(Object element)
     * boolean addAll(Collection<? extends E> other)
     *      将other集合中的元素全部添加到这个集合
     * boolean remove(Object obj)
     * boolean removeAll(Collection<? extends E> other)
     *      从这个集合中删除other集合中包含的所有元素
     * void clear()
     *      删除所有元素
     * boolean retainAll(Collection<?> other)
     *      从这个集合中删除所有与other集合元素的不同的元素
     * Object[] toArray()
     *      返回这个集合的对象数组
     * defalut boolean removeIf(Predicate<? super E> filter)
     *      从这个集合删除filter返回true的所有元素
     *
     */

    /**
     * 集合有两个基本接口:Collection和Map
     * List是一个有序集合,可以采用两种方式访问元素,迭代器或者整数索引.后一种方式称为随机访问,
     *      因为可以访问任意顺序.而迭代器须要有序的访问.
     * Set接口等同于Collection接口,Set不允许添加重复的元素.
     */

    /**
     * ArrayList        一种可以动态增长和缩短的索引序列
     * LinkedList       一种可以在任何位置进行高效地插入和删除操作的有序序列
     * ArrayDeque       一种用循环数组实现的栓端队列
     * HashSet          一种没有重复元素的无需集合
     * TreeSet          一种有序集
     * EnumSet          一种包含枚举类型值的集
     * LinkedHashSet    一种可以记住元素插入次序的集
     * PriorityQueue    一种允许要小删除最小元素的集合
     * HashMap          一种存储键值关联的数据结构
     * TreeMap          一种键值有序排列的映射表
     * EnumMap          一种键值属于枚举类型的映射表
     * LinkedHashMap    一种可以记住键值项添加次序的映射表
     * WeakHashMap      一种其值无用武之地后可以被垃圾回收回收的映射表
     * IdentityHashMap  一种用==而不使用equals比较键值的映射表
     * 
     */
}
