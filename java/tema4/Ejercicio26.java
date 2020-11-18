/**
* Ejercicio 26
*
* Realiza un programa que calcule el precio de unas entradas de cine en función
* del número de personas y
* del día de la semana.
* El precio base de una entrada son 8 euros.
* El miércoles (día del espectador), el precio base es de 5 euros.
* Los jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
* Con la tarjeta CineCampa se obtiene un 10% de descuento.
* Si un jueves, un grupo de 6 personas compran entradas,
* el precio total sería de 33 euros ya que son 3 parejas;
* pero si es un grupo de 7, pagarán 3 entradas de pareja más 1 individual
* que son 41 euros (33 + 8).
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio26{
  public static void main(String args[]){
   if (args.length != 3) {
      System.out.println("\033[31m¡ERROR! La invocación al programa es 'java Ejercicio26 <entradas> <dia> <tarjeta>'.");
      System.exit(-1);
    }
    
    int entradas = Integer.parseInt(args[0]);
    if(0 >= entradas){
      System.out.println("\033[31m¡ERROR! El numero de entradas debe ser mayor de 0");
    }

    String dia = args[1];
    switch(dia){
      case "lunes":
      break;
      case "martes":
      break;
      case "miercoles":
      break;
      case "jueves":
      break;
      case "viernes":
      break;
      case "sabado":
      break;
      case "domingo":
      break;
      default:
        System.out.println("\033[31m¡ERROR! El dia debe estar en el rango (lunes, domingo)");
        System.exit(-1);
      break;
    }

    boolean tarjeta = Boolean.parseBoolean(args[2]);
    double precioTotal = 5 * entradas;
    
    if(dia.equals("miercoles")){

      precioTotal = 5 * entradas;
    }

    else{
      if(dia.equals("jueves")){
        precioTotal = entradas / 2 * 11;
        if(0 != precioTotal % 2){
          precioTotal += 8  -(11/2);
        }
      }
      else{
        precioTotal = entradas * 8;
      }
    }

    if(tarjeta){
      precioTotal -= precioTotal / 100 * 10;
    }

    System.out.println("El precio total es: " + precioTotal + " euros.");
  }
}