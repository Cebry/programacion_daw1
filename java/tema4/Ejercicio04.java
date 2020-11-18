/**
* Ejercicio 4
*
* Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
* las horas extras. Escribe un programa que calcule el salario semanal de un
* trabajador teniendo en cuenta que las 
* horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. 
* A partir de la hora 41, se pagan a 16 euros la hora.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio04{
    public static void main(String args[]){

    if (args.length != 0) {
      System.out.println("\033[31m¡ERROR! No necesitas argumentos.");
      System.exit(-1);
    }

    double eurosHora = 12.0;
    double eurosHoraExtra = 16.0;

    double salario = 0.0;

    System.out.printf("horas trabajadas:\t");
    
    double horasTrabajadas = Double.parseDouble( System.console().readLine() );
    
    if (0 > horasTrabajadas) {
      System.out.println("\033[31m¡ERROR! Las horas trabajadas deben estar comprendidas en el rango (0-168).");
      System.exit(-1);
    }

    if (40 < horasTrabajadas) {
      salario += (horasTrabajadas - 40) * eurosHoraExtra;
      horasTrabajadas = horasTrabajadas - (horasTrabajadas - 40);
    }

    salario += horasTrabajadas * eurosHora;

    System.out.printf("salario de esta semana:\t\t%.2f\teuros\n", salario);
  }
}