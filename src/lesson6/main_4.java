package lesson6;

public class main_4 {
    public static void main(String[] args) {
        //у нас есть email
        //нужно проверить:
        //1) Должна содержаться собачка и она должна быть только одна
        //2) email не должен начинаься и заканчиваться на точку
        //3) часть после собачки должжна содержать обязательно точку
        //4)
        String email = "anal_sex@sex.com";

        // contains - проверка содержание
        // split по символу

        String[] partsOfEmail = email.split("@");
        if(partsOfEmail.length !=2){
            System.out.println("В email нет собачек или их больше чем 2");
            return;
        }
        if(email.endsWith(".") || email.startsWith(".")){
            System.out.println("emal не может начинаться на или заканчиваться на точку");
            return;
        }
        if (!partsOfEmail[1].contains(".")){
            System.out.println("Часть после собачки не содежит тольку!!!");
        }else {
            System.out.println("Email подходит!");
        }
    }
}
