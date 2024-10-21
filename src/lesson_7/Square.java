package lesson_7;

public class Square {
    private int sideOfSquare;

    public Square() {
    }

    public Square(int sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    public int getSideOfSquare() {
        return sideOfSquare;
    }

    public void setSideOfSquare(int sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    public int perimetr() {
        return this.sideOfSquare * 4;
    }

    public int square() {
        return this.sideOfSquare * this.sideOfSquare;
    }
}
