public class KonzertTicket extends Ticket implements Berechnung{
    int sitzReihe;

    public KonzertTicket(String eventOrt, String eventName, int basisPreis, int ticketPreis, int sitzReihe) {
        super(eventOrt, eventName, basisPreis);
        this.sitzReihe = sitzReihe;
    }


    @Override
    public void printTicketDaten() {
        System.out.println("KonzertTicket:" +
                "\n\t eventOrt :\t\t" + eventOrt +
                "\n\t eventName :\t" + eventName +
                "\n\t basisPreis :\t" + basisPreis +
                "\n\t ticketPreis :\t" + ticketPreis +
                "\n\t sitzReihe :\t" + sitzReihe
        );
    }

    @Override
    public int berechneTicketPreis() {
        return 0;
    }


}
