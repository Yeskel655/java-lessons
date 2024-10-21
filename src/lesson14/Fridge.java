package lesson14;

import java.util.*;

public class Fridge {
    //String - название продукта
    //Double - вес в граммах
    private Map<String, Double> fridgeMap = new HashMap<>();

    //Положит продукты в холодильник
    public void putProduct(String productName, double weight) {
        //Уже лежит веса в граммах
        double existWeight = 0;
        if (fridgeMap.containsKey(productName)) {
            existWeight = fridgeMap.get(productName);
        }

        //Кладем текущий вес + новый
        fridgeMap.put(productName, existWeight + weight);
    }

    //Взять продукт из холодильника (не только вывести в консоль, но и списать вес, обработать ситуация,
    // когда веса не достаточно от запрошенного)
    public void getProduct(String productName, double weight) {
        if (productAvailabilityCheck(productName)) return;
        double existWeight = fridgeMap.get(productName);
        if (existWeight <= weight) {
            System.out.println("Продукта " + productName + " нет в количестве " + weight);
            return;
        }
        existWeight -= weight;
        fridgeMap.remove(productName);
        fridgeMap.put(productName, existWeight);
        System.out.println("Продукт: " + productName + ", в количестве: " + weight + " взят из холодильника");
    }

    private boolean productAvailabilityCheck(String productName) {
        if (!fridgeMap.containsKey(productName)) {
            System.out.println("Такого продукта нет");
            return true;
        }
        return false;
    }

    public void weightAllProducts() {
        double fullWeight = 0;
        for (Map.Entry<String, Double> entry : fridgeMap.entrySet()) {
            fullWeight += entry.getValue();
        }
        System.out.println(fullWeight);
    }

    public void weightProduct(String productName) {
        if (productAvailabilityCheck(productName)) return;
        System.out.println("Вес продукта: " + fridgeMap.get(productName));
    }

    private void getFridgeMapSorterByWeight(){
        Map<String, Double> fridgeMap = new TreeMap<>();
    }

    public void theSmallestProduct() {


        System.out.println("Продукт " + " скоро закончится");
    }

    public void printAllProducts() {
        for (Map.Entry<String, Double> entry : fridgeMap.entrySet()) {
            System.out.println("Название продукта: " + entry.getKey() + ", количество грамм: " + entry.getValue());
        }
    }
    private Comparator<Map.Entry<String, Integer>> valueComparator = (e1, e2) -> e1.getValue().compareTo(e2.getValue());
}
