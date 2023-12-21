package ownclasses;

import java.util.Arrays;

public class House {
    private int id;
    private int apartmentNumber;
    private double area;
    private int floor;
    private int numberOfRooms;
    private String street;
    private String buildingType;
    private int yearsInUse;

    public House(int id, int apartmentNumber, double area, int floor, int numberOfRooms, String street, String buildingType, int yearsInUse) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
        this.buildingType = buildingType;
        this.yearsInUse = yearsInUse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getYearsInUse() {
        return yearsInUse;
    }

    public void setYearsInUse(int yearsInUse) {
        this.yearsInUse = yearsInUse;
    }

    public static House[] filterByNumberOfRooms(House[] houses, int targetNumberOfRooms) {
        return Arrays.stream(houses)
                .filter(house -> house.numberOfRooms == targetNumberOfRooms)
                .toArray(House[]::new);
    }

    public static House[] filterByFloorRange(House[] houses, int minFloor, int maxFloor) {
        return Arrays.stream(houses)
                .filter(house -> house.floor >= minFloor && house.floor <= maxFloor)
                .toArray(House[]::new);
    }

    public static House[] filterByAreaGreaterThan(House[] houses, double minArea) {
        return Arrays.stream(houses)
                .filter(house -> house.area > minArea)
                .toArray(House[]::new);
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", apartmentNumber=" + apartmentNumber +
                ", area=" + area +
                ", floor=" + floor +
                ", numberOfRooms=" + numberOfRooms +
                ", street='" + street + '\'' +
                ", buildingType='" + buildingType + '\'' +
                ", yearsInUse=" + yearsInUse +
                '}';
    }
}
