package homework3;

public class ShipDemo {
    public static void main(String[] args) {

        Ship[] ships = new Ship[5];
        for (int i = 0; i < 5; i++) {
            ships[i] = createShips(i);
        }

        ships[1].getSound();
        System.out.println(ships[2].move());
        System.out.println(ships[2].getColor());

        // print array
        for (Ship ship : ships) {
            System.out.println(ship);
        }

        // sort array by price
        sortByPrice(ships);

        // filter array
        filterByName(ships, "Alex");

        /* Yacht extends Ship */
        Yacht yacht1 = new Yacht();
        Yacht yacht2 = new Yacht("Y11", 564, "Pavel", "Shved", 25, 162.5, ShipType.WARSHIP);

        Yacht[] yachts = new Yacht[2];
        yachts[0] = yacht1;
        yachts[1] = yacht2;

        System.out.println("Yachts array:");
        for (Yacht s : yachts) {
            System.out.println(s);
        }

        System.out.println(Yacht.getCrew()); /* Yachts counter */

    }

    private static Ship createShips(int i) {

        String[] modelArray = {"H34", "T55", "M65", "R89", "H32", "G67", "I99"};
        int[] priceArray = {525, 564, 346, 234, 456, 765, 534};
        String[] ownerFirstNameArray = {"Alex", "Irina", "Anna", "Ivan", "Alex", "Pavel", "Kate"};
        String[] ownerSecondName = {"Ivanov", "Kotova", "Romanova", "Kim", "Petrov", "Shved", "Juk"};

        return new Ship(modelArray[i], priceArray[i], ownerFirstNameArray[i], ownerSecondName[i], i / 2 == 1 ? ShipType.WARSHIP : ShipType.CIVIL_SHIP);
    }

    private static void sortByPrice(Ship[] ships) {

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
    }

    private static void filterByName(Ship[] ships, String name) {
        int lengthNewArray = 0;
        for (int i = 0; i < ships.length - 1; i++) {
            if (ships[i].getOwnerFirstName().equals(name)) {
                lengthNewArray++;
            }
        }

        // filter array
        Ship[] shipsFiltered = new Ship[lengthNewArray];
        int j = 0;
        for (int i = 0; i < ships.length - 1; i++) {
            if (ships[i].getOwnerFirstName().equals(name)) {
                shipsFiltered[j] = ships[i];
                j++;
            }
        }

        System.out.println("Filtered by owner first name 'Alex' array:");
        for (Ship s : shipsFiltered) {
            System.out.println(s);
        }
    }
}