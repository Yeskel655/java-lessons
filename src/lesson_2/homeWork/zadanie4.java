package lesson_2.homeWork;

public class zadanie4 {
    public static void main(String[] args) {
        int month =0;
        for (int money = 0; money < 200000; money += 9500){
            month++;
        }
        System.out.println("Нам нужно: "+ month/12 + "год");
    }
}
