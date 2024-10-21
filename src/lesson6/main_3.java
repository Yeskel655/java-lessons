package lesson6;

public class main_3 {
    public static void main(String[] args) {
        //у нас есть путь к картинке
        //Нам нужно проверить, реально ли это картинка
        String pathToImg = "C://home//images//photoMops.cdw";
        // this - ccылка на объект pathToImg внутри метода endsWight
        if (pathToImg.endsWith(".jpeg") || pathToImg.endsWith(".png")){
            System.out.println("Это картинка!!!");
        }else {
            System.out.println("Это не картинка!!!");
        }
    }
}
