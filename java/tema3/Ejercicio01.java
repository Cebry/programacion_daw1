/**
* Ejercicio 1
*
* Realiza un programa que pida dos números y que luego muestre el resultado de su multiplicación.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio01{
  public static void main(String args[]){

    System.out.printf("factor x:\t");
    int x = Integer.parseInt( System.console().readLine() );

    System.out.printf("factor y:\t");
    int y = Integer.parseInt( System.console().readLine() );

    System.out.println(x + " * " + y + " = " + (x*y) );
  }
}