/**
* Ejercicio 4
*
* Realiza un conversor de euros a pesetas.
* La cantidad en euros que se quiere convertir deberá estar almacenada en una variable.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio04{
  public static void main(String args[]){
    double euros = 5.0;
    double pesetas;

    pesetas = 166.39 * euros;

    System.out.printf("%.2f euros son %.2f pesetas \n", euros, pesetas);
  }
}