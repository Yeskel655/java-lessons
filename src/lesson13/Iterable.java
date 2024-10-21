package lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterable {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Iterator<Integer> interator = numbers.iterator();
        while (interator.hasNext()){
            Integer number = interator.next();
            System.out.println(number);
            interator.remove();
        }



        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        for (Integer number : numbers2) {
            System.out.println(number);
            numbers2.remove(number);
        }

    }
}
