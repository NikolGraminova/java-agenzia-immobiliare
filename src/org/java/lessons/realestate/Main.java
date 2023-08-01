package org.java.lessons.realestate;

//Creare una classe Main con metodo main nel quale testare tutte le funzionalità delle classi

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("*** JAVA ESTATE AGENCY ***");

        // LIST
        EstateAgency properties = new EstateAgency();

        // INSTANCES
        Residence residence = new Residence("AA111" , "Street 1", 111, "Los Santos", 90, 4, 2);
        properties.addProperty(residence);

        Villa villa = new Villa("BB222", "Street 2", 222, "San Fierro", 120, 6, 3, 20);
        properties.addProperty(villa);

        Garage garage = new Garage("CC333", "Street 3", 333, "Las Venturas", 10, 2);
        properties.addProperty(garage);

        // METHODS
        residence.interestedAmount(5);
        villa.interestedAmount(12);
        garage.interestedAmount(2);

        // PRINT
        System.out.println("---DISPLAYING PROPERTIES---");
        System.out.println(properties);

        System.out.println("The most viewed is: " + properties.mostViewed2());

        System.out.println("Found property: " + properties.findProperty("CC333"));
    }
}
