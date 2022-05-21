public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        System.out.println("El numero de puertas de mi coche es: " + miCoche.numeroPuertas);

    }
}

class Coche{
    int numeroPuertas=4;

    public void agregarPuertas(){
        this.numeroPuertas++;
    }
}