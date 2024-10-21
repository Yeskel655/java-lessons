package Shop;

import java.util.Objects;

public class Shop {
    String name;
    double income;
    double area;

    public Shop(String name, double income, double area) {
        this.name = name;
        this.income = income;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Double.compare(income, shop.income) == 0 && Double.compare(area, shop.area) == 0 && Objects.equals(name, shop.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, income, area);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", income=" + income +
                ", area=" + area +
                '}';
    }
}
