package lambda;

import java.util.Arrays;

/**
 * @ClassName LambdaTest
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/14 14:29
 * @Version 1.0
 **/
public class LambdaTest {
    public static void main(String[] args) {
        String[] f2 = {"guochenyu","rourou","gcy","rr"};
        Arrays.sort(f2,
                (o1, o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(f2));

//        Timer t = new Timer(1000,event ->
//                System.out.println(new Date())
//                );
//        t.start();
//        JOptionPane.showMessageDialog(null,"exit?");
//        System.exit(0);

//        List l = new ArrayList();
//        l.add(null);
//        l.add("rr");
//        l.add(null);
//        l.add("gg");
//        for (Object o : l) {
//            System.out.println("o = " + o);
//        }
//        l.removeIf( e -> e==null);
//        for (Object o : l) {
//            System.out.println("o = " + o);
//        }

//        Timer t = new Timer(1000,event -> System.out.println(event));
//        t.start();
//        JOptionPane.showMessageDialog(null,"exit?");
//        System.exit(0);

//        Timer t = new Timer(1000,System.out::println);
//        t.start();
//        JOptionPane.showMessageDialog(null,"exit?");
//        System.exit(0);

    }
}
