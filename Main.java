import java.util.Scanner;
import java.util.InputMismatchException;
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

            // Intentamos leer el siguiente intento del usuario
            try {
             usuario = inicio.nextInt();
            } 
            catch (InputMismatchException e) {
            System.out.println("¡Error! Debes ingresar un número, las letras no son válidas.");

            // IMPORTANTE: Limpia la letra incorrecta del búfer para evitar un bucle infinito
            inicio.next(); 

            // Asignamos un valor temporal que no afecte la lógica para que el bucle continúe
            usuario = -1;  
            }

        }
        
        System.out.println("¡FELICIDADES ADIVINASTE!");

        
    }          
    }