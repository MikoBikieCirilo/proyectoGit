
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a los Ejercicios !");
        System.out.println("La Media es :");
        int lista[] = {5, 5, 5};
        double media =
        calcularmedia(lista);
        System.out.println(media);
        System.out.println("Area Rectangulo :");
        double base=5.0;
        double altura=5.0;
        double Area=areaRectangulo(base,altura);
        System.out.println(Area);

        System.out.println("Area del Triangulo!");
        double baseT=15.0;
        double alturaT=6.0;
        double Areat=areaRectangulo(base,altura);
        System.out.println(Area);

    }

    public static double calcularmedia(int[] lista) {
        int suma = 0;
        for (int numero : lista) {
            suma = numero + suma;
        }
        return suma / lista.length;

    }

    public static double areaRectangulo(double base, double altura) {
        return base*altura;
    }

    public static double areaTriangulo(double base, double altura) {
        return base*altura/2;
    }
}

