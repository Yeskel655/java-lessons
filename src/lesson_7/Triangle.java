package lesson_7;

public class Triangle {
    private int A;
    private int B;
    private int C;

    public Triangle() {
    }

    public Triangle(int b, int c, int a) {
        B = b;
        C = c;
        A = a;
    }

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public int getC() {
        return C;
    }

    public void setC(int c) {
        C = c;
    }

    public int perimetr() {
        return this.A + this.B + this.C;
    }

    public double square() {
        double p = (double) this.perimetr() / 2;
        return Math.sqrt(p * (p - this.A) * (p - this.B) * (p - this.C));
    }
}
