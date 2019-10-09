package homework3;

import java.sql.SQLOutput;
import java.util.*;

public class ShipDemo {
    public static void main(String[] args) {

//        Ship ship1 = new Ship("H34", 346, "Alex", "Ivanov");
//        System.out.println(ship1);
//        Ship ship2 = new Ship();
//        System.out.println(ship2);
        Ship[] ships = new Ship[5];
        ships[0] = new Ship("H34", 346, "Alex", "Ivanov", ShipType.DOUBLE_MAST);
        ships[1] = new Ship("T55", 525, "Irina", "Kotova", ShipType.SINGL_MAST);
        ships[2] = new Ship("M65", 564, "Anna", "Romanova", ShipType.THREE_MAST);
        ships[3] = new Ship("R89", 234, "Ivan", "Kim", ShipType.FOUR_MAST);
        ships[4] = new Ship("H32", 456, "Alex", "Petrov", ShipType.SINGL_MAST);
//        System.out.println(Arrays.toString(ships));


       ships[1].getSound();

        System.out.println(ships[2].move());

        System.out.println(ships[2].getColor());



        // print array
        for (Ship ship : ships) {
            System.out.println(ship);
        }

//        // sort array
//        for (int i = 0; i < ships.length - 1; i++) {
//            for (int j = 0; j < ships.length - 1; j++) {
//                if (ships[j].getPrice() > ships[j + 1].getPrice()) {
//                    Ship tmp = ships[j];
//                    ships[j] = ships[j + 1];
//                    ships[j + 1] = tmp;
//                }
//            }
//        }
//        //print array
//        System.out.println("Sorted by price array:");
//        for (Ship ship : ships) {
//            System.out.println(ship);
//        }
//
//        int lengthNewArray = 0;
//        for (int i = 0; i< ships.length - 1; i++) {
//            if (ships[i].getOwnerFirstName().equals("Alex")) {
//                lengthNewArray++;
//            }
//        }
//
//        // filter array by Model
//        Ship[] shipsFiltred = new Ship[lengthNewArray];
//        int j = 0;
//        for (int i = 0; i< ships.length - 1; i++) {
//            if (ships[i].getOwnerFirstName().equals("Alex")) {
//                //     shipsFiltred[j] = new Ship(ships[i].getmodel(), ships[i].getPrice(), ships[i].getOwnerFirstName(), ships[i].getOwnerSecondName());
//                // shipFiltered[j]= new Ship();
//                shipsFiltred[j] = ships[i];
//                j++;
//            }
//        }
//
//        System.out.println("Filtered by First name Alex array:");
//        for (Ship s : shipsFiltred) {
//            System.out.println(s);
//        }
//
//
//
//        Yacht yacht1 = new Yacht();
//        Yacht yacht2 = new Yacht("Y11",564,"Pavel","Shved",25,162.5);
//
//        Yacht[] yachts = new Yacht[2];
//        yachts[0] = yacht1;
//        yachts[1] = yacht2;
//
//        System.out.println("Yachts array:");
//        for (Yacht s : yachts) {
//            System.out.println(s);
//        }
//
//        System.out.println(Yacht.getCrew());


    }

}