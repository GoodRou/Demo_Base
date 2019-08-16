package javabasic.compare;

import java.util.Arrays;

/**
 * @ClassName EmploySortTest
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/14 9:18
 * @Version 1.0
 **/
public class EmploySortTest
{
    public static void main(String[] args)
    {
        Employ[] staff = new Employ[3];
        staff[0] = new Employ("Harry Hacker",35000);
        staff[1] = new Employ("carl Cracker",75000);
        staff[2] = new Employ("Tony Tester",38000);

        Arrays.sort(staff);

        for (Employ employ : staff) {
            System.out.println("name = " + employ.getName() + "salart = " + employ.getSalary());
        }
        Employ e = new Employ("rr",18) ;
        System.out.println("e.toString() = " + e.toString());
    }
}
