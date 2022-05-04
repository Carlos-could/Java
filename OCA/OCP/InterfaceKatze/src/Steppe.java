public class Steppe implements ErzeugeAnimals{

    @Override
    public Katze erzeugeKatze(String x, int y) {
        return new Katze(x, y);
    }

    @Override
    public void werdeLaut() {
        System.out.println("Die Steppe wird Laut");
    }
}
