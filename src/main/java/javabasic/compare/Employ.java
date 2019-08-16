package javabasic.compare;

import lombok.Data;

/**
 * @ClassName Employ
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/14 9:18
 * @Version 1.0
 **/
@Data
public class Employ implements Comparable<Employ>
{
    private String name;
    private double salary;

    public Employ(String name,double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public int compareTo(Employ o)
    {
        return Double.compare(salary,o.salary);
    }

}
