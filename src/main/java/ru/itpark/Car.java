package ru.itpark;

public class Car {
    private String name;
    private int productionYear;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int compareTo(Car o) {
        return -(getPrice() - o.getPrice());
    }

    @Override
    public String toString() {
        return "Car{" +
                name +
                ", год выпуска " + productionYear +
                ", цена " + price +
                " руб.}";
    }

    public Car(String name, int productionYear, int price) {
        this.name = name;
        this.productionYear = productionYear;
        this.price = price;


    }
}
