/**
* Ejercicio 20
*
* Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa.
* Se permiten números de hasta 5 cifras.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio20{
  public static void main(String args[]){
    
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

    boolean capicua = true;

    if(0 > numero){
      numero *= -1;
    }

    if(0 < (numero / 10000)){
      if((numero / 10000) != (numero % 10)){
        capicua = false;
      }
      numero %= 10000;
      numero /= 10;
      System.out.println(numero);
    }

    if(0 < (numero / 1000) && capicua){
      if((numero / 1000) != (numero % 10)){
        capicua = false;
      }
      numero %= 1000;
      numero /= 10;
      System.out.println(numero);
    }

    if(0 < (numero / 100) && capicua){
      if((numero / 100) != (numero % 10)){
        capicua = false;
      }
      numero %= 100;
      numero /= 10;
      System.out.println(numero);
    }

    if(0 < (numero / 10) && capicua){
      if((numero / 10) != (numero % 10)){
        capicua = false;
      }
    }

    if(capicua){
      System.out.println("El numero es capicua");
    }
    else{
      System.out.println("El numero no es capicua");
    }

  }
}