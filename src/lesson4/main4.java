package lesson4;

public class main4 {
    public static void main(String[] args) {
        char abcd[] = {'a', 'b', 'c', 'd'};
        char qwer[] = {'q', 'w', 'e', 'r'};
        char[] abcdqwer = new char[abcd.length + qwer.length];

        for (int i = 0; i < abcdqwer.length; i++) {
            if (i < abcd.length) { // перекладываем с первого массива
                abcdqwer[i] = abcd[i];
            } else { // перекладываем со второго масссива
                abcdqwer[i] = qwer[i-abcd.length];
            }
        }
        System.out.println(abcdqwer);
    }
}
