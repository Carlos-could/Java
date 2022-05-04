package Main;

import bagger.Schaufelradbagger;
import bagger.Seilbagger;
import transportgeraete.Fourderbaender;
import transportgeraete.Kipplaster;

public class Main {
    public static void main(String[] args) {
        //Bagger
        Schaufelradbagger schaufel1 = new Schaufelradbagger(500, 10);
        System.out.println(schaufel1.durchmesserRad);
        schaufel1.setDurchmesserRad(11);
        System.out.println(schaufel1.durchmesserRad);
        System.out.println(schaufel1.getDurchmesserRad());


        Seilbagger seil1 = new Seilbagger(550, 20);
//        System.out.println(seil1.motorleistung);

        //transportgeraete
        Fourderbaender fourder1 = new Fourderbaender(450,4);
        Kipplaster kipp1 = new Kipplaster(450,1000);
//        System.out.println(fourder1.breiteFourderbaender);
//        System.out.println(kipp1.maxKippwinkel);

    }
}
