public class EigeneUnCheckedException extends RuntimeException {
    public EigeneUnCheckedException() {
        super("Deine eigene EigeneUnCheckedException");
    }

    public EigeneUnCheckedException(String msg) {
        super(msg);
    }
}
