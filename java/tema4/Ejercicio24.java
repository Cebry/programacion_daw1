/**
* Ejercicio 24
*
* Escribe un programa que genere la nómina (bien desglosada)
* de un empleado según las siguientes condiciones:
* 
* Se pregunta el cargo del empleado
* (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto),
* los días que ha estado de viaje visitando clientes durante el mes y
* su estado civil (1 - Soltero, 2 - Casado).
*
* El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se trata de
* un prog. junior, un prog. senior o un jefe de proyecto respectivamente.
*
* Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas.
* Al sueldo neto hay que restarle el IRPF, que será de un
* 25% en caso de estar soltero y un 20% en caso de estar casado.
*
* @author Javier Cebrián Muñoz
*/

import java.util.Scanner;

public class Ejercicio24{
  public static void main(String args[]){

    if (args.length != 0) {
      System.out.println("\033[31m¡ERROR! No necesitas argumentos.");
      System.exit(-1);
    }

    Scanner s = new Scanner(System.in);

    System.out.println("¿Cargo?");
    System.out.println("(1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto)");
    int cargo = s.nextInt();
    double sueldoBase = 0;

    switch(cargo){
      case 1:
        sueldoBase = 950.0;
      break;

      case 2:
        sueldoBase = 1200.0;
      break;

      case 3:
        sueldoBase = 1600.0;
      break;

      default:
        System.out.println("\033[31m¡ERROR! El cargo debe estar en el rango (1, 3).");
        System.exit(-1);
      break;
    }

    System.out.println("¿Días de viaje?");
    int diasDeViaje = s.nextInt();

    if(0 > diasDeViaje){
      System.out.println("\033[31m¡ERROR! los dias de viaje deben ser un numero positivo.");
      System.exit(-1);
    }

    System.out.println("¿Estado civil?");
    System.out.println("(1 - Soltero, 2 - Casado)");
    int estadoCivil = s.nextInt();

    double sueldoNeto = sueldoBase + diasDeViaje * 30;
    double sueldoFinal = 0;

    switch(estadoCivil){
      case 1:
        sueldoFinal = sueldoNeto - sueldoNeto / 100 * 25;
      break;

      case 2:
        sueldoFinal = sueldoNeto - sueldoNeto / 100 * 20;
      break;

      default:
        System.out.println("\033[31m¡ERROR! El estado civil en el rango (1, 2).");
        System.exit(-1);
      break;
    }

    System.out.println("sueldo base:\t" + sueldoBase);
    System.out.println("dietas:\t\t" + (sueldoNeto - sueldoBase));
    System.out.println("sueldo neto:\t" + sueldoNeto);
    System.out.println("IRPF:\t\t" + (sueldoFinal- sueldoNeto));
    System.out.println("sueldo final:\t" + sueldoFinal);
  }
}