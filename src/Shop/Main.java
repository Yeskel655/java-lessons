package Shop;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Shop shop1 = new Shop("У Иваныча", 200.12, 12.15);
        Shop shop2 = new Shop("У Петровича", 220.18, 10.18);
        Shop shop3 = new Shop("У Михалыча", 225.08, 18.12);

        Set<Shop> shops = new HashSet<Shop>();

        shops.add(shop1);
        shops.add(shop2);
        shops.add(shop3);

        double identity = 0.0;
        double totalIncome = shops.stream().reduce(identity, (a, b) -> a + b.getIncome(), Double::sum);
        System.out.println(totalIncome);

    }
