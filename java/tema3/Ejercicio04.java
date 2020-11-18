/**
* Ejercicio 4
*
* Escribe un programa que sume, reste, multiplique y divida dos números introducidos por teclado.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio04{
  public static void main(String args[]){

    System.out.printf("x:\t");
    double x = Double.parseDouble( System.console().readLine() );

    System.out.printf("y:\t");
    double y = Double.parseDouble( System.console().readLine() );

    System.out.println(x + " + " + y + " = " + (x+y) );
    System.out.println(x + " - " + y + " = " + (x-y) );
    System.out.println(x + " * " + y + " = " + (x*y) );
    System.out.println(x + " / " + y + " = " + (x/y) );
  }
}