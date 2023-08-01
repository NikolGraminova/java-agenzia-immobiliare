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

    public Property findProperty(String code){
        for (Property property : properties){
            if (code.equalsIgnoreCase(property.getCode())){
                return property;
            }
        }
        return null;
    }

    public Property mostViewed2(){
        Property mostViewedProperty = null;
        int count = 0;
        for (Property property : properties){
            if (property.getInterestedPeople() > count){
                mostViewedProperty = property;
                count = mostViewedProperty.getInterestedPeople();
            }
        }
        return mostViewedProperty;
    }

    @Override
    public String toString() {
        return "EstateAgency{" +
                "properties="  +  properties + "\n" +
                '}';
    }
}
