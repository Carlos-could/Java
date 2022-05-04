public class Main2 {
    public static void main(String[] args) {
/*        try{
        System.out.println(berechneDivision(10, 3)); // 10/3 muestra exception 10/2 no
        } catch (EigeneUnCheckedException e){
            System.out.println(e.toString());
        }
    }

    public static int berechneDivision (double a, double b) throws EigeneUnCheckedException {
        int c = (int) (a/b);
        double d = a/b;
        if ((c!=d)){
            throw new EigeneUnCheckedException("Keine Ganzzahl");
        }
        return c;
    }
} */

        try{
           System.out.println(berechneDivision(10, 2)); // 10/3 muestra exception 10/2 no
        } catch (EigeneCheckedException e){
            System.out.println(e.toString());
        }
    }

    public static int berechneDivision (double a, double b) throws EigeneCheckedException {
        int c = (int) (a/b);
        double d = a/b;
        if ((c!=d)){
            throw new EigeneCheckedException("Keine Ganzzahl");
        }
        return c;
    }
}


