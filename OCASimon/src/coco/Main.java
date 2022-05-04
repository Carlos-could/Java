package coco;

import coco.Carlos.DatenDatei;
import static coco.Carlos.DatenDatei.konvertierStringZuInt;

public class Main {


    public static void main(String[] args) {

        DatenDatei datei1 = new DatenDatei("src/Datei/daten1.txt");
        datei1.datenDateiAnzeigen(1, 1);

        DatenDatei datei2 = new DatenDatei("src/Datei/daten2.txt");
        datei2.datenDateiAnzeigen(0, 1);

        System.out.println(konvertierStringZuInt("100"));


    }
}
