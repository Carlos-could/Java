public class Druker extends Produkt {

    private String papiergroesse;
    private int blattMenge;
    private String druckMaterial;

    public void druckeSeite(){
        System.out.println("Ich drucke eine Seite");
    }

    //-----------Constructor


    public Druker(String bezeichnung, double preis, String papiergroesse, int blattMenge, String druckMaterial) {
        super(bezeichnung, preis);
        this.papiergroesse = papiergroesse;
        this.blattMenge = blattMenge;
        this.druckMaterial = druckMaterial;
    }

    //-----------Getter und Setter
    /*public String getPapiergroesse() {
        return papiergroesse;
    }

    public void setPapiergroesse(String papiergroesse) {
        this.papiergroesse = papiergroesse;
    }

    public int getBlattMenge() {
        return blattMenge;
    }

    public void setBlattMenge(int blattMenge) {
        this.blattMenge = blattMenge;
    }

    public String getDruckMaterial() {
        return druckMaterial;
    }

    public void setDruckMaterial(String druckMaterial) {
        this.druckMaterial = druckMaterial;
    }*/

    //------toString
    @Override
    public String toString() {
        return "Druker{" + getBezeichnung() +", "+ getPreis() +", "+
                "papiergroesse='" + papiergroesse + '\'' +
                ", blattMenge=" + blattMenge +
                ", druckMaterial='" + druckMaterial + '\'' +
                ", Bezeichnung='" + Bezeichnung + '\'' +
                '}';
    }
}
