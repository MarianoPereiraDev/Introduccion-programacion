public class Main {
    public static void main(String[] args) {
        int numero1=10;
        int numero2=50;
        int numero3=30;
        int totalSuma;
        totalSuma= Suma(numero1,numero2,numero3);
        System.out.println("El total de la suma es: " + totalSuma);
    }

    public static int Suma(int termino1,int termino2,int termino3){
        return termino1 + termino2 + termino3;
    }
}