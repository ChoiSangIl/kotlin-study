package iterable.list;

import kotlin.collections.CollectionsKt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List cities = CollectionsKt.listOf(new String[]{"Seoul", "Tokyo", "MountainView"});
        Class var1 = cities.getClass();
        System.out.println(var1);
        Iterable $this$map$iv = (Iterable)cities;

        Collection destination$iv$iv = (Collection)(new ArrayList( 1));
        destination$iv$iv.add("1");
        destination$iv$iv.add("2");
        destination$iv$iv.add("3");
        destination$iv$iv.add("4");
        List list = (List)destination$iv$iv;
        list.add("10");
    }
}

