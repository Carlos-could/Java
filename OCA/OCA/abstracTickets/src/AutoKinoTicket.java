public class AutoKinoTicket extends KinoTicket implements Berechnung{
    int anzahlPersonen;

    public AutoKinoTicket(String eventOrt, String eventName, int basisPreis, int ticketPreis, int filmDauer, int anzahlPersonen) {
        super(eventOrt, eventName, basisPreis, ticketPreis, filmDauer);
        this.anzahlPersonen = anzahlPersonen;
    }

    @Override
    public void printTicketDaten() {
        System.out.println("AutoKinoTicket:" +
                "\n\t eventOrt :\t\t" + eventOrt +
                "\n\t eventName :\t" + eventName +
                "\n\t basisPreis :\t" + basisPreis +
                "\n\t ticketPreis :\t" + ticketPreis +
                "\n\t filmDauer :\t" + filmDauer +
                "\n\t anzahlPer :\t" + anzahlPersonen
        );
    }
}
