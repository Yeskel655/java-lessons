package lesson4;

public class main1 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 55, 8, 9, 3, 2};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
