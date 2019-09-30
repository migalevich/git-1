package homework3;

import java.util.*;

public class ShipDemo {
    public static void main(String[] args) {

        Ship[] ships = new Ship[5];
        ships[0] = new Ship("H34", 346, "Alex", "Ivanov");
        ships[1] = new Ship("T55", 525, "Irina", "Kotova");
        ships[2] = new Ship("M65", 564, "Anna", "Romanova");
        ships[3] = new Ship("R89", 234, "Ivan", "Kim");
        ships[4] = new Ship("H32", 456, "Alex", "Petrov");

        // print array
        for (Ship ship : ships) {
            System.out.println(ship);
        }

        // sort array
        for (int i = 0; i < ships.length - 1; i++) {
            for (int j = 0; j < ships.length - 1; j++) {
                if (ships[j].getPrice() > ships[j + 1].getPrice()) {
                    Ship tmp = ships[j];
                    ships[j] = ships[j + 1];
                    ships[j + 1] = tmp;
                }
            }
        }
        //print array
        System.out.println("Sorted by price array:");
        for (Ship ship : ships) {
            System.out.println(ship);
        }


        // filter array by Model
        for (Ship ship : ships) {
            if (ship.getmodel().equals("T55")) {
                System.out.println("Model T55 in this array: ");
                System.out.println(ship);
            }
        }

    }
}