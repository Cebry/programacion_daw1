/**
* Ejercicio 11
*
* Realiza un conversor de Kb a Mb.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio11{
  public static void main(String args[]){
    System.out.printf("kb:\t");
    double kb = Double.parseDouble( System.console().readLine() );

    double mb = kb / 1000;

    System.out.println("mb:\t" + mb);
  }
}