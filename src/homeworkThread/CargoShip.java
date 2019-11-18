package homeworkThread;

import homework3.Ship;

import java.util.concurrent.*;

public class CargoShip implements Callable {
    public int shipId;
    public Parcel parcel;
    private static final CyclicBarrier BARRIER = new CyclicBarrier(2);
    public static final Exchanger<Parcel> EXCHANGER = new Exchanger<>(); // создаем обменник с типом Parcel

    public CargoShip() {
    }

    public CargoShip(int shipId, Parcel parcel) {
        this.shipId = shipId;
        this.parcel = parcel;
    }

    public int getShipId() {
        return shipId;
    }

    public void setShipId(int shipId) {
        this.shipId = shipId;
    }

    public Parcel getParcel() {
        return parcel;
    }

    public void setParcel(Parcel parcel) {
        this.parcel = parcel;
    }

    @Override
    public String toString() {
        return "CargoShip{" +
                "shipId=" + shipId +
                ", parcel=" + parcel +
                '}';
    }

    @Override
    public Object call() throws Exception {

        System.out.println(" The Cargo ship '" + getShipId() + "' near the HARBOR with " + getParcel());
        BARRIER.await();
        Thread.sleep(1000);
       // System.out.println(" The Cargo change parcels ");
        parcel = EXCHANGER.exchange(parcel);
        System.out.println(" The Cargo ship '" + getShipId() + "' LEAVE the HARBOR with " + getParcel());
        BARRIER.reset();

        return null;
    }

}
