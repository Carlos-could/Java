public class KinoTicket extends Ticket implements Berechnung{
    int filmDauer;

    public KinoTicket(String eventOrt, String eventName, int basisPreis, int ticketPreis, int filmDauer) {
        super(eventOrt, eventName, basisPreis);
        this. filmDauer = filmDauer;
    }

    @Override
    public void printTicketDaten() {
        System.out.println("KinoTicket:" +
                "\n\t eventOrt :\t\t" + eventOrt +
                "\n\t eventName :\t" + eventName +
                "\n\t basisPreis :\t" + basisPreis +
                "\n\t ticketPreis :\t" + ticketPreis +
                "\n\t filmDauer :\t" + filmDauer
        );
    }

    @Override
    public int berechneTicketPreis() {
        return 0;
    }


}
