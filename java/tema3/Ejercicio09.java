/**
* Ejercicio 9
*
* Escribe un programa que calcule el volumen de un cono según la fórmula V = 1/3 πr^2 h
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio09{
  public static void main(String argvs[]){
  	System.out.printf("factor radio:\t");
    double radio = Double.parseDouble( System.console().readLine() );

    System.out.printf("factor altura:\t");
    double altura = Double.parseDouble( System.console().readLine() );

    double volumen = Math.PI * radio * radio * altura / 3.0;

    System.out.println("volumen =\t" + volumen);
  }
}