package homework3;

import java.util.Objects;

public class Ship {

    public int price;
    public double weight;

    private String shipModel;
    private String ownerFirstName;
    private String ownerSecondName;

    public Ship() {
    }

    public Ship(String shipModel, int price, String ownerFirstName, String ownerSecondName) {
        this.shipModel = shipModel;
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

    public String getShipModel() {
        return shipModel;
    }

    public void setShipModel(String shipModel) {
        this.shipModel = shipModel;
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
                Objects.equals(shipModel, ship.shipModel) &&
                Objects.equals(ownerFirstName, ship.ownerFirstName) &&
                Objects.equals(ownerSecondName, ship.ownerSecondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, weight, shipModel, ownerFirstName, ownerSecondName);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "price=" + price +
                ", weight=" + weight +
                ", shipModel='" + shipModel + '\'' +
                ", ownerFirstName='" + ownerFirstName + '\'' +
                ", ownerSecondName='" + ownerSecondName + '\'' +
                '}';
    }

}
