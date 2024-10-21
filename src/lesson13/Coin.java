package lesson13;

import java.util.Objects;

public class Coin implements Comparable<Coin>{
    private int nominal;
    private int year;
    private String metalName;
    private double diamenter;

    public Coin(int nominal, int year, String metalName, double diamenter) {
        this.nominal = nominal;
        this.year = year;
        this.metalName = metalName;
        this.diamenter = diamenter;
    }

    public Coin() {
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMetalName() {
        return metalName;
    }

    public void setMetalName(String metalName) {
        this.metalName = metalName;
    }

    public double getDiamenter() {
        return diamenter;
    }

    public void setDiamenter(double diamenter) {
        this.diamenter = diamenter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return nominal == coin.nominal && year == coin.year && Double.compare(diamenter, coin.diamenter) == 0 && Objects.equals(metalName, coin.metalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, year, metalName, diamenter);
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", year=" + year +
                ", metalName='" + metalName + '\'' +
                ", diamenter=" + diamenter +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        //Сначала сортируем по номиналу
        if(this.nominal != o.nominal){
            return this.nominal-o.nominal;
        }
        //Потом сортируем по году
        if (this.year != o.year){
            return this.year - o.year;
        }
        //Потом сортируем по материаллу
        return this.metalName.compareTo(o.metalName);
    }
}
