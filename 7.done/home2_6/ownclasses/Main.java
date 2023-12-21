package ownclasses;

public class Main {
    public static void main(String[] args) {
        House[] houses = {
            new House(1, 101, 75.5, 2, 3, "Main Street", "Apartment Building", 10),
            new House(2, 202, 90.0, 5, 4, "Oak Avenue", "House", 15),
        };
        // Display houses with number of rooms
        int targetNumberOfRooms = 4;
        House[] filteredByRooms = House.filterByNumberOfRooms(houses, targetNumberOfRooms);
        System.out.println("Houses with " + targetNumberOfRooms + " rooms:");
        displayHouses(filteredByRooms);

        // Display houses on floor
        int minFloor = 2;
        int maxFloor = 5;
        House[] filteredByFloorRange = House.filterByFloorRange(houses, minFloor, maxFloor);
        System.out.println("\nHouses on floors " + minFloor + " to " + maxFloor + ":");
        displayHouses(filteredByFloorRange);

        // Display houses with area greater than...
        double minArea = 80.0;
        House[] filteredByArea = House.filterByAreaGreaterThan(houses, minArea);
        System.out.println("\nHouses with area greater than " + minArea + ":");
        displayHouses(filteredByArea);
    }
    private static void displayHouses(House[] houses) {
        for (House house : houses) {
            System.out.println(house.toString());
        }
    }
}
