package homeworkThread;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Demo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List listCargoShip = new LinkedList();
        for (int i = 1; i < 5; i++) {
            listCargoShip.add(new CargoShip(i, new Parcel(i, getParcel(i))));
        }
        for (Object o : listCargoShip) {
            System.out.println(o);
        }


        ExecutorService service = Executors.newFixedThreadPool(listCargoShip.size());
        List futures = service.invokeAll(listCargoShip);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.shutdown();


    }

    private static String getParcel(int i) {
        String cargo;
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
        return cargo;
    }
}
