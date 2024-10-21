package lesson13;

import java.util.Comparator;

public class SortByDiametrComparator implements Comparator<Coin> {

    @Override
    public int compare(Coin o1, Coin o2) {
        if(o1.getDiamenter() != o2.getDiamenter()){
            return Double.compare(o1.getDiamenter(), o2.getDiamenter());
        }
        if (o1.getYear() != o2.getYear()){
            return o1.getYear() - o2.getYear();
        }
        if(o1.getNominal() != o2.getNominal()){
            return o2.getNominal()-o1.getNominal();
        }
        return o1.getMetalName().compareTo(o2.getMetalName());
    }
}
