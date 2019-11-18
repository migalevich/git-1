package homeworkThread;

import java.util.*;
import java.util.concurrent.*;


public class Demo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //   Random r = new Random();
        List listCargoShip = new LinkedList();
        String cargo;
        for (int i = 1; i < 5; i++) {
            switch (i) {
                case 1:
                    cargo = "fish";
                    break;
                case 2:
                    cargo = "meat";
                    break;
                case 3:
                    cargo = "tomatoes";
                    break;
                case 4:
                    cargo = "avocados";
                    break;
                case 5:
                    cargo = "shrimps";
                    break;
                default:
                    cargo = "limes";
                    break;
            }
            listCargoShip.add(new CargoShip(i, new Parcel(i, cargo)));
        }
        for (Object o : listCargoShip) {
            System.out.println(o);
        }


        ExecutorService service = Executors.newFixedThreadPool(listCargoShip.size());
        List futures = service.invokeAll(listCargoShip);
        Thread.sleep(400);

        service.shutdown();


    }

}
