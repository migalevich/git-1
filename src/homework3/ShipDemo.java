package homework3;

import java.util.Arrays;

import homework3.Ship;

public class ShipDemo {
    public static void main(String[] args) {

        Ship ship1 = new Ship("H34", 346, "Alex", "Ivanov");
        System.out.println(ship1);
        Ship ship2 = new Ship();
        System.out.println(ship2);

        String[] shipModel = {"H34", "D11", "Q56", "Q78", "J67"};
        System.out.println("Array: " + Arrays.toString(shipModel));
        Arrays.sort(shipModel);
        System.out.println("Array sorted: " + Arrays.toString(shipModel));
        for (String s : shipModel) {
            if (s.equals("D11")) {
                System.out.println("D11 in the array is!");
            }
        }

    }

}
