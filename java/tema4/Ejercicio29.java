/**
* Ejercicio 29
*
* Realiza un programa que calcule el precio de un desayuno.
* El programa preguntará primero qué ha tomado el usuario de comer: 
* palmera, donut o pitufo.
* La palmera vale 1.40 € y el donut 1 €.
* En caso de tomar pitufo, el programa debe preguntar además si era con aceite o con tortilla;
* el primero vale 1’20 € y el segundo 1’60 €.
* Por último se pregunta por la bebida:
* zumo o café a
* 1’50 y 1’20 respectivamente.
*
* @author Javier Cebrián Muñoz
*/
import java.util.Scanner;

public class Ejercicio29{
  public static void main(String args[]){

    if (args.length != 0) {
      System.out.println("\033[31m¡ERROR! No necesitas argumentos.");
      System.exit(-1);
    }
    
    Scanner s = new Scanner(System.in);

    System.out.printf("Para comer:(palmera/donut/pitufo)\t");
    String comida = s.nextLine();
    String bebida = "";
    String complemento = "";
    int precioComida = 0;
    
    switch(comida){
      case "palmera":
        precioComida = 140;
      break;

      case "donut":
        precioComida = 100;
      break;

      case "pitufo":

        System.out.printf("Complemento:(aceite/tortilla)\t\t");
        complemento = s.nextLine();
        
        switch(complemento){
          case "aceite":
            precioComida = 120;
          break;

          case "tortilla":
            precioComida = 160;
          break;

          default:
            System.out.println("\033[31m¡ERROR! El complemento debe ser 'aceite' o 'tortilla'.");
            System.exit(-1);
          break;
        }

      break;
      default:
        System.out.println("\033[31m¡ERROR! La comida debe ser 'palmera', 'donut' o 'pitufo'.");
        System.exit(-1);
      break;
    }

    System.out.printf("Bebida:(zumo/cafe)\t\t\t");
        bebida = s.nextLine();
        int precioBebida = 0;
        
        switch(bebida){
          case "zumo":
            precioBebida = 150;
          break;

          case "cafe":
            precioBebida = 120;
          break;

          default:
            System.out.println("\033[31m¡ERROR! La bebida debe ser 'zumo' o 'cafe'.");
            System.exit(-1);
          break;
        }
        double precioTotal = (precioComida + precioBebida);
        if(comida.equals("pitufo")){
          System.out.printf(comida + " con " + complemento + ":\t");   
        }
        else{
          System.out.printf(comida + ":\t");
        }
        System.out.println(precioComida / 100.0 + " euros");
        System.out.printf(bebida + ":\t");
        System.out.println(precioBebida / 100.0 + " euros");
        System.out.printf("total:\t");
        System.out.println((precioTotal / 100.0 ) + " euros");

  }
}