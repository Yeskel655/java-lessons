package lesson6;

public class main_2 {
    public static void main(String[] args) {
        //Нам от пользователя приходит новый пароль
        //1-длина должна быть более 8 симоволов
        //2-должна быть хотя бы одна большая буква
        //3-должна юыть хотя бы одна цифра
        String passwod = "password1A";
        if (passwod.length() < 8) {
            System.out.println("Пароль меньше 8 символов!!!!");
            return;
        }
        if (!passwod.contains("0") && !passwod.contains("1") &&
                !passwod.contains("2") &&
                !passwod.contains("3") &&
                !passwod.contains("4") &&
                !passwod.contains("5") &&
                !passwod.contains("6") &&
                !passwod.contains("7") &&
                !passwod.contains("8") &&
                !passwod.contains("9")) {
            System.out.println("Пароль не содержит цифру!!!");
            return;
        }
        String alfabet = "abcdefghijklmnopqrstuvwxyzабвгдежзийклмнопрстуфхцчшщъыьэюя";
        String alfabetUpper = alfabet.toUpperCase();

        int countUpper = 0;
        //генерируем индексы букв внутри пароля
        for (int i = 0; i < passwod.length(); i++){
            // берём одним символ из пароля
            char ch = passwod.charAt(i);
            if(alfabetUpper.contains(ch + "")){
                countUpper++;
            }
        }
        if(countUpper==0){
            System.out.println("Пароль не содержит большую букву!!!");
        }else {
            System.out.println("Ура! Пароль подходит");
        }
    }
}
