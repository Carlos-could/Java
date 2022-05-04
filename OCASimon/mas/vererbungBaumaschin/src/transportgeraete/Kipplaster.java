package transportgeraete;

public class Kipplaster extends Transportgeraete{

    public int maxKippwinkel;

    public Kipplaster(int motorleistung, int maxKippwinkel) {
        super(motorleistung);
        this.maxKippwinkel = maxKippwinkel;
    }


}
