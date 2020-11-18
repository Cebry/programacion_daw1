/**
* Ejercicio 5
*
* Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio05{
  public static void main(String args[]){
    if (args.length != 2) {
      System.out.println("\033[31m¡ERROR! La invocación al programa es 'java Ejercicio05 <a> <b>'.");
      System.exit(-1);
    }

    double a = Double.parseDouble(args[0]);
    if(0 == a){
      System.out.println("\033[31m¡ERROR! El argumento a debe ser distinto de 0.");
      System.exit(-1);      
    }

    double b = Double.parseDouble(args[1]);
    double x = 0;

    System.out.println(a + "x + " + b + " = 0");


    x = b / a;

    System.out.println("Tiene por solución");
    System.out.println("x = " + x);

  }
}