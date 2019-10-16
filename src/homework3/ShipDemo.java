package homework3;

import java.sql.SQLOutput;
import java.util.*;

public class ShipDemo {
    public static void main(String[] args) {

        Ship[] ships = new Ship[5];
        ships[0] = new Ship("H34", 346, "Alex", "Ivanov", ShipType.WARSHIP);
        ships[1] = new Ship("T55", 525, "Irina", "Kotova", ShipType.CIVIL_SHIP);
        ships[2] = new Ship("M65", 564, "Anna", "Romanova", ShipType.WARSHIP);
        ships[3] = new Ship("R89", 234, "Ivan", "Kim", ShipType.CIVIL_SHIP);
        ships[4] = new Ship("H32", 456, "Alex", "Petrov", ShipType.CIVIL_SHIP);
//        System.out.println(Arrays.toString(ships));

        ships[1].getSound();
        System.out.println(ships[2].move());
        System.out.println(ships[2].getColor());

        // print array
        for (Ship ship : ships) {
            System.out.println(ship);
        }

        // sort array by price
        for (int i = 0; i < ships.length - 1; i++) {
            for (int j = 0; j < ships.length - 1; j++) {
                if (ships[j].getPrice() > ships[j + 1].getPrice()) {
                    Ship tmp = ships[j];
                    ships[j] = ships[j + 1];
                    ships[j + 1] = tmp;
                }
            }
        }

        //print sort array
        System.out.println("Sorted by price array:");
        for (Ship ship : ships) {
            System.out.println(ship);
        }

        int lengthNewArray = 0;
        for (int i = 0; i< ships.length - 1; i++) {
            if (ships[i].getOwnerFirstName().equals("Alex")) {
                lengthNewArray++;
            }
        }

        // filter array
        Ship[] shipsFiltered = new Ship[lengthNewArray];
        int j = 0;
        for (int i = 0; i< ships.length - 1; i++) {
            if (ships[i].getOwnerFirstName().equals("Alex")) {
                //     shipsFiltered[j] = new Ship(ships[i].getmodel(), ships[i].getPrice(), ships[i].getOwnerFirstName(), ships[i].getOwnerSecondName());
                // shipFiltered[j]= new Ship();
                shipsFiltered[j] = ships[i];
                j++;
            }
        }

        System.out.println("Filtered by owner first name 'Alex' array:");
        for (Ship s : shipsFiltered) {
            System.out.println(s);
        }


        /* Yacht extends Ship */
        Yacht yacht1 = new Yacht();
        Yacht yacht2 = new Yacht("Y11",564,"Pavel","Shved",25,162.5, ShipType.WARSHIP);

        Yacht[] yachts = new Yacht[2];
        yachts[0] = yacht1;
        yachts[1] = yacht2;

        System.out.println("Yachts array:");
        for (Yacht s : yachts) {
            System.out.println(s);
        }

        System.out.println(Yacht.getCrew()); /* Yachts counter */


    }

}