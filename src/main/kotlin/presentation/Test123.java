package presentation;

import java.util.ArrayList;
import java.util.List;

public class Test123 {
    public static void main(String[] args) {
        ArrayList list5 = new ArrayList();
        list5.add("test1");
        list5.add("test2");
        String var1 = "" + list5.getClass() + ' ' + list5;
        System.out.println(var1);
        List list6 = (List)(new ArrayList());
        list6.add("test");
        String var2 = "" + list6.getClass() + ' ' + list6;
        System.out.println(var2);
        List list7 = (List)(new ArrayList());
        list7.add("test3");
        String var3 = "" + list7.getClass() + ' ' + list7;
        System.out.println(var3);
    }
}
