import java.util.ArrayList;

public interface I1 extends KomplizierteInterface{
    default void testeF1() {}
    default void testeF2(String n) {}
    //default String erzeugeMamaString(){return null;}
    default ArrayList<Integer> erzeugeAliste(int Anzahl){
        return null;
    }
}
