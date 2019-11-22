package homeworkThread;

import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Exchanger;

public class CargoShip implements Callable {
    private int shipId;
    private Parcel parcel;
    private static final CyclicBarrier BARRIER = new CyclicBarrier(2); // create barrier
    private static final Exchanger<Parcel> EXCHANGER = new Exchanger<>(); // create exchanger with type Parcel

    CargoShip() {
    }

    CargoShip(int shipId, Parcel parcel) {
        this.shipId = shipId;
        this.parcel = parcel;
    }

    public int getShipId() {
        return shipId;
    }

    public void setShipId(int shipId) {
        this.shipId = shipId;
    }

    private Parcel getParcel() {
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
        parcel = EXCHANGER.exchange(parcel);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" The Cargo ship '" + getShipId() + "' LEAVE the HARBOR with " + getParcel());
        BARRIER.reset();

        return null;
    }

}
