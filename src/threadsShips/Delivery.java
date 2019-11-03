package threadsShips;

public class Delivery {
    public static void main(String[] args) {
        CargoShip ship1 = new CargoShip("Riga","Stockholm", new int[]{45, 55, 65, 75},"Avrora");
        CargoShip ship2 = new CargoShip("Tallin","Turku", new int[]{33, 66, 99, 88},"Anna");

        System.out.println("Information about ships:");
        System.out.println(ship1.toString());
        System.out.println(ship2.toString());
        System.out.println("========================");

        new Thread(ship1).start();
      //  Thread.sleep(1000);
        new Thread(ship2).start();

       // Thread.join();

    }
}
