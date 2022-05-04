package bagger;

public class Seilbagger extends Bagger{

    public int seillaenge;

    public int getSeillaenge() {
        return seillaenge;
    }

    public void setSeillaenge(int seillaenge) {
        this.seillaenge = seillaenge;
    }

    public Seilbagger(int motorleistung, int seillaenge) {
        super(motorleistung);
        this.seillaenge = seillaenge;


    }


}
