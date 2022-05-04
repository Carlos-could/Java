import java.util.ArrayList;

public interface KomplizierteInterface {
    void testeF1();
    void testeF2(String n);
    String erzeugeMamaString(); // die implementation soll "mama" rauswerfen
    ArrayList<Integer> erzeugeAliste(int Anzahl);

    // Erzeuge 4 "Kunktionale Interfaces"
    // Kinder von dieses Interface Mittels Trick "default Funktionen
    // und erzeuge in ein Test Program (mit public static void main) vier lambdas,
    // eine pro "abgeleitete Funktionale Interface"
}
