/**
* Ejercicio 2
*
* Realiza un conversor de euros a pesetas. 
* La cantidad de euros que se quiere convertir debe ser introducida por teclado.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio02{
  public static void main(String args[]){

  	System.out.printf("euros:\t");
    double euros = Double.parseDouble( System.console().readLine() );
    double pesetas;

    pesetas = 166.39 * euros;

    System.out.printf("%.2f euros son %.2f pesetas \n", euros, pesetas);
  }
}