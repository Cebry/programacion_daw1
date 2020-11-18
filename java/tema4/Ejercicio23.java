/**
* Ejercicio 23
*
* Escribe un programa que calcule el precio final de un producto
* según su base imponible (precio antes de impuestos),
* el tipo de IVA aplicado (general, reducido o superreducido) y
* el código promocional.
* Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4% respectivamente.
* Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc
* que significan respectivamente que no se aplica promoción,
* el precio se reduce a la mitad,
* se descuentan 5 euros o
* se descuenta el 5%.
* El ejercicio se da por bueno si se muestran los valores correctos, aunque los números no estén tabulados.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio23{
  public static void main(String args[]){

    if (args.length != 3) {
      System.out.println("\033[31m¡ERROR! La invocación al programa es 'java Ejercicio23 <precio base> <tipo de iva> <codigo promocional>'.");
      System.exit(-1);
    }
    
    double precioBase = Double.parseDouble(args[0]);
    
    if(0 > precioBase) {
      System.out.println("\033[31m¡ERROR! El precio base debe ser mayor de 0'.");
      System.exit(-1);
        
    }

    String tipoIva = args[1];
    int iva = 0;

    switch (tipoIva){

      case "general":
        iva = 21;
      break;

      case "reducido":
        iva = 10;
      break;

      case "hiperreducido":
        iva = 4;
      break;

      default:
        System.out.println("\033[31m¡ERROR! El tipo de iva debe ser \"general\", \"reducido\" o \"hiperreducido\".");
        System.exit(-1);
      break;
    }

    String codigoPromocional = args[2];
    double precioFinal = 0;

    switch (codigoPromocional){

      case "nopro":
        precioFinal = precioBase + precioBase / 100 * iva;
      break;

      case "mitad":
        precioFinal = (precioBase + precioBase / 100 * iva) / 2;
      break;

      case "meno5":
        precioFinal = precioBase + precioBase / 100 * iva - 5;
      break;

      case "5porc":
        precioFinal = precioBase + precioBase / 100 * iva;
        precioFinal -= precioFinal / 100 * 5;
      break;

      default:
      System.out.println("\033[31m¡ERROR! El codigo promocional debe ser \"nopro\", \"mitad\", \"meno5\" o \"5porc\".");
      System.exit(-1);

      break;
    }

    System.out.println("El precio final es " + precioFinal + " euros.");
  }
}