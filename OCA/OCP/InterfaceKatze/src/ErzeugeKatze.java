public interface ErzeugeKatze extends ErzeugeAnimals{

    default void werdeLaut(){
        System.out.println("NixNixNixNix");
    }
}
