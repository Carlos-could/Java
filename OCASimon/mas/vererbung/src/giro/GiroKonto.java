package giro;
import konto.Konto;
import java.time.LocalDate;


public class GiroKonto extends Konto {

    private boolean plusSparer;
    private LocalDate stichtag;

    public GiroKonto(double saldo, boolean plusSparer, LocalDate stichtag) {
        super(saldo);
        this.plusSparer = plusSparer;
        this.stichtag = stichtag;
    }


    public boolean isPlusSparer (){
        return true;
    }

    public void setStichtag(LocalDate stichtag) {
        this.stichtag = stichtag;
    }


}
