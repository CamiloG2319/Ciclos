import java.util.Scanner;
import java.util.InputMismatchException;

public class Tablas {
    public static void main(String[] args) {
    Scanner inicio = new Scanner(System.in);

    System.out.println("""
    
    ████████╗ █████╗ ██████╗ ██╗      █████╗ ███████╗
    ╚══██╔══╝██╔══██╗██╔══██╗██║     ██╔══██╗██╔════╝
       ██║   ███████║██████╔╝██║     ███████║███████╗
       ██║   ██╔══██║██╔══██╗██║     ██╔══██║╚════██║
       ██║   ██║  ██║██████╔╝███████╗██║  ██║███████║
       ╚═╝   ╚═╝  ╚═╝╚═════╝ ╚══════╝╚═╝  ╚═╝╚══════╝

              ✦ TABLA DE MULTIPLICAR ✦
    """);


    // Inicializar la variable 
    int numero;
    
    System.out.print("Elije un número al que desees conocer su tabla de multiplicar: ");
    
    
    // Se agrega el Try catch para que encuentre algún error
    // u opción no válida para este ejercicio 
            try {
                numero = inicio.nextInt();

                System.out.println("\n╔══════════════════════════╗");
                System.out.printf("║       TABLA DEL %-10d║%n", numero);
                System.out.println("╠══════════════════════════╣");

                for(int i = 1; i <= 10; i++){
                System.out.println( numero + "x" + i + " " + "=" + " " + numero * i );
                }
                System.out.println("╚══════════════════════════╝");
            }
            catch (InputMismatchException e) {

            // Este es el texto que lanza cuando el dato ingresado no 
            // Corresponde a algún número natural
            System.out.println("¡Error! Opción no valida.");
            }
    }
}
