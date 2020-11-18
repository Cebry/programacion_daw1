/**
* Ejercicio 8
*
* Amplía el programa anterior para que diga la nota del boletín
* (insuficiente, suficiente, bien, notable o sobresaliente).
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio08{
  public static void main(String args[]){
   if (args.length != 3) {
      System.out.println("\033[31m¡ERROR! La invocación al programa es 'java Ejercicio08 <nota1> <nota2> <nota3>'.");
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
    String apunte = "";

    if (5.0 > media){
      System.out.printf("\033[31m");
      apunte = "Suspenso";
    }
    else{
      if (6.0 > media){
        System.out.printf("\033[36m");
        apunte = "Suficiente";
      }
      else{
        if ( 7.0 > media){
          System.out.printf("\033[33m");
          apunte = "Bien";
        }
        else{
            if (9.0 > media){
            System.out.printf("\033[37m");
            apunte = "Notable";
          }
          else{
            System.out.printf("\033[32m");
            apunte = "Sobresaliente";
          }
        }
      }
    }
    System.out.println(media + " - " + apunte);
  }
}