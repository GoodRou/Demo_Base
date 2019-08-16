package clone;

import lombok.Data;

/**
 * @ClassName CloneTest
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/15 10:26
 * @Version 1.0
 **/
public class CloneTest
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
//        浅克隆 (shalloeClone
//        Student stu1 = new Student();
//        stu1.setNumber(310);
//        Student stu2 = (Student) stu1.clone();
//        System.out.println("stu1 = " + stu1);
//        System.out.println("stu2 = " + stu2);
//
//        stu2.setNumber(617);
//        System.out.println("stu1 = " + stu1);
//        System.out.println("stu2 = " + stu2);

//        深克隆(deepClone)
        Address addr = new Address();
        addr.setAdd("JN");
        Student stu1 = new Student();
        stu1.setNumber(310);
        stu1.setAddr(addr);
        Student stu2 = (Student) stu1.clone();

        System.out.println("学生1: " + stu1.getNumber() + ",地址: " + stu1.getAddr().getAdd());
        System.out.println("学生2: " + stu2.getNumber() + ",地址: " + stu2.getAddr().getAdd());

        addr.setAdd("HZ");
        System.out.println("学生1: " + stu1.getNumber() + ",地址: " + stu1.getAddr().getAdd());
        System.out.println("学生2: " + stu2.getNumber() + ",地址: " + stu2.getAddr().getAdd());
    }
}
@Data
class Student implements Cloneable
{
    private int number;
    private Address addr;
    @Override
    protected Object clone()
    {
        Student stu = null;
        try {
            stu = stu = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        stu.addr = (Address) addr.clone();
        return stu;
    }
}
@Data
class Address implements Cloneable{
    private String add;

    @Override
    protected Object clone() {
        Address addr = null;
        try {
            addr = (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return addr;
    }
}
