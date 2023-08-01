package org.java.lessons.realestate;

public class Villa extends Residence{

    // FIELDS
    private int gardenArea;


    // CONSTRUCTORS
    public Villa(String code, String address, int postCode, String city, int area, int rooms, int bathrooms, int gardenArea) {
        super(code, address, postCode, city, area, rooms, bathrooms);
        this.gardenArea = gardenArea;
    }


    // GETTERS
    public int getGardenArea() {
        return gardenArea;
    }


    // METHODS
    public void setGardenArea(int Area, int gardenArea) {
        this.setArea(Area);
        this.gardenArea = gardenArea;
    }

    @Override
    public String toString() {
        return super.toString() +
                "gardenArea=" + gardenArea +
                '}';
    }
}
