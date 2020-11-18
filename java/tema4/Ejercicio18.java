/**
* Ejercicio 18
*
* scribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio18{
  public static void main(String[] args){
    if (args.length != 0) {
      System.out.println("\033[31m¡ERROR! No necesitas argumentos.");
      System.exit(-1);
    }

    System.out.printf("Introduce un número entero:\t");
    int numero = Integer.parseInt(System.console().readLine());

    if(-99999 > numero || 99999 < numero){
      System.out.println("\033[31m¡ERROR! El número debe estar comprendido en el rango (-99999, 99999).");
      System.exit(-1);
    }

    if(0 > numero){
      numero *= -1;
    }
    if(10 < numero){
      numero /= 10;
    }

    if(10 < numero){
      numero /= 10;
    }

    if(10 < numero){
      numero /= 10;
    }

    if(10 < numero){
      numero /= 10;
    }

    System.out.println("La primera cifra es " + numero);
  }
}