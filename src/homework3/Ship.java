package homework3;

import java.util.Objects;

public class Ship extends FloatingCraft implements ShipFunctionalityInterface, ShipAppearanceInterface {
    private int price;
    private double weight = 145562.25;

    private String model;
    private String ownerFirstName;
    private String ownerSecondName;
    private ShipType typeShip;

    public Ship() {
    }

    public Ship(String model, int price, String ownerFirstName, String ownerSecondName, ShipType typeShip) {
        this.model = model;
        this.price = price;
        this.ownerFirstName = ownerFirstName;
        this.ownerSecondName = ownerSecondName;
        this.typeShip = typeShip;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
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

    public ShipType getTypeShip() {
        return typeShip;
    }

    public void setTypeShip(ShipType typeShip) {
        this.typeShip = typeShip;
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
                Objects.equals(ownerSecondName, ship.ownerSecondName) &&
                Objects.equals(typeShip, ship.typeShip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, weight, model, ownerFirstName, ownerSecondName, typeShip);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "price=" + price +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", ownerFirstName='" + ownerFirstName + '\'' +
                ", ownerSecondName='" + ownerSecondName + '\'' +
                ", typeShip='" + typeShip + '\'' +
                '}';
    }

    @Override
    public void getSound() {
        System.out.println("Beep, beep!");
    }

    @Override
    public String fight() {
        return null;
    }

    @Override
    public String move() {
        return "I can move!";
    }

    @Override
    public String commentFunctionality() {
        return null;
    }

    @Override
    public String getColor() {
        if (this.typeShip.name().equals("WARSHIP")) {
            return "Red";
        } else {
            if (this.typeShip.name().equals("CIVIL_SHIP")) {
                return "Green";
            } else {
                return "Blue";
            }
        }
    }


}