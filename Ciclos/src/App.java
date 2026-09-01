import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op = 0;

        while (op != 5) {

        
           System.out.println("+----------------------------------------------------------+");
            System.out.println("|                                                          |");
            System.out.println("|       ____ ___ ____ _      ___  ____                    |");
            System.out.println("|      / ___|_ _/ ___| |    / _ \\/ ___|                   |");
            System.out.println("|     | |    | | |    | |   | | | \\___ \\                   |");
            System.out.println("|     | |___ | | |___ | |___| |_| |___) |                  |");
            System.out.println("|      \\____|___\\____||_____|\\___/|____/                   |");
            System.out.println("|                                                          |");
            System.out.println("+==========================================================+");
            System.out.println("|                    >>> CICLOS <<<                       |");
            System.out.println("+----------------------------------------------------------+");
            System.out.println("|                                                          |");
            System.out.println("|       [1]  Suma Fibonacci                                |");
            System.out.println("|       [2]  Primo N                                       |");
            System.out.println("|       [3]  Ecuacion Cuadratica                           |");
            System.out.println("|       [4]  Promedio                                      |");
            System.out.println("|       [5]  Salir                                         |");
            System.out.println("|                                                          |");
            System.out.println("+----------------------------------------------------------+");


            try {

                op = sc.nextInt();

                if (op == 1) {

                    System.out.print("Cantidad n: ");
                    int n = sc.nextInt();

                    long a = 0;
                    long b = 1;
                    long suma = 0;

                    for (int i = 0; i < n; i++) {

                        suma = suma + a;

                        long siguiente = a + b;
                        a = b;
                        b = siguiente;
                    }

                    System.out.println("Suma: " + suma);
                }

                else if (op == 2) {

                    System.out.print("Posicion n: ");
                    int n = sc.nextInt();

                    int contador = 0;
                    int numero = 2;

                    while (contador < n) {

                        boolean primo = true;

                        for (int i = 2; i < numero; i++) {

                            if (numero % i == 0) {
                                primo = false;
                                break;
                            }
                        }

                        if (primo) {
                            contador++;
                        }

                        if (contador < n) {
                            numero++;
                        }
                    }

                    System.out.println("El primo es: " + numero);
                }

                else if (op == 3) {

                    System.out.print("a: ");
                    double a = sc.nextDouble();

                    System.out.print("b: ");
                    double b = sc.nextDouble();

                    System.out.print("c: ");
                    double c = sc.nextDouble();

                    double d = b * b - 4 * a * c;

                    if (d >= 0) {

                        double x1 = (-b + Math.sqrt(d)) / (2 * a);
                        double x2 = (-b - Math.sqrt(d)) / (2 * a);

                        System.out.println("x1 = " + x1);
                        System.out.println("x2 = " + x2);

                    } else {

                        double real = -b / (2 * a);
                        double imaginario = Math.sqrt(-d) / (2 * a);

                        System.out.println("x1 = " + real + " + " + imaginario + "i");
                        System.out.println("x2 = " + real + " - " + imaginario + "i");
                    }
                }

                else if (op == 4) {

                    System.out.print("Cuantos numeros?: ");
                    int n = sc.nextInt();

                    double suma = 0;

                    for (int i = 1; i <= n; i++) {

                        System.out.print("Num " + i + ": ");
                        suma = suma + sc.nextDouble();
                    }

                    System.out.println("Promedio: " + (suma / n));
                }


                else if (op == 5) {

                    System.out.println("Saliendo del programa...");
                }

                else {

                    System.out.println("Opcion no valida.");
                }

            } catch (Exception e) {

                System.out.println("Error: Ingrese un dato valido.");
                sc.nextLine();
            }
        }

        sc.close();
    }
}