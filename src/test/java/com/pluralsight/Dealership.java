package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Dealership {

    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;

        //create the dealership with no inventory
        this.inventory = new ArrayList<>();
    }

    //add vehicles to the inventory
    public void addVehicle(Vehicle vehicle) {
        this.inventory.add(vehicle);
    }

    //get all the vehicles
    public ArrayList<Vehicle> getAllVehicles() {
        return this.inventory;
    }

    public void removeVehicle(Vehicle vehicle) {
        //take the vehicle passed in out of the inventory list
    }

    public ArrayList<Vehicle> getVehiclesByPrice(BigDecimal min, BigDecimal max) {

        //loop over inventory and return a list of vehicles that match the price range

        //start a new list for the filtered cars

        //loop over inventory and add matching cards to filtered list

        //return the list

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {

        //loop over inventory and return a list of vehicles that match the make and model

        //start a new list for the filtered cars

        //loop over inventory and add matching cards to filtered list

        //return the list

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int Max) {

        //loop over inventory and return a list of vehicles that match the year range

        //start a new list for the filtered cars

        //loop over inventory and add matching cards to filtered list

        //return the list

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {

        //loop over inventory and return a list of vehicles that match the make and model

        //start a new list for the filtered cars

        //loop over inventory and add matching cards to filtered list

        //return the list

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {

        //loop over inventory and return a list of vehicles that match the min and max mileage

        //start a new list for the filtered cars

        //loop over inventory and add matching cards to filtered list

        //return the list

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByType(String type) {

        //loop over inventory and return a list of vehicles that match the type

        //start a new list for the filtered cars

        //loop over inventory and add matching cards to filtered list

        //return the list

        return null;
    }

}
