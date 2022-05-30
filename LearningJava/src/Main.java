import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /* Dado dos números enteros, comprobar si uno es divisible por el otro
        e imprimir falso o verdadero según sea el caso*/

        int numeroUno = 10;
        int numeroDos = 21;
        boolean respuesta;

        if (numeroUno % numeroDos == 0) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        System.out.println(respuesta);

         /*Dadas dos cadenas de texto comparar si son diferentes o iguales
         e indicarlo mediante un mensaje.*/

        String nombre = "Liliana";
        String nombreDado = "Liliana";

        if (nombre.equals(nombreDado)) {
            System.out.println("Su nombre de usuario es correcto.");
        } else {
            System.out.println("Su nombre de usuario es incorrecto.");
        }

        /* Dado dos números enteros, determinar cuál es mayor,
        cuál es menor o si son iguales. Imrpimirla la respuesta. */

        Integer cifraUno = 23;
        Integer cifraDos = 21;

        if (cifraUno.compareTo(cifraDos) == 0) {
            System.out.println("Ambas cifras son iguales.");
        } else if (cifraUno.compareTo(cifraDos) > 0) {
            System.out.println("La cifra uno " + "(" + cifraUno + ") " + "es mayor que la cifra dos " + "(" + cifraDos + ").");
        } else {
            System.out.println("La cifra dos " + "(" + cifraDos + ") " + "es mayor que la cifra uno " + "(" + cifraUno + ").");
        }

         /*Ingresar por consola nombre y apellido por separado,
        y a partir de estas variables obtener en una tercera: las iniciales. */

        Scanner scanner;
        scanner = new Scanner(System.in);
        String miNombre;
        String miApellido;
        System.out.println("Ingresa tu nombre");
        miNombre = scanner.nextLine();
        System.out.println("Ingresa tu apellido");
        miApellido = scanner.nextLine();
        StringBuilder iniciales = new StringBuilder();
        iniciales.append(miNombre.charAt(0));
        iniciales.append(miApellido.charAt(0));
        System.out.println(iniciales);

        // Dado un numero ingresado por consola, verificar si es primo.

        System.out.println("Ingrese numero para comprobar si es primo");
        int numero = scanner.nextInt();
        boolean respuestaPrimo = true;
        if (numero == 0 || numero == 1 || numero == 4) {
            respuestaPrimo = false;
        }
        for (int i = 2; i < numero / 2; i++) {
            // Si es divisible por cualquiera de estos números, no es primo
            if (numero % i == 0){
                respuestaPrimo = false;
            }
        }System.out.println(respuestaPrimo);

    };

    //AQUI TERMINA EL MÉTODO MAIN

    //AQUI SE LLAMAN LOS DOS METODOS UBICADOS DENTRO DE LA CLASE MAIN

    boolean pruebaFuncionDivisible = esDivisible(8, 6);
    boolean pruebaPrimo = esPrimo(4);

    //AQUI SE AGREGAN DOS MÉTODOS MÁS A LA CLASE

    /* función que dado dos valores compruebe si el primero es divisible por el segundo
       y devolver falso o verdadero según sea el caso*/
    boolean esDivisible(int valorUno, int valorDos){
        boolean solucion;
        if(valorUno % valorDos == 0){
            solucion = true;
            System.out.println(solucion);
        } else {
            solucion = false;
            System.out.println(solucion);
        }
        return solucion;
    }
// Dado un numero, preguntar si es primo o no

    boolean esPrimo(int num){
        boolean prime = true;
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            return false;
        }else {
            return true;
        }
    }
}
