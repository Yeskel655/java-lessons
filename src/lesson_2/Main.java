package lesson_2;

public class Main {
    public static void main (String[] args){
        //Есть число, вывести на консоль это чётное число (true)
        //или нечётные (fasle)
        // boolean ---- thrue | faslse

        int number = 123;

        // управляющая конструкция (позволяет выполнить что-то одно из вариантов)
        if(number % 2 == 0){
            System.out.println("Это чётное число");
        } else {
            System.out.println("Это нечётное число");
        }
    }
}
