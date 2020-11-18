/**
* Ejercicio 13
*
* Escribe un programa que ordene tres números enteros introducidos por teclado.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio13{
  public static void main(String args[]){

    if (args.length != 0) {
      System.out.println("\033[31m¡ERROR! No necesitas argumentos.");
      System.exit(-1);
    }

    System.out.printf(" escribe un número:\t");
    int a = Integer.parseInt(System.console().readLine());
    System.out.printf(" escribe un número:\t");
    int b  = Integer.parseInt(System.console().readLine());
    System.out.printf(" escribe un número:\t");
    int c = Integer.parseInt(System.console().readLine());

    int mayor = 0;
    int medio = 0;
    int menor = 0;

    if(a >= b && a >= b){
        mayor = a;
      if(b >= c){
        medio = b;
        menor = c;
      }
      else{
        medio = c;
        menor = b;

      }
    }
    else{
      if(b >= a && b >= c){
        mayor = b;
        if(a >= c){
        medio = a;
        menor = c;

        }
        else{
        medio = c;
        menor = a;

        }
      }
      else{
        mayor = c;
        if(a >= b){
          medio = a;
          menor = b;
        }
        else{
          medio = b;
          menor = a;
        }
      }
    }

    System.out.println(mayor + " >= " + medio + " >= " + menor);
  }
}