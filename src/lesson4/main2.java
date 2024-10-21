package lesson4;

public class main2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 20;
        numbers[1] = 22;
        numbers[2] = 24;
        numbers[3] = 26;
        int value = 20;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = value;
            value = value + 2;
            System.out.println(numbers[i]);
        }
    }
}
