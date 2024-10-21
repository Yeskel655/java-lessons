package lesson_7;

public class Oval {
    private int bigSideOfOval;
    private int smallSideOfOval;

    public Oval() {
    }

    public Oval(int bigSideOfOval, int smallSideOfOval) {
        this.bigSideOfOval = bigSideOfOval;
        this.smallSideOfOval = smallSideOfOval;
    }

    public int getBigSideOfOval() {
        return bigSideOfOval;
    }

    public void setBigSideOfOval(int bigSideOfOval) {
        this.bigSideOfOval = bigSideOfOval;
    }

    public int getSmallSideOfOval() {
        return smallSideOfOval;
    }

    public void setSmallSideOfOval(int smallSideOfOval) {
        this.smallSideOfOval = smallSideOfOval;
    }

    public double perimetr() {
        return Math.PI * Math.sqrt((this.bigSideOfOval * this.bigSideOfOval + this.smallSideOfOval * this.smallSideOfOval) / 2);
    }

    public double square() {
        return Math.PI * smallSideOfOval * bigSideOfOval;
    }
}
