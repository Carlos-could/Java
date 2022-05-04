public class TesteKlasseAusInterfaces {

    public static void main(String[] args) {

        WichtigeKlasse w = new WichtigeKlasse();
        w.sageKrokodil();
            // hier kann man keine Lambdas erzeugen
        //----------------------
        KlasseNr1 n1 = new KlasseNr1();
        n1.tue1();
        //Lambda?
        IDerEineFunktionInterface1 lambda1 = ()-> System.out.println("Lambda für I1");
        lambda1.tue1();

        //-----------------------
        KlasseNr2 n2  = new KlasseNr2();
        n2.tue2("Carlos", 123);
        //Lambda?
        IDerEineFunktionInterface2 lambda2 = (belzebub, asmodeus) ->
        {System.out.println(belzebub + "laesst Gruessen");
            System.out.println(asmodeus + "laesst auch Gruessen");};
        lambda2.tue2("Carlos", 1000);

        //-----------------------------
        Steppe kilimanjato = new Steppe();
        Katze mini = kilimanjato.erzeugeKatze("Feo", 5);
        mini.miaue();
        kilimanjato.werdeLaut();
        // Kann "die Steppe keine Lambda erzeugen
        //-----------------------------
        KatzenSteppe cairo = new KatzenSteppe();
        Katze ammonRa = cairo.erzeugeKatze("Der Gott Amon Ra", 1000);
        ammonRa.miaue();
        cairo.werdeLaut();
        //Lambda
        ErzeugeKatze ek =(belzebub, asmodeus)->{ return new Katze(belzebub,asmodeus);};
        Katze binbin = ek.erzeugeKatze("Mimi die Schnurrige",22);
        binbin.miaue();




    }
}
