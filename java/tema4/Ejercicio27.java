/**
* Ejercicio 27
*
* Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas.
* El programa preguntará primero de qué sabor quiere el usuario la tarta: manzana fresa o chocolate. 
* La tarta de manzana vale 18 euros y la de fresa 16.
* En aso de seleccionar la tarta de chocolate, el programa debe preguntar además
* si el chocolate es negro o blanco;
* la primera opción vale 14 euros y la segunda 15.
* Por último se pregunta si se añade nata y si se personaliza con un nombre;
* la nata suma 2.50 y la escritura del nombre 2.75.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio27{
  public static void main(String args[]){

  	if (args.length != 0) {
      System.out.println("\033[31m¡ERROR! No necesitas argumentos.");
      System.exit(-1);
    }
    
    System.out.println("Sabor: (manzana/fresa/chocolate)");
    String sabor = System.console().readLine();
    
    double precioTarta = 0;

    switch(sabor){
      case "manzana":
      	precioTarta = 18;
      break;
      case "fresa":
      	precioTarta = 16;
      break;
      case "chocolate":
    
	    System.out.println("Tipo de chocolate: (blanco/negro)");
	    String chocolate = System.console().readLine();
	    switch(chocolate){
	      case "blanco":
	      	precioTarta = 15;
	      break;
	      case "negro":
	      	precioTarta = 14;
	      break;
	      default:
	        System.out.println("\033[31m¡ERROR! El tipo de chocolate debe ser blanco o negro");
	        System.exit(-1);
	      break;
	    }
      break;
      default:
        System.out.println("\033[31m¡ERROR! El dia sabor debe ser manzana, fresa o chocolate");
        System.exit(-1);
      break;
    }

	System.out.println("Nata: (true/false)");
    boolean nata = Boolean.parseBoolean(System.console().readLine());

	System.out.println("Nombre personalizado: (true/false)");
    boolean nombrePersonalizado = Boolean.parseBoolean(System.console().readLine());

    double precioTotal = precioTarta;
    System.out.println("precio tarta:\t" + precioTarta);
    if (nata){
    System.out.println("precio nata:\t2.50");
    	precioTotal += 2.5;
    }

    if (nombrePersonalizado){
    	precioTotal += 2.75;
    	System.out.println("precio nombre:\t2.75");
    }

    System.out.println("precio total:\t" + precioTotal);
    
  }
}