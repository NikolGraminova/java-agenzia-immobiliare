package org.java.lessons.realestate;

/*
Definire una classe AgenziaImmobiliare che contiene una lista di immobili e presenta
un metodo per aggiungere un immobile
un metodo per la ricerca di un immobile a partire dal codice alfanumerico
un metodo per restituire l’immobile che ha avuto il maggior numero di visualizzazioni
*/

import java.util.ArrayList;

public class EstateAgency {

    ArrayList<Property> properties = new ArrayList<>();

    // METHODS
    public void addProperty(Property property){
        properties.add(property);
    }

    public void findProperty(String code){
        for (Property property : properties){
            if (code.equalsIgnoreCase(property.getCode())){
                System.out.println("Found property");
            }
        }
    }

    public void mostViewed(){
        int count = 0;
        for (Property property : properties){
            if (property.interestedAmount() > count){
                count = property.interestedAmount();
                System.out.println("Property with most views: " + count);
            }

        }
    }
}
