/**
* Ejercicio 12
*
* Realiza un minicuestionario con 10 preguntas tipo test
* sobre las asignaturas que se imparten en el curso.
* Cada pregunta acertada sumará un punto.
* El programa mostrará al final la calificación obtenida.
* Pásale el minicuestionario a tus compañeros y pídeles que
* lo hagan para ver qué tal andan de conocimientos
* en las diferentes asignaturas del curso.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio12{
  public static void main(String args[]){

    if (args.length != 0) {
      System.out.println("\033[31m¡ERROR! No necesitas argumentos.");
      System.exit(-1);
    }

    char entrada = 'x';
    char respuesta = 'x';
    int aciertos = 0;

    System.out.println("1)¿?");
    System.out.println("a.");
    System.out.println("b.");
    System.out.println("c.");
    System.out.println("d.");
    System.out.println();

    respuesta = 'a';
    entrada = System.console().readLine().charAt(0);
    if (entrada == respuesta) {
    	aciertos ++;	
    }
    
    System.out.println();
    System.out.println("2)¿?");
    System.out.println("a.");
    System.out.println("b.");
    System.out.println("c.");
    System.out.println("d.");
    System.out.println();

    respuesta = 'a';
    entrada = System.console().readLine().charAt(0);
    if (entrada == respuesta) {
    	aciertos ++;	
    }
    
    System.out.println();
    System.out.println("2)¿?");
    System.out.println("a.");
    System.out.println("b.");
    System.out.println("c.");
    System.out.println("d.");
    System.out.println();

    respuesta = 'a';
    entrada = System.console().readLine().charAt(0);
    if (entrada == respuesta) {
    	aciertos ++;	
    }
    
    System.out.println();
    System.out.println("2)¿?");
    System.out.println("a.");
    System.out.println("b.");
    System.out.println("c.");
    System.out.println("d.");
    System.out.println();

    respuesta = 'a';
    entrada = System.console().readLine().charAt(0);
    if (entrada == respuesta) {
    	aciertos ++;	
    }
    
    System.out.println();
    System.out.println("2)¿?");
    System.out.println("a.");
    System.out.println("b.");
    System.out.println("c.");
    System.out.println("d.");
    System.out.println();

    respuesta = 'a';
    entrada = System.console().readLine().charAt(0);
    if (entrada == respuesta) {
    	aciertos ++;	
    }
    
    System.out.println();
    System.out.println("2)¿?");
    System.out.println("a.");
    System.out.println("b.");
    System.out.println("c.");
    System.out.println("d.");
    System.out.println();

    respuesta = 'a';
    entrada = System.console().readLine().charAt(0);
    if (entrada == respuesta) {
    	aciertos ++;	
    }
    
    System.out.println();
    System.out.println("2)¿?");
    System.out.println("a.");
    System.out.println("b.");
    System.out.println("c.");
    System.out.println("d.");
    System.out.println();

    respuesta = 'a';
    entrada = System.console().readLine().charAt(0);
    if (entrada == respuesta) {
    	aciertos ++;	
    }
    
    System.out.println();
    System.out.println("2)¿?");
    System.out.println("a.");
    System.out.println("b.");
    System.out.println("c.");
    System.out.println("d.");
    System.out.println();

    respuesta = 'a';
    entrada = System.console().readLine().charAt(0);
    if (entrada == respuesta) {
    	aciertos ++;	
    }
    
    System.out.println();
    System.out.println("2)¿?");
    System.out.println("a.");
    System.out.println("b.");
    System.out.println("c.");
    System.out.println("d.");
    System.out.println();

    respuesta = 'a';
    entrada = System.console().readLine().charAt(0);
    if (entrada == respuesta) {
    	aciertos ++;	
    }
    
    System.out.println();
    System.out.println("2)¿?");
    System.out.println("a.");
    System.out.println("b.");
    System.out.println("c.");
    System.out.println("d.");
    System.out.println();

    respuesta = 'a';
    entrada = System.console().readLine().charAt(0);
    if (entrada == respuesta) {
    	aciertos ++;	
    }


    String apunte = "";
    if (5.0 > aciertos){
      System.out.printf("\033[31m");
      apunte = "Suspenso";
    }
    else{
      if (6.0 > aciertos){
        System.out.printf("\033[36m");
        apunte = "Suficiente";
      }
      else{
        if ( 7.0 > aciertos){
          System.out.printf("\033[33m");
          apunte = "Bien";
        }
        else{
            if (9.0 > aciertos){
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
    System.out.println(aciertos + " - " + apunte);

  }
}