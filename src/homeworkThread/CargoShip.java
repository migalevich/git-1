package homeworkThread;

import homework3.Ship;

import java.util.concurrent.*;

public class CargoShip implements Callable {
    public int shipId;
    Parcel parcel;
    private static final CyclicBarrier BARRIER = new CyclicBarrier(2);
    // private static final CyclicBarrier BARRIER2 = new CyclicBarrier(2, harbor2);
    // public static final Exchanger<Parcel> EXCHANGER = new Exchanger<>(); // создаем обменник с типом Parcel

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
        System.out.println(" The Cargo ship '" + getShipId() + "' near the HARBOR1 with " + getParcel());
        Harbor harbor1 = new Harbor();
        Harbor harbor2 = new Harbor();

 //       harbor1.add(CargoShip);

  //      this.harbor1.add(this.shipId);
//        harbor.getCounter();
//        BARRIER1.await();
        System.out.println(" The Cargo ship '" + getShipId() + "' LEAVE the HARBOR1 with " + getParcel());
        System.out.println(" The Cargo ship '" + getShipId() + "' near the HARBOR2 with " + getParcel());
//        harbor.getCounter();
 //       BARRIER2.await();
        System.out.println(" The Cargo ship '" + getShipId() + "' LEAVE the HARBOR2 with " + getParcel());

        //  System.out.println(harbor.getCounter());
        return null;
    }

}
