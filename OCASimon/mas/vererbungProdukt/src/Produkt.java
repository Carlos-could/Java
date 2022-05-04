public class Produkt {

    protected String Bezeichnung;
    private double Preis;

    protected void wasBinIch() {
        System.out.println("Ich bin ein Produkt!");
    }

    //-----------Constructor
    public Produkt(String bezeichnung, double preis) {
        Bezeichnung = bezeichnung;
        Preis = preis;
    }

    //-----------Getter und Setter
    public String getBezeichnung() {
        return Bezeichnung;
    }

    /*public void setBezeichnung(String bezeichnung) {
        Bezeichnung = bezeichnung;
    }*/

    public double getPreis() {
        return Preis;
    }

    /*public void setPreis(double preis) {
        Preis = preis;
    }*/

    @Override
    public String toString() {
        return "Produkt{" +
                "Bezeichnung='" + Bezeichnung + '\'' +
                ", Preis=" + Preis +
                '}';
    }
}
