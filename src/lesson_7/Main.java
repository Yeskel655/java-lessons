package lesson_7;

public class Main {
    public static void main(String[] args) {
        Circle bigCircle = new Circle(10000);
        System.out.println(bigCircle.square());
        System.out.println(bigCircle.circumference());
        Oval smallOval = new Oval(5, 2);
        System.out.println(smallOval.perimetr());
        System.out.println(smallOval.square());
        Rectangle beautifulRectangle = new Rectangle(10, 15);
        System.out.println(beautifulRectangle.perimetr());
        System.out.println(beautifulRectangle.square());
        Square smoothSquare = new Square(10);
        System.out.println(smoothSquare.perimetr());
        System.out.println(smoothSquare.square());
        Triangle isoscelesTriangle = new Triangle(15, 15, 20);
        System.out.println(isoscelesTriangle.perimetr());
        System.out.println(isoscelesTriangle.square());
    }
}
