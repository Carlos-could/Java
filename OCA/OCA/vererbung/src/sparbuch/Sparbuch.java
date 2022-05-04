package sparbuch;

import konto.Konto;

public class Sparbuch extends Konto {



    public Sparbuch(double saldo, double zinssatz) {
        super(saldo);
        this.zinssatz = zinssatz;
    }

    double zinssatz = 0;

    public double berechneZinssatz(){
        return 0;
    }
}
