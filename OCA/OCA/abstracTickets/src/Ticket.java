interface Berechnung {
    int berechneTicketPreis();
}


abstract class Ticket {

    String eventOrt;
    String eventName;
    int basisPreis;
    int ticketPreis;

    public abstract void printTicketDaten();


    //Konstructor
    public Ticket(String eventOrt, String eventName, int basisPreis) {
        this.eventOrt = eventOrt;
        this.eventName = eventName;
        this.basisPreis = basisPreis;

    }

    //Getter und Setter
    public String getEventOrt() {
        return eventOrt;
    }

    public void setEventOrt(String eventOrt) {
        this.eventOrt = eventOrt;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getBasisPreis() {
        return basisPreis;
    }

    public void setBasisPreis(int basisPreis) {
        this.basisPreis = basisPreis;
    }

    public int getTicketPreis() {
        return ticketPreis;
    }

    public void setTicketPreis(int ticketPreis) {
        this.ticketPreis = ticketPreis;
    }



}
