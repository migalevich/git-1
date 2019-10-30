package threadsShips;

import java.util.Arrays;
import java.util.concurrent.Exchanger;

public class CargoShip implements Runnable {
    public static final Exchanger<Integer> EXCHANGER= new Exchanger<>(); // создаем обменник с типом String
    private String departure;
    private String destination;
    private int[] parcels;
    private String shipName;

    public CargoShip(String departure, String destination, int[] parcels, String shipName) {
        this.departure = departure;
        this.destination = destination;
        this.parcels = parcels;
        this.shipName = shipName;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int[] getParcels() {
        return parcels;
    }

    public void setParcels(int[] parcels) {
        this.parcels = parcels;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    @Override
    public String toString() {
        return "CargoShip{" +
                ", shipName='" + shipName + '\'' +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", parcels=" + Arrays.toString(parcels) +
                '}';
    }

    public void run() {
        try {
            System.out.println(" The Cargo ship '"+getShipName()+"' START going from "+getDeparture());
            Thread.sleep(1000);
            System.out.println(" The Cargo ship '"+ getShipName()+"' CAME to Helsinki with parcels "+ Arrays.toString(getParcels()));
            parcels[0] = EXCHANGER.exchange(parcels[0]);
            parcels[1] = EXCHANGER.exchange(parcels[1]);
            System.out.println("Parcels change");
           // Thread.sleep(1000);
            System.out.println(" The Cargo ship '"+ getShipName()+"' GO to "+ getDestination()+" from Helsinki with parcels "+ Arrays.toString(getParcels()));
            Thread.sleep(1000);
            System.out.println(" The Cargo ship '"+ getShipName()+"' WENT to "+ getDestination()+" with parcels "+ Arrays.toString(getParcels()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
