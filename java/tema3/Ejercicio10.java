/**
* Ejercicio 10
*
* Realiza un conversor de Mb a Kb.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio10{
  public static void main(String args[]){
    System.out.printf("mb:\t");
    double mb = Double.parseDouble( System.console().readLine() );

    double kb = mb * 1000;

    System.out.println("kb:\t" + kb);
  }
}