package bagger;

public class Schaufelradbagger extends Bagger{

    public int durchmesserRad;



    public int getDurchmesserRad() {
        return durchmesserRad;
    }

    public void setDurchmesserRad(int durchmesserRad) {
        this.durchmesserRad = durchmesserRad;
    }

    public Schaufelradbagger(int motorleistung, int durchmesserRad) {
        super(motorleistung);
        this.durchmesserRad = durchmesserRad;
    }


}
