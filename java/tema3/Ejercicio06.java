/**
* Ejercicio 6
*
* Escribe un programa que calcule el área de un triángulo.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio06{
  public static void main(String args[]){

    System.out.printf("base:\t");
    double base = Double.parseDouble( System.console().readLine() );

    System.out.printf("altura:\t");
    double altura = Double.parseDouble( System.console().readLine() );

    System.out.println("area (triangulo)= " + (base * altura / 2) );
  }
}