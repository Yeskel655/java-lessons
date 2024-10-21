package lesson12;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> a = new ArrayList<>();
        a.add(-1);
        a.add(-2);
        a.add(-3);
        Collection<Integer> b = new ArrayList<>();
        /*b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);*/
        CollectionUtilsImpl collectionUtils = new CollectionUtilsImpl();
        System.out.println(collectionUtils.union(a,b));
        System.out.println(collectionUtils.intersection(a,b));
        System.out.println(collectionUtils.unionWithoutDuplicate(a,b));
        System.out.println(collectionUtils.intersectionWithoutDuplicate(a,b));
        System.out.println(collectionUtils.difference(a,b));
    }
}
