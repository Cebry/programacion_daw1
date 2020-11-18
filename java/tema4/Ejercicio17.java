/**
* Ejercicio 17
*
* Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio17{
  public static void main(String[] args){
    if (args.length != 0) {
      System.out.println("\033[31m¡ERROR! No necesitas argumentos.");
      System.exit(-1);
    }

    int ultimaCifra = 0;
    System.out.printf("Introduce un número entero:\t");
    int numero = Integer.parseInt(System.console().readLine());
    
    if(0 > numero){
      numero /= -1;
    }
    
    ultimaCifra = numero % 10;


   System.out.println("La última cifra es " + ultimaCifra);
  }
}