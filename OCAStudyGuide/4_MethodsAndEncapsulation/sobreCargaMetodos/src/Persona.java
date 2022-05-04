public class Persona {
    String name;
      int edad;
    String dni;
    public Persona (int edad){
        this.edad = edad;
    }
    Persona (int edad, String dni) {
        this.edad = edad;
        this.dni = dni;
    }
    public Persona () {

    }


    public static void main(String[] args) {

        Persona p1 = new Persona();
        System.out.println(p1.edad);

    }
}
