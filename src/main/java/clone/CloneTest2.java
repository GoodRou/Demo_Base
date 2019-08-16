package clone;

import java.io.*;

/**
 * @ClassName CloneTest2
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/15 14:32
 * @Version 1.0
 **/
public class CloneTest2
{
    public static void main(String[] args)
    {

    }
}

class Outer implements Serializable
{
    private static final long serialVersionUID = 369285298572941L;  //最好是显式声明ID
    public Inner inner;
    //Discription:[深度复制方法,需要对象及对象所有的对象属性都实现序列化]　
    public Outer myclone()
    {
        Outer outer = null;
        try
        { // 将该对象序列化成流,因为写在流里的是对象的一个拷贝，而原对象仍然存在于JVM里面。所以利用这个特性可以实现对象的深拷贝
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            // 将流序列化成对象
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            outer = (Outer) ois.readObject();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return outer;
    }
}

class Inner implements Serializable
{
    private static final long serialVersionUID = 872390113109L; //最好是显式声明ID
    public String name = "";

    public Inner(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Inner的name值为：" + name;
    }
}