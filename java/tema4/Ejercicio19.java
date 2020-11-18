/**
* Ejercicio 19
*
* Realiza un programa que nos diga cuántos dígitos tiene un número entero 
* que puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio19{
  public static void main(String args[]){
    
    if (args.length != 0) {
      System.out.println("\033[31m¡ERROR! No necesitas argumentos.");
      System.exit(-1);
    }

    System.out.printf("Introduce un número entero:\t");
    int numero = Integer.parseInt(System.console().readLine());
    int digitos = 1;
    
    if(-99999 > numero || 99999 < numero){
      System.out.println("\033[31m¡ERROR! El número debe estar comprendido en el rango (-99999, 99999).");
      System.exit(-1);
    }

    if(0 > numero){
      numero *= -1;
    }

  if(0 < (numero / 10)){
      digitos++;
      numero /= 10; 
    }

  if(0 < (numero / 10)){
      digitos++;
      numero /= 10; 
    } 

  if(0 < (numero / 10)){
      digitos++;
      numero /= 10; 
    } 

  if(0 < (numero / 10)){
      digitos++;
      numero /= 10; 
    }

    System.out.println("El numero tiene " + digitos + " digitos.");
  }
}