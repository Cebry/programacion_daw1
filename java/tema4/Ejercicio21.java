/**
* Ejercicio 21
*
* Calcula la nota de un trimestre de la asignatura Programación.
* El programa pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
* Si la media de los dos controles da un número
* mayor o igual a 5, el alumno está aprobado y se mostrará la media.
* En caso de que la media sea un número menor que 5,
* el alumno habrá tenido que hacer el examen de recuperación que se califica como apto o no apto,
* por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto).
* Si el resultado de la recuperación es apto, la nota será un 5;
* en caso contrario, se mantiene la nota media anterior.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio21{
  public static void main(String args[]){

    if (args.length != 0) {
      System.out.println("\033[31m¡ERROR! No necesitas argumentos.");
      System.exit(-1);
    }

    System.out.printf("Nota 1:\t");
    double nota1 = Double.parseDouble(System.console().readLine());

    if(0 > nota1 || 10 < nota1){
      System.out.println("\033[31m¡ERROR! La nota debe estar comprendido en el rango (0, 10).");
      System.exit(-1);
    }

    System.out.printf("Nota 2:\t");
    double nota2 = Double.parseDouble(System.console().readLine());

    if(0 > nota2 || 10 < nota2){
      System.out.println("\033[31m¡ERROR! La nota debe estar comprendido en el rango (0, 10).");
      System.exit(-1);
    }
    
    double media = (nota1 + nota2) / 2;
    String apunte = "aprobado";

    if (media < 5) {

      System.out.printf("Resultado de la recuperación (apto/no apto):\t");
      String recuperacion = System.console().readLine();

      switch (recuperacion){
        case "apto":
          media = 5;
        break;

        case "no apto":
          apunte = "suspenso";
        break;

        default:
        System.out.println("\033[31m¡ERROR! El número debe ser \"apto\" o \"no apto\".");
        System.exit(-1);
        break;
      }
    }

      System.out.println("El alumno está " + apunte + " y tiene de media:\t" + media);
    
  }
}