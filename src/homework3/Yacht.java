package homework3;

import java.util.Objects;

public class Yacht extends Ship {
    private int speed;
    private double length;
    private static int crew;


    Yacht() {
        System.out.println("Yacht default constructor");
        crew++;
    }

    Yacht(String model, int price, String ownerFirstName, String ownerSecondName, int speed, double length, ShipType shipType) {
        super(model, price, ownerFirstName, ownerSecondName, shipType);
        this.speed = speed;
        this.length = length;
        crew++;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    static int getCrew() {
        return crew;
    }

    public static void setCrew(int crew) {
        Yacht.crew = crew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Yacht yacht = (Yacht) o;
        return speed == yacht.speed &&
                Double.compare(yacht.length, length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, length);
    }

    @Override
    public String toString() {
        return "Yacht{" +
                "speed=" + speed +
                ", length=" + length +
                '}' + " " + super.toString();
    }


}
