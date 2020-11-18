/**
* Ejercicio 03
*
* Escribe un programa en que dado un número del 1 a 7 
* escriba el correspondiente nombre del día de la semana.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio03{
  public static void main(String args[]){

    if (args.length != 1) {
      System.out.println("\033[31m¡ERROR! La invocación al programa es 'java Ejercicio03 <numero de dia>'.");
      System.exit(-1);
    }

    int dia = Integer.parseInt(args[0]);
    String nombreDia = "";

    switch (dia) {
      case 1:
        nombreDia = "lunes";
      break;

      case 2:
        nombreDia = "martes";
      break;

      case 3:
        nombreDia = "miercoles";
      break;

      case 4:
        nombreDia = "jueves";
      break;
      
      case 5:
        nombreDia = "viernes";
      break;
      
      case 6:
        nombreDia = "sabado";
      break;
      
      case 7:
        nombreDia = "domingo";
      break;
      
      default:
        System.out.println("\033[31m¡ERROR! El numero de dia debe estar comprendido en el rango (1,7)");
        System.exit(-1);
      break;
    }

    System.out.println("El día " + dia + " es " + nombreDia + ".");
  }
}