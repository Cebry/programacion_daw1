/**
* Ejercicio 10
*
* Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio10{
  public static void main(String args[]){
    if (args.length != 2) {
      System.out.println("\033[31m¡ERROR! La invocación al programa es 'java Ejercicio10 <dia> <mes>' siendo dia y mes numeros enteros.");
      System.exit(-1);
    }

    int dia = Integer.parseInt(args[0]);
    int mes = Integer.parseInt(args[1]);

    int ultimoDiaMes = 0;

    switch (mes){
      case 1:
        ultimoDiaMes = 31;
      break;

      case 2:
        ultimoDiaMes = 29;
      break;

      case 3:
        ultimoDiaMes = 31;
      break;

      case 4:
        ultimoDiaMes = 30;
      break;

      case 5:
        ultimoDiaMes = 31;
      break;

      case 6:
        ultimoDiaMes = 30;
      break;

      case 7:
        ultimoDiaMes = 31;
      break;

      case 8:
        ultimoDiaMes = 31;
      break;

      case 9:
        ultimoDiaMes = 30;
      break;

      case 10:
        ultimoDiaMes = 31;
      break;

      case 11:
        ultimoDiaMes = 30;
      break;

      case 12:
        ultimoDiaMes = 31;
      break;

      default:
        System.out.println("\033[31m¡ERROR! El mes debe estar comprendido en el rango (1,12)");
        System.exit(-1);
      break;
    }

    if(1 > dia || dia > ultimoDiaMes){
        System.out.println("\033[31m¡ERROR! El dia debe estar comprendido en el rango (1," + ultimoDiaMes + ")");
        System.exit(-1);  
    }

    String signo = "";

    switch (mes){
      case 1:
        if (21 >= dia) {
          signo = "Capricornio";
        }
        else{
          signo = "Acuario";
        }
      break;
      
      case 2:
        if (19 >= dia) {
          signo = "Acuario";
        }
        else{
          signo = "Piscis";
        }
      break;
      
      case 3:
        if (21 >= dia) {
          signo = "Piscis";
        }
        else{
          signo = "Aries";
        }
      break;
      
      case 4:
        if (21 >= dia) {
          signo = "Aries";
        }
        else{
          signo = "Tauro";
        }
      break;
      
      case 5:
        if (21 >= dia) {
          signo = "Tauro";
        }
        else{
          signo = "Geminis";
        }
      break;
      
      case 6:
        if (22 >= dia) {
          signo = "Geminis";
        }
        else{
          signo = "Cancer";
        }      break;
      
      case 7:
        if (23 >= dia) {
          signo = "Cancer";
        }
        else{
          signo = "Leo";
        }
      break;
      
      case 8:
        if (23 >= dia) {
          signo = "Leo";
        }
        else{
          signo = "Virgo";
        }
      break;
      
      case 9:
        if (23 >= dia) {
          signo = "Virgo";
        }
        else{
          signo = "Libra";
        }
      break;
      
      case 10:
        if (23 >= dia) {
          signo = "Libra";
        }
        else{
          signo = "Escorpio";
        }
      break;
      
      case 11:
        if (23 >= dia) {
          signo = "Escorpio";
        }
        else{
          signo = "Sagitario";
        }
      break;
      
      case 12:
        if (22 >= dia) {
          signo = "Sagitario";
        }
        else{
          signo = "Capricornio";
        }
      break;
    }

    System.out.println("Tu signo es " + signo);
  }
}