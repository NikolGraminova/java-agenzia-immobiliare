package org.java.lessons.realestate;

public class Residence extends RealEstate{

    // FIELDS
    private int rooms;
    private int bathrooms;


    // CONSTRUCTORS
    public Residence(String code, String address, int postCode, String city, int area, int rooms, int bathrooms) {
        super(code, address, postCode, city, area);
        this.rooms = rooms;
        this.bathrooms = bathrooms;
    }


    public int getRooms() {
        return rooms;
    }
    public int getBathrooms() {
        return bathrooms;
    }


    // METHODS
    @Override
    public String toString() {
        return super.toString()  +
                "rooms=" + rooms +
                ", bathrooms=" + bathrooms +
                '}';
    }
}
