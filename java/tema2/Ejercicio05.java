/**
* Ejercicio 5
*
* Realiza un conversor de pesetas a euros.
* La cantidad en pesetas que se quiere convertir deberá estar almacenada en una variable.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio05{
  public static void main(String args[]){
    double euros;
    double pesetas = 500.0;

    euros = pesetas / 166.39 ;

    System.out.printf("%.2f pesetas son %.2f euros \n", pesetas, euros);
  }
}