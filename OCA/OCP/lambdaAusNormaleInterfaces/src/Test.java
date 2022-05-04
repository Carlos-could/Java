import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        I1 lambda1 = ()-> {return "hi mama!";};
        String ergebnis = lambda1.erzeugeMamaString();
        System.out.println(ergebnis);

        I2 lambda2 = ()->System.out.println("Hallo Papa");
        lambda2.testeF1();
        I3 lambda3 = (s)->System.out.println("du hast " +s+ " geschrieber");
        lambda3.testeF2("Juan Carlos");

        I4 lambda4 = (anzahl)->
        {
            ArrayList<Integer> erg = new ArrayList<>();
            for (int i =0; i<anzahl; i++){
                erg.add(i);
            }
            return erg;
        };

        for(Integer x : lambda4.erzeugeAliste(10)) {
            System.out.println("x ist" + x);
        }

    }
}
