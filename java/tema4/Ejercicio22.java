/**
* Ejercicio 22
*
* Realiza un programa que, dado un día de la semana (de lunes a viernes)
* y una hora (horas y minutos),
* calcule cuántos minutos faltan para el fin de semana.
* Se considerará que el fin de semana comienza el viernes a las 15:00h.
* Se da por hecho que el usuario introducirá un día y hora correctos, anterior al viernes a las 15:00h.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio22{
  public static void main(String args[]){
    if (args.length != 3) {
      System.out.println("\033[31m¡ERROR! La invocación al programa es 'java Ejercicio22 <dia> <horas> <minutos>'.");
      System.exit(-1);
    }
    int minutosHastaFinSemana = (4 * 24 + 15) * 60;

    String dia = args[0];
    
    switch (dia){
      case "lunes":
      break;
      
      case "martes":
        minutosHastaFinSemana -= 24 * 60;

      break;
      
      case "miercoles":
        minutosHastaFinSemana -= 2 * 24 * 60;
      break;
      
      case "jueves":
        minutosHastaFinSemana -= 3 *  24 * 60;
      break;
      
      case "viernes":
        minutosHastaFinSemana -= 4 *  24 * 60;
      break;

      default:
        System.out.println("\033[31m¡ERROR! El atributo <dia> debe estar comprendido en el rango (lunes,viernes).");
        System.exit(-1);
      break;
    }

    int horas = Integer.parseInt(args[1]);
    if (23 < horas || 0 > horas) {
      System.out.println("\033[31m¡ERROR! El atributo horas debe estar comprendido en el rango (0,23).");
      System.exit(-1);
    }

    if(dia.equals("viernes") && 15 <= horas){
      System.out.println("\033[31m¡ERROR! Ya es fin de semana.");
    }
    int minutos = Integer.parseInt(args[2]);  
    if (60 < minutos || 0 > minutos) {
      System.out.println("\033[31m¡ERROR! El minutos horas debe estar comprendido en el rango (0,59).");
      System.exit(-1);
    }
    minutosHastaFinSemana -= (horas * 60 + minutos);

    System.out.println("Faltan " + minutosHastaFinSemana + " minutos hasta el fin de semana.");

  }
}