package konto;




public class Konto {

    private double saldo = 0;

    public Konto(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void hebenGeld(double betrag){
        this.saldo = saldo-betrag;
    }
    public void zahleGeldEin (double betrag){
        saldo = saldo+betrag;
    }


}
