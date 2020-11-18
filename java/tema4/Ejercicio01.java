/**
* Ejercicio 1
*
* Escribe un programa que pida por teclado un día de la semana y que diga qué
* asignatura toca a primera hora ese día.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio01{
  public static void main(String args[]){

    if (args.length != 1) {
      System.out.println("\033[31m¡ERROR! Debes escribir el dia de la semana como argumento.");
      System.exit(-1);
    }

    String dia = args[0];
    String asignatura = "";
    switch(dia) {
      case "lunes":
        asignatura = "programación";
      break;
      case "martes":
        asignatura = "programación";
      break;
      case "miercoles":
        asignatura = "programación";
      break;
      case "jueves":
        asignatura = "formacion y orientacion laboral";
      break;
      case "viernes":
        asignatura = "sistemas informaticos";
      break;
      default:
        System.out.println("\033[31m¡ERROR! La entrada es inválida.");

        System.exit(-1);
      break;
    }
    System.out.println("la primera asignatura de hoy es " + asignatura);
  }
}