/**
* Ejercicio 6
*
* Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h
* Aplica la fórmula t = √(2h/g) siendo g = 9.81 m/s
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio06{
  public static void main(String args[]){
    if (args.length != 1) {
      System.out.println("\033[31m¡ERROR! La invocación al programa es 'java Ejercicio06 <distancia>'.");
      System.exit(-1);
    }

    double tiempo = 0.0;
    double g = 9.8;
    double altura = Double.parseDouble(args[0]);
    if (0 > altura){
      System.out.println("\033[31m¡ERROR! El parámetro altura debe ser mayor que 0.");
      System.exit(-1);
    }

    tiempo = Math.sqrt(2 * altura / g);

    System.out.println("Desde una altura de " + altura + " metros, un objeto tarda en caer:");
    System.out.println(tiempo + " segundos");
  }
}