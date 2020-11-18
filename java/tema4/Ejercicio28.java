/**
* Ejercicio 28
*
* Implementa el juego piedra, papel y tijera.
* Primero, el usuario 1 introduce su jugada y
* luego el usuario 2.
* Si alguno de los usuarios introduce una opciónin correcta,
* el programa deberá mostrar un mensaje de error.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio28{
  public static void main(String args[]){

  	if (args.length != 0) {
      System.out.println("\033[31m¡ERROR! No necesitas argumentos.");
      System.exit(-1);
    }
    
    System.out.println("piedra, papel o tijera");
    String jugador1 = System.console().readLine();

    switch(jugador1){
      case "piedra":
      break;
      case "papel":
      break;
      case "tijera":
      break;
      default:
        System.out.println("\033[31m¡ERROR! Debes seleccionar piedra, papel o tijera");
        System.exit(-1);
      break;
    }
    System.out.print("\033[1A");
	System.out.print("\033[2K");

    String jugador2 = System.console().readLine();

    switch(jugador2){
      case "piedra":
      	System.out.println("\b\b\b\b\b");
      break;
      case "papel":
      	System.out.println("\b\b\b\b");
      break;
      case "tijera":
      	System.out.println("\b\b\b\b\b");
      break;
      default:
        System.out.println("\033[31m¡ERROR! Debes seleccionar piedra, papel o tijera");
        System.exit(-1);
      break;
    }
    System.out.print("\033[1A");
	System.out.print("\033[2K");

    System.out.println(jugador1 + " " + jugador2);

    if (jugador1.equals(jugador2)){
    	System.out.println("empate");
    }
    else{
    	if((jugador1.equals("piedra") && jugador2.equals("tijera")) || (jugador1.equals("tijera") && jugador2.equals("papel")) || (jugador1.equals("papel") && jugador2.equals("piedra"))){
    		System.out.println("Gana el jugador 1.");	
    	}
    	else{
    		System.out.println("Gana el jugador 2.");
    	}
    }
  }
}