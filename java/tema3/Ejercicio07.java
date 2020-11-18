/**
* Ejercicio 7
*
* Escribe un programa que calcule el total de una factura a partir de la base imponible.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio07{
  public static void main(String args[]){

    System.out.printf("base imponible:\t");
    double baseImponible = Double.parseDouble( System.console().readLine() );

    System.out.printf("IVA:\t\t");
    double iva = Double.parseDouble( System.console().readLine() );
    double total = baseImponible + baseImponible / 100 * iva;
    System.out.println("-------------------------");

    System.out.printf("base imponible:\t%.2f\teuros\n", baseImponible);
    System.out.printf("IVA:\t\t%.2f\t%%\n", iva);
    System.out.printf("total:\t\t%.2f\teuros\n", total);
  }
}