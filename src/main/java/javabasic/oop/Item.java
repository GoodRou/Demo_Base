package javabasic.oop;

/**
 * @ClassName Test
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/8 9:58
 * @Version 1.0
 **/
public class Item {
    String name;
    double price;

    public static void main(String[] args) {
        Item testItem = new Item();
        testItem.name = "肉肉";
        testItem.price = 22;

        //一个引用指向一个对象    一个引用,同一时间只能指向一个对象.
        new Item();//创建对象
        Item item = new Item();//使用一个引用指向对象

        //多个引用指向同一个对象   (房产和房产证)
        Item t1 = testItem;
        Item t2 = testItem;

    }
}
