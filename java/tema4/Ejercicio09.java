/**
* Ejercicio 9
*
* Realiza un programa que resuelva una ecuación de segundo grado
* (del tipo ax2 + bx + c = 0 ).
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio09{
  public static void main(String args[]){
    if (args.length != 3) {
      System.out.println("\033[31m¡ERROR! La invocación al programa es 'java Ejercicio09 <a> <b> <c>' siendo a, b y c los coeficientes de la ecuación de segundo grado.");
      System.exit(-1);
    }

    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);

    System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");

    if(0 == a){
      double x = b / a;
      System.out.println("Es una ecuación de primer grado");
      System.out.println("Tiene por solución:");
      System.out.println("x = " + x);
      System.exit(-1);      
    }

    double discriminante = b * b - (4 * a * c);
    if (0 == discriminante){
      double x = -b/(2*a);
      System.out.println("Tiene por solución:");
      System.out.println("x1 = " + x);
    }

    else{
      if (0 < discriminante){
        double x1 = (-b + Math.sqrt(discriminante))/(2 * a);
        double x2 = (-b - Math.sqrt(discriminante))/(2 * a);

        System.out.println("Tiene por soluciones:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
      }
      else{
        System.out.println("No tiene solución real.");
      }
    }
  }
}