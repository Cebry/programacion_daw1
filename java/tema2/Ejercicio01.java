/**
* Ejercicio 1
*
* Escribe un programa en el que se declaren las variables enteras x e y .
* Asígnales los valores 144 y 999 respectivamente.
* A continuación, muestra por pantalla el valor de cada variable,
* la suma,
* la resta,
* la división y
* la multiplicación.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio01{
  public static void main(String args[]){
    int x = 144;
    int y = 999;

    System.out.println("x vale:\t" + x);
    System.out.println("y vale:\t" + y);
    System.out.println("x+y vale:\t" + (x+y));
    System.out.println("x-y vale:\t" + (x-y));
    System.out.println("x/y vale:\t" + x/y);
    System.out.println("x*y vale:\t" + x*y);
  }
}