import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws Exception {
        m1(); //Line 3
    }

    private static void m1() throws Exception { //Line 6
        System.out.println("NOT THROWING ANY EXCEPTION"); //Line 7
    }
}