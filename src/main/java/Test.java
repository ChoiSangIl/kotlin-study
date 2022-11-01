import kotlin.collections.ArrayDeque;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> test = new ArrayList<String>();
        test.add("abc");

        for (Object o : (Iterable) test) {
            
        }

        System.out.println(test.getClass().getName());
    }
}
