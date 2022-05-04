public class KatzenSteppe implements ErzeugeKatze{
    @Override
    public Katze erzeugeKatze(String x, int y) {
        return new Katze(x,y);
    }
}
