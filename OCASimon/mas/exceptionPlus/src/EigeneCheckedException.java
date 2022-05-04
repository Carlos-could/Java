public class EigeneCheckedException extends Exception {
    public EigeneCheckedException() {
        super("Ich bin deine Exception");
    }

    public EigeneCheckedException (String fehlermeldung) {
        super(fehlermeldung);
    }
}
