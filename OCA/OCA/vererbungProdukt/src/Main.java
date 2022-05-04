public class Main {
    public static void main(String[] args) {

        Monitor moni1 = new Monitor("Monitor Curve", 300.0, "IPS", 27, 35.5,60.2,20);
        Monitor moni2 = new Monitor("Monitor Gamer", 380.0, "VA", 32, 45.5,70.2,25);

        Druker dru1 = new Druker("Drucker Multifunktion b/w", 250, "A4",200,"Laser");
        Druker dru2 = new Druker("Drucker Office Color", 200, "A4",100,"Inkjet");

        moni1.zeigeEinBild();
        moni2.zeigeEinBild();
        dru1.druckeSeite();
        dru2.druckeSeite();
        System.out.println("-----------");
        System.out.println(moni1);
        System.out.println(moni2);
        System.out.println(dru1);
        System.out.println(dru2);

        moni1.wasBinIch();
        dru1.wasBinIch();


    }
}
