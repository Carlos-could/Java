public class WasKannMannMitLeeresInterfaceMachen {

    public void f1(){
        Katze felix = new Katze("Felix",3);
        felix.miaue();
    }
    public void f1(Object test) {
        System.out.println("Das Objekt test laesst Gruesssen!");
        Katze felix = new Katze("Felix", 3);
        felix.miaue();
    }
    public void f1(IDerDummy test) {
        System.out.println("Harr Harr Harr");
        System.exit(0);
    }


        public static void main(String[] args) {
        WasKannMannMitLeeresInterfaceMachen x = new WasKannMannMitLeeresInterfaceMachen();
        Hund fido = new Hund();
        x.f1(fido);
        System.out.println("------OVERLOADING------");
        x.f1();

    }
}
