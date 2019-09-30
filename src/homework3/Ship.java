package homework3;

import java.util.Objects;

public class Ship {
    private int price;
    private double weight = 145562.25;
    private String model;
    private String ownerFirstName;
    private String ownerSecondName;

    public Ship() {
    }

    public Ship(String model, int price, String ownerFirstName, String ownerSecondName) {
        this.model = model;
        this.price = price;
        this.ownerFirstName = ownerFirstName;
        this.ownerSecondName = ownerSecondName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getmodel() {
        return model;
    }

    public void setmodel(String model) {
        this.model = model;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerSecondName() {
        return ownerSecondName;
    }

    public void setOwnerSecondName(String ownerSecondName) {
        this.ownerSecondName = ownerSecondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return price == ship.price &&
                Double.compare(ship.weight, weight) == 0 &&
                Objects.equals(model, ship.model) &&
                Objects.equals(ownerFirstName, ship.ownerFirstName) &&
                Objects.equals(ownerSecondName, ship.ownerSecondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, weight, model, ownerFirstName, ownerSecondName);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "price=" + price +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", ownerFirstName='" + ownerFirstName + '\'' +
                ", ownerSecondName='" + ownerSecondName + '\'' +
                '}';
    }

}