import java.util.Scanner;
import java.util.InputMismatchException;

public class Tablas {
    public static void main(String[] args) {
    Scanner inicio = new Scanner(System.in);

    int numero;
    
    System.out.println("Elije un número al que desees conocer su tabla de multiplicar");
    
            try {
                numero = inicio.nextInt();

                for(int i = 1; i <= 10; i++){
                System.out.println(numero + "x" + i + " " + "=" + " " + numero * i );
                }
            }
            catch (InputMismatchException e) {
            System.out.println("¡Error! Opción no valida.");
            }
    }
}
