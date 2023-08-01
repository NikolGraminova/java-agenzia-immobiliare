package org.java.lessons.realestate;

/*
Si vuole progettare un’applicazione in grado di gestire un’agenzia immobiliare.
Gli immobili sono caratterizzati da:
un codice alfanumerico,
indirizzo,
cap,
città
una superficie espressa in mq attraverso un numero intero.
Definire all’interno della classe Immobile un attributo per memorizzare il numero di persone interessate all’acquisto
aggiungere un metodo per incrementare questo numero.
L’agenzia gestisce diverse tipologie di immobili:
Box
Abitazione
Villa
Per i box è riportato il numero di posti auto. Per le abitazioni è riportato il numero di vani e il numero di bagni.
Per le ville è previsto, in aggiunta rispetto all’abitazione, la dimensione in mq di giardino.
Definire per ciascuna delle tre classi il metodo toString() in modo da fornire una descrizione completa dell’immobile.
Definire nella classe Immobile il metodo reimpostaSuperfici che prende in input la nuova superficie.
Implementare nella classe Villa l’overload di questo metodo. In questo caso prenderà i parametri superficie e superficieGiardino.
*/

public abstract class Property {

    // FIELDS
    private String code;
    private String address;
    private int postCode;
    private String city;
    private int area;
    private int interestedPeople = 0;


    // CONSTRUCTORS
    public Property(String code, String address, int postCode, String city, int area) {
        this.code = code;
        this.address = address;
        this.postCode = postCode;
        this.city = city;
        this.area = area;
    }


    // GETTERS
    public String getCode() {
        return code;
    }
    public String getAddress() {
        return address;
    }
    public int getPostCode() {
        return postCode;
    }
    public String getCity() {
        return city;
    }
    public int getArea() {
        return area;
    }
    public int getInterestedPeople() {
        return interestedPeople;
    }

    // METHODS
    public void interestedAmount(int amount){
        interestedPeople += amount;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "\n RealEstate{" +
                "code='" + code + '\'' +
                ", address='" + address + '\'' +
                ", postCode=" + postCode +
                ", city='" + city + '\'' +
                ", area=" + area +
                '}';
    }
}
