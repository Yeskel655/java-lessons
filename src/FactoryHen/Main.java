package FactoryHen;

public class Main {
    public static void main(String[] args) {
        HenFactory factory = new HenFactory();
        System.out.println(factory.getHen(HenFactory.HenType.RUSSIAN).getDescription());;
    }
}
