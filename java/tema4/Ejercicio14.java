/**
* Ejercicio 14
*
* Realiza un programa que diga si un número introducido por teclado es par y/o
* divisible entre 5.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio14{
  public static void main(String args[]){

    if (args.length != 0) {
      System.out.println("\033[31m¡ERROR! No necesitas argumentos.");
      System.exit(-1);
    }

    System.out.printf("Escribe un número:\t");
    int numero = Integer.parseInt(System.console().readLine());

    boolean divisible = false;

	  if(numero % 2 == 0.0){
    	divisible = true;
      System.out.println("El número es divisible entre 2");	  	
	  }

	  if(numero % 5 == 0.0){
    	divisible = true;
      System.out.println("El número es divisible entre 5");
	  }

	  if(! divisible){
      System.out.println("El número no es divisible entre 2 o 5");
	  }
  }
}