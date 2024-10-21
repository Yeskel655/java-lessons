package lesson_7;

public class Rectangle {
    private int bigSideOfRectangle;
    private int smallSideOfRectangle;

    public Rectangle() {
    }

    public Rectangle(int smallSideOfRectangle, int bigSideOfRectangle) {
        this.smallSideOfRectangle = smallSideOfRectangle;
        this.bigSideOfRectangle = bigSideOfRectangle;
    }

    public int getBigSideOfRectangle() {
        return bigSideOfRectangle;
    }

    public void setBigSideOfRectangle(int bigSideOfRectangle) {
        this.bigSideOfRectangle = bigSideOfRectangle;
    }

    public int getSmallSideOfRectangle() {
        return smallSideOfRectangle;
    }

    public void setSmallSideOfRectangle(int smallSideOfRectangle) {
        this.smallSideOfRectangle = smallSideOfRectangle;
    }

    public int perimetr() {
        return this.bigSideOfRectangle + this.smallSideOfRectangle + this.bigSideOfRectangle + this.smallSideOfRectangle;
    }

    public int square() {
        return this.bigSideOfRectangle * this.smallSideOfRectangle;
    }
}
