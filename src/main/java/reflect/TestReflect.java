package reflect;

import java.io.Serializable;

/**
 * @ClassName TestReflect
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/16 9:28
 * @Version 1.0
 **/
public class TestReflect implements Serializable
{
    private static final long serialVersionUID = -2862585049955236662L;

    public static void main(String[] args)throws Exception
    {
//        通过一个对象获得完整的包名和类名
        TestReflect t = new TestReflect();
        System.out.println(t.getClass().getName());

//        实例化Class类对象
        Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;

//        实例化Class类对象
        class1 = Class.forName("reflect.TestReflect");
        class2 = new TestReflect().getClass();
        class3 = TestReflect.class;
        System.out.println("类名称   " + class1.getName());
        System.out.println("类名称   " + class2.getName());
        System.out.println("类名称   " + class3.getName());

//        获取一个对象的父类与实现的接口
        Class<?> clazz = Class.forName("reflect.TestReflect");
        Class<?> parClass = clazz.getSuperclass();
        System.out.println("clazz的父类是: " + parClass);

        Class<?> intes[] = clazz.getInterfaces();
        System.out.println("clazz实现的接口有:");
        for (Class<?> inte : intes)
        {
            System.out.println("inte = " + inte.getName());
        }



    }
}

class User
{
    private  int age;
    private String name;
    public User() {
        super();
    }
    public User(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
    public User(String name) {
        super();
        this.name = name;
    }

    public int getAge()
    {
        return this.age;
    }

    public String getName()
    {
        return this.name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "User(age=" + this.getAge() + ", name=" + this.getName() + ")";
    }
}
