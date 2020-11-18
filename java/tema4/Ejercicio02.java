/**
* Ejercicio 2
*
* Realiza un programa que pida una hora por teclado y 
* que muestre luego buenos días, 
* buenas tardes o 
* buenas noches según la hora. 
* Se utilizarán los tramos
* de 6 a 12, 
* de 13 a 20 y 
* de 21 a 5. respectivamente. 
* Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio02{
  public static void main(String args[]){
    if (args.length != 0) {
      System.out.println("\033[31m¡ERROR! No necesitas argumentos.");
      System.exit(-1);
    }

    System.out.println("¿Qué hora es?");
    int hora = Integer.parseInt(System.console().readLine());

    if (0 < hora && 25 > hora) {
      if (6 <= hora && 12 >= hora) {
        System.out.println("Buenos días.");
      }
      else{
        if (12 <= hora && 20 >= hora) {
          System.out.println("Buenas tardes.");
        }
        else{
          if (21 <= hora || 6 >= hora) {
            System.out.println("Buenas noches.");
          }
        }
      }
    }
    else{
      System.out.println("\033[31m¡ERROR! La hora del día debe estar comprendida en el rango (1, 24).");
    }
  }
}