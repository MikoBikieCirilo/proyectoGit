import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc ;
        sc = new Scanner(System.in);//utilizamos el Scnner statico para toda la clase
        //hacemos un dowhile para elegir la opcion a utilizar en el centro de ventas
        String opcion = " ";//cogemos el numero. usamos el string next(), por si uno pone una letra que no se rompa el programa.
        do {//utlizamos el do while para obligar al usuario a elegir el color para jugar.
            System.out.println("La Calculadora tiene las siguientes opciones :");
            System.out.println("1.Sumar ");
            System.out.println("2.Restar ");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("0.Salir");
            System.out.println("¿ Que opcion quieres realizar ?");
            opcion = sc.nextLine();
            switch (opcion) {//utilizamos el switch para los casos que tenemos para la eleccion del turno.
                case "1":
                    System.out.println("La Suma de los dos numeros es:");
                    System.out.println("Introduce el numero 1 :");
                    double num1 = sc.nextInt();
                    System.out.println("Introduce el numero 2 :");
                    double num2 = sc.nextInt();
                    double suma = calculaSuma(num1, num2);
                    System.out.println("La Suma es="+suma);

                    break;
                case "2":
                    System.out.println("La Resta de los dos numeros es:");
                    System.out.println("Introduce el numero 1 :");
                    double nu1 = sc.nextInt();
                    System.out.println("Introduce el numero 2 :");
                    double nu2 = sc.nextInt();
                    double resta = calculaResta(nu1, nu2);
                    System.out.println("La Resta es="+resta);

                    break;

                case "3":
                    System.out.println("La Multiplicacion de los dos numeros es:");
                    System.out.println("Introduce el numero 1 :");
                    double n1 = sc.nextInt();
                    System.out.println("Introduce el numero 2 :");
                    double n2 = sc.nextInt();
                    double multi = calculaMultiplicacion(n1, n2);
                    System.out.println("La Multiplicacion es="+multi);

                    break;

                case "4":
                    System.out.println("La Division de los dos numeros es:");
                    System.out.println("Introduce el numero 1 :");
                    double nU1 = sc.nextInt();
                    System.out.println("Introduce el numero 2 :");
                    double nU2 = sc.nextInt();
                    double divi = calculaDivision(nU1, nU2);
                    System.out.println("La Division es="+divi);
                    break;

                case "0":
                    System.out.println("Hasta luego!!");

                    break;
                default:
                    System.out.println("Opcion no valido de 0 o 4 :");
                    break;
            }
        } while (!opcion.equals("0"));

    }

    public static double calculaSuma(double num1, double num2) {
        return num1 + num2;
    }

    public static double calculaResta(double num1, double num2) {
        return num1 - num2;
    }

    public static double calculaMultiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public static double calculaDivision(double num1, double num2) {
        if(num2==0){
          return 0;
        }
        return num1/num2;
    }
}

