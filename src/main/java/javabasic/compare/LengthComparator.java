package javabasic.compare;

import java.util.Comparator;

/**
 * @ClassName LengthComparator
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/14 11:17
 * @Version 1.0
 **/
public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
