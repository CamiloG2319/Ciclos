import java.util.Scanner;
import java.util.Random; 

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Scanner inicio = new Scanner(System.in);
        
        // Se crea un generador de números para el juego
        Random aleatorio = new Random();

        // Se le da el número aleatorio y se le pone el +1 para que vaya de 1 a 0 
        int numero = aleatorio.nextInt(100) + 1;

        // Se inicializa el valor que el usuario va a dar 
        int usuario;

        System.out.println("Bienvenido al juego de adivinar el número, dijite un número del 1 al 100");
        
        //Aquí el usuario le da el valor que cosidere que vaya de 1 a 100
        usuario = inicio.nextInt();

        // Se crea el bucle del juego, siempre y cuando el número del usuario sea distinto al número 
        // que dió el sistema entonces el ciclo no va a terminar 
        while(usuario != numero){

            if(usuario < numero){
                System.out.println("el número es mayor, elije otro: ");
            }

            else if (usuario > numero){
                System.out.println("el número es menor, elije otro: ");
            }
        
            else{
                System.out.println("No está entre las opciones");
            }

            usuario = inicio.nextInt();
        }
        
        System.out.println("¡FELICIDADES ADIVINASTE!");




    }          
}