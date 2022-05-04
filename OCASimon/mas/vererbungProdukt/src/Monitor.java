public class Monitor extends Produkt{

    private String panelart;
    private int groesseDiagonale;
    private double hoehe;
    private double breite;
    private double tiefe;

    public void zeigeEinBild(){
        System.out.println("Ich zeige ein Bild an");
    }


    //-----------Constructor


    public Monitor(String bezeichnung, double preis, String panelart, int groesseDiagonale, double hoehe, double breite, double tiefe) {
        super(bezeichnung, preis);
        this.panelart = panelart;
        this.groesseDiagonale = groesseDiagonale;
        this.hoehe = hoehe;
        this.breite = breite;
        this.tiefe = tiefe;
    }

    //-----------Getter und Setter
    /*public String getPanelart() {
        return panelart;
    }
    public void setPanelart(String panelart) {
        this.panelart = panelart;
    }

    public int getGroesseDiagonale() {
        return groesseDiagonale;
    }

    public void setGroesseDiagonale(int groesseDiagonale) {
        this.groesseDiagonale = groesseDiagonale;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getTiefe() {
        return tiefe;
    }

    public void setTiefe(double tiefe) {
        this.tiefe = tiefe;
    }*/

    //over..



    //------toString
    @Override
    public String toString() {
        return "Monitor{" + getBezeichnung() +", "+ getPreis() +", "+
                "panelart='" + panelart + '\'' +
                ", groesseDiagonale=" + groesseDiagonale +
                ", hoehe=" + hoehe +
                ", breite=" + breite +
                ", tiefe=" + tiefe +
                ", Bezeichnung='" + Bezeichnung + '\'' +
                '}';
    }


}
