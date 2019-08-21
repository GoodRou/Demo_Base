package reflect;

import java.io.Serializable;
import java.lang.reflect.*;
import java.util.ArrayList;

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
    private String proprety = null;

    public static void main(String[] args) throws Exception
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
//        通过反射机制实例化一个类的对象
//        第一种方法，实例化默认构造方法，调用set赋值
        Class<?> class4 = Class.forName("reflect.User");
        User user = (User) class4.newInstance();
        user.setAge(18);
        user.setName("rr");
        System.out.println("user = " + user.toString());
//        第二种方法 取得全部的构造函数 使用构造函数赋值
        Constructor<?> cons[] = class4.getConstructors();

        for (int i = 0; i < cons.length; i++)
        {
            Class<?> clazzs[] = cons[i].getParameterTypes();
            System.out.print("cons[" + i + "] (");
            for (int j = 0; j < clazzs.length; j++)
            {
                if (j == clazzs.length - 1)
                {
                    System.out.print(clazzs[j].getName());
                }
                else
                {
                    System.out.print(clazzs[j].getName() + ",");
                }
            }
            System.out.println(")");
        }
        user = (User) cons[0].newInstance("Rollen");
        System.out.println(user);
        user = (User) cons[1].newInstance(20, "Rollen");
        System.out.println(user);
        System.out.println();


//        获取某个类的全部属性
        Class<?> class5 = Class.forName("reflect.TestReflect");
        System.out.println("==========本类属性==========");
//        取得本类的全部属性
        Field[] field = class5.getDeclaredFields();
        for (int i = 0; i < field.length; i++)
        {
//            权限修饰符
            int mo = field[i].getModifiers();
            String priv = Modifier.toString(mo);
//            属性类型
            Class<?> type = field[i].getType();
            System.out.println(priv + " " + type.getName() + " " + field[i].getName() + ";");
        }
        System.out.println("==========实现的接口或者父类的属性==========");
//        取得实现的接口或者父类的属性
        Field[] field1 = class5.getFields();
        for (int i = 0; i < field1.length; i++)
        {
            // 权限修饰符
            int mo = field1[i].getModifiers();
            String priv = Modifier.toString(mo);
            // 属性类型
            Class<?> type = field1[i].getType();
            System.out.println(priv + " " + type.getName() + " " + field1[i].getName() + ";");
        }

//        获取某个类的全部方法
        System.out.println("==========获取某个类的全部方法==========");
        Method[] methods = class5.getMethods();
        for (int i = 0; i < methods.length; i++)
        {
            Class<?> returnType = methods[i].getReturnType();
            Class<?> para[] = methods[i].getParameterTypes();
            int temp = methods[i].getModifiers();
            System.out.print(Modifier.toString(temp) + " ");
            System.out.print(returnType.getName() + "  ");
            System.out.print(methods[i].getName() + " ");
            System.out.print("(");
            for (int j = 0; j < para.length; ++j) {
                System.out.print(para[j].getName() + " " + "arg" + j);
                if (j < para.length - 1) {
                    System.out.print(",");
                }
            }
            Class<?> exce[] = methods[i].getExceptionTypes();
            if (exce.length > 0) {
                System.out.print(") throws ");
                for (int k = 0; k < exce.length; ++k) {
                    System.out.print(exce[k].getName() + " ");
                    if (k < exce.length - 1) {
                        System.out.print(",");
                    }
                }
            } else {
                System.out.print(")");
            }
            System.out.println();
        }
        System.out.println("==========通过反射机制调用某个类的方法==========");
        Method method = class5.getMethod("run");
        method.invoke(class5.newInstance());
        method = class5.getMethod("run2",int.class,String.class);
        method.invoke(class5.newInstance(),18,"rr");

        System.out.println("==========通过反射机制操作某个类的属性==========");
        Object obj = class5.newInstance();
        Field field2 = class5.getDeclaredField("proprety");
        field2.setAccessible(true);
        field2.set(obj,"Java反射机制");
        System.out.println(field2.get(obj));
        System.out.println("==========反射机制的动态代理==========");

        System.out.println("==========在泛型为Integer的ArrayList中存放一个String类型的对象==========");
        ArrayList<Integer> list1 = new ArrayList<>();
        Method method1 = list1.getClass().getMethod("add",Object.class);
        method1.invoke(list1,"java反射机制实例");
        System.out.println(list1.get(0));

        System.out.println("==========通过反射取得并修改数组的信息==========");
        int[] temp = { 1, 2, 3, 4, 5 };
        Class<?> demo = temp.getClass().getComponentType();
        System.out.println("数组类型:" + demo.getName());
        System.out.println("数组长度:" + Array.getLength(temp));
        System.out.println("数组的第一个元素" + Array.get(temp,0));
        Array.set(temp,0 ,100);
        System.out.println("修改之后数组的第一个元素为:" + Array.get(temp,0));

        System.out.println("==========通过反射机制修改数组的大小==========");
        int[] temp2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] newTemp = (int[]) arrayInc(temp2,15);
        print(newTemp);
        String[] atr = {"a","b","c"};
        String[] str1 = (String[]) arrayInc(atr,8);
        print(str1);

        System.out.println("==========将反射机制应用于工厂模式==========");








    }
//    修改数组大小
    public static Object arrayInc(Object obj, int len)
    {
        Class<?> arr = obj.getClass().getComponentType();
        Object newArr = Array.newInstance(arr,len);
        int co = Array.getLength(obj);
        System.arraycopy(obj,0,newArr,0,co);
        return newArr;
    }
//    打印
    public static void print(Object obj)
    {
        Class<?> c = obj.getClass();
        if(!c.isArray())
        {
            return;
        }
        System.out.println("数组长度为:" + Array.getLength(obj));
        for (int i = 0; i < Array.getLength(obj); i++)
        {
            System.out.print(Array.get(obj, i) + " ");
        }
        System.out.println();
    }


    public void run()
    {
        System.out.println("run@@@");
    }
    public void run2(int a, String b)
    {
        System.out.println("run###"+a+""+b);
    }
}

class User
{
    private int age;
    private String name;

    public User()
    {
        super();
    }

    public User(int age, String name)
    {
        super();
        this.age = age;
        this.name = name;
    }

    public User(String name)
    {
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
