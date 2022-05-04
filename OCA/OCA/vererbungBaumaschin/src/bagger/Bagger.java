package bagger;

import baumaschine.Baumaschinen;


public class Bagger extends Baumaschinen  {


    public Bagger(int motorleistung) {
        super(motorleistung);

    }

    public int hoechstgeschwindigkeit() {
        return 20;
    }


}
