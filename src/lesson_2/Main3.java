package lesson_2;

public class Main3 {
    public static void main(String[] args) {
        // у  нас есть некая оценка от ученика (1 2 3 4 5)
        // Напечатат на консоль наш ответ как родителя
        int mark = 10;

        switch (mark){
            case 1:
                System.out.println("Очень плохо");
                break;
            case 2:
                System.out.println("Плохо");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default:
                System.out.println("Оригинальная оценка");
        }
    }
}
