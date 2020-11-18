/**
* Ejercicio 7
*
* Realiza un programa que calcule la media de tres notas.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio07{
  public static void main(String args[]){
   if (args.length != 3) {
      System.out.println("\033[31m¡ERROR! La invocación al programa es 'java Ejercicio07 <nota1> <nota2> <nota3>'.");
      System.exit(-1);
    }

    double nota1 = Double.parseDouble(args[0]);
    double nota2 = Double.parseDouble(args[1]);
    double nota3 = Double.parseDouble(args[2]);
    if (0 > nota1 || 10 < nota1 || 0 > nota2 || 10 < nota2 || 0 > nota3 || 10 < nota3){
      System.out.println("\033[31m¡ERROR! Las notas deben estar comprendidas en el rango (0,10).");
      System.exit(-1);
    }

    double media = (nota1 + nota2 + nota3) / 3;

    if (5 > media){
      System.out.printf("\033[31m");
    }
    else{
      System.out.printf("\033[32m");
    }
    System.out.println(media+ "\033[00m");
  }
}