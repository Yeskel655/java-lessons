package lesson14;

public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.putProduct("Морковь", 100);
        fridge.putProduct("Морковь", 500);
        fridge.putProduct("Помидор", 500);
        fridge.getProduct("Морковь", 700);
        fridge.printAllProducts();
        fridge.weightAllProducts();
        fridge.theSmallestProduct();
    }
}
