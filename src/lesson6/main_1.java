package lesson6;

public class main_1 {
    public static void main(String[] args) {
        String text = "Я учусь на разработчика Java";
        char[] symbols = text.toCharArray();
        for (int i = 0; i < symbols.length; i = i + 2) {
            System.out.println(symbols[i]);
        }
    }
}
