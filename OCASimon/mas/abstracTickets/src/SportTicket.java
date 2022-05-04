public class SportTicket extends Ticket implements Berechnung{

    int pokalStufe;

    //Konstruktor
    public SportTicket(String eventOrt, String eventName, int basisPreis, int pokalStufe) {
        super(eventOrt, eventName, basisPreis);
        this.pokalStufe = pokalStufe;
    }

    //Getter ung Setters
    public int getPokalStufe() {
        return pokalStufe;
    }
    public void setPokalStufe(int pokalStufe) {
        this.pokalStufe = pokalStufe;
    }

    @Override
    public int berechneTicketPreis() {
        ticketPreis = basisPreis + (8/pokalStufe) ;
        return ticketPreis;
    }

    // abstract Methode
    @Override
    public void printTicketDaten(){
        System.out.println("SportTicket:" +
                "\n\t eventOrt :\t\t" + eventOrt +
                "\n\t eventName :\t" + eventName +
                "\n\t pokalStufe :\t" + pokalStufe +
                "\n\t basisPreis :\t" + basisPreis +
                "\n\t ticketPreis :\t" + berechneTicketPreis()
        );
    }




}
