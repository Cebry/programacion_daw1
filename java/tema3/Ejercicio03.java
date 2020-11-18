/**
* Ejercicio 3
*
* Realiza un conversor de pesetas a euros.
* La cantidad de pesetas que se quiere convertir debe ser introducida por teclado.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio03{
  public static void main(String args[]){

  	System.out.printf("euros:\t");
    double pesetas = Double.parseDouble( System.console().readLine() );
    double euros;


    euros = pesetas / 166.39 ;

    System.out.printf("%.2f pesetas son %.2f euros \n", pesetas, euros);
  }
}