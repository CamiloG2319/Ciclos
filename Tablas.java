import java.util.Scanner;
import java.util.InputMismatchException;

public class Tablas {
    public static void main(String[] args) {
    Scanner inicio = new Scanner(System.in);

    // Inicializar la variable 
    int numero;
    
    System.out.println("Elije un número al que desees conocer su tabla de multiplicar");
    
    // Se agrega el Try catch para que encuentre algún error
    // u opción no válida para este ejercicio 
            try {
                numero = inicio.nextInt();

                for(int i = 1; i <= 10; i++){
                System.out.println(numero + "x" + i + " " + "=" + " " + numero * i );
                }
            }
            catch (InputMismatchException e) {

            // Este es el texto que lanza cuando el dato ingresado no 
            // Corresponde a algún número natural
            System.out.println("¡Error! Opción no valida.");
            }
    }
}
