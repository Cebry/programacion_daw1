/**
* Ejercicio 11
*
* Escribe un programa que dada una hora determinada (horas y minutos),
* calcule los segundos que faltan para llegar a la medianoche.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio11{
  public static void main(String args[]){
    if (args.length != 3) {
      System.out.println("\033[31m¡ERROR! La invocación al programa es 'java Ejercicio11 <horas> <minutos> <segundos>'.");
      System.exit(-1);
    }

    int horas = Integer.parseInt(args[0]);
    if (23 < horas || 0 > horas) {
      System.out.println("\033[31m¡ERROR! El atributo horas debe estar comprendido en el rango (0,23).");
      System.exit(-1);
    }
    int minutos = Integer.parseInt(args[1]);  
    if (60 < minutos || 0 > minutos) {
      System.out.println("\033[31m¡ERROR! El minutos horas debe estar comprendido en el rango (0,59).");
      System.exit(-1);
    }

    int segundos = Integer.parseInt(args[2]);
    if (60 < segundos || 0 > segundos) {
      System.out.println("\033[31m¡ERROR! El segundos horas debe estar comprendido en el rango (0,59).");
      System.exit(-1);
    }


    int segundosHastaMedianoche = 24 * 60 * 60;
    segundosHastaMedianoche -= (horas * 60 + minutos) * 60 + segundos;

    System.out.println("Faltan " + segundosHastaMedianoche + " segundos para llegar a la medianoche.");
  }
}