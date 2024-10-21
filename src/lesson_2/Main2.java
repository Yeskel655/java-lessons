package lesson_2;

public class Main2 {
    public static void main(String[] args) {
        //напечатать на консоль какой вид треугольника по трём сторонам
        int a = 13;
        int b = 12;
        int c = 12;
        if(a != b && b != c && a != c){
            System.out.println("Это разносторонний треугольник");
        } else if(a == b && b==c && a == c){
            System.out.println("Это равносторонний треугольник");
        } else {
            System.out.println("Равнобедренный треугольник");
        }
    }
}
