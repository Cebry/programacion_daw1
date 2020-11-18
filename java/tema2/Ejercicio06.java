/**
* Ejercicio 6
*
* Escribe un programa que calcule el total de una factura a partir de la base imponible
* (precio sin IVA). La base imponible estará almacenada en una variable.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio06{
  public static void main(String args[]){
    double baseImponible = 30.56;
    double iva = 25.0;

    double total = baseImponible + baseImponible / 100 * iva;

    System.out.println("base imponible:\t" + baseImponible);
    System.out.println("IVA:\t\t" + iva + " %");
    System.out.printf("total:\t\t%.2f euros\n", total);
  }
}