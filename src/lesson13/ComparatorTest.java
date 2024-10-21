package lesson13;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest {
    public static void main(String[] args) {
        Coin coin1 = new Coin(50, 1999, "Serebro", 2.5);
        Coin coin2 = new Coin(10, 1999, "Gold", 2.5);
        Coin coin3 = new Coin(40, 1999, "Serebro", 4.0);
        Coin coin4 = new Coin(450, 1999, "Gold", 6.0);
        Coin coin5 = new Coin(1, 1999, "Platinum", 8.0);
        Coin coin6 = new Coin(4, 1999, "Serebro", 6.0);

        Set<Coin> coins = new TreeSet<>(new SortByDiametrComparator());
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        Set<Coin> coinsSet2 = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                //сортируем по диамтеру
                if(o1.getDiamenter() != o2.getDiamenter()){
                    return Double.compare(o1.getDiamenter(), o2.getDiamenter());
                }

                //Сначала сортируем по номиналу
                if(o1.getNominal() != o2.getNominal()){
                    return o2.getNominal()-o1.getNominal();
                }
                //Потом сортируем по году
                if (o1.getYear() != o2.getYear()){
                    return o1.getYear() - o2.getYear();
                }
                //Потом сортируем по материаллу
                return o1.getMetalName().compareTo(o2.getMetalName());
            }
        });
        coinsSet2.add(coin1);
        coinsSet2.add(coin2);
        coinsSet2.add(coin3);
        coinsSet2.add(coin4);
        coinsSet2.add(coin5);
        coinsSet2.add(coin6);

        for (Coin coin : coinsSet2) {
            System.out.println(coin);
        }
    }
}
