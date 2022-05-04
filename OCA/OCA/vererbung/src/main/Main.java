package main;

import giro.GiroKonto;
import sparbuch.Sparbuch;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

//        Konto k1 = new Konto(20.2);
        GiroKonto g1 = new GiroKonto(20.2,true, LocalDate.now());
        Sparbuch s1 = new Sparbuch(20.2, 3.5);

        g1.hebenGeld(50.0);
        System.out.println(g1.getSaldo() );

        g1.zahleGeldEin(600.0);
        System.out.println(g1.getSaldo() );

        if (g1.getSaldo()< s1.getSaldo())
            System.out.println("x");
    }

}
