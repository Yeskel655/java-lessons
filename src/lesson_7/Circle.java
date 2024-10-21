package lesson_7;

public class Circle {
    private int diameter;

    public Circle() {
    }

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public double circumference() {
        return Math.PI * this.diameter;
    }

    public double square() {
        return Math.PI * (this.diameter * this.diameter) / 4;
    }
}
