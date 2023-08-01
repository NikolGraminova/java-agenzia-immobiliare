package org.java.lessons.realestate;

public class Garage extends Property {

    // FIELDS
    private int carSpots;


    // CONSTRUCTORS
    public Garage(String code, String address, int postCode, String city, int area, int carSpots) {
        super(code, address, postCode, city, area);
        this.carSpots = carSpots;
    }


    // GETTERS
    public int getCarSpots() {
        return carSpots;
    }


    // METHODS
    @Override
    public String toString() {
        return super.toString()  +
                "carSpots=" + carSpots +
                '}';
    }
}
