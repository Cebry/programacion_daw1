/**
* Ejercicio 8
*
* Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas,
* a razón de 12 euros la hora.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio08{
  public static void main(String args[]){

    System.out.printf("horas trabajadas:\t");
    double horasTrabajadas = Double.parseDouble( System.console().readLine() );
    double eurosHora = 12;
    double salario = horasTrabajadas * eurosHora;
    System.out.printf("euros/hora:\t\t%.2f\teuros\n", eurosHora);
    System.out.printf("salario:\t\t%.2f\teuros\n", salario);
  }
}