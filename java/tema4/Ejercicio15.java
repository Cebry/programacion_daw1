/**
* Ejercicio 15
*
* Escribe un programa que pinte una pirámide rellena
* con un carácter introducido por teclado
* que podrá ser una letra, un número o un símbolo como *, +, -, $, &, etc.
* El programa debe permitir al usuario mediante un menú elegir si el vértice
* de la pirámide está apuntando hacia
* arriba, hacia abajo, hacia la izquierda o hacia la derecha.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio15{
  public static void main(String args[]){

    if (args.length != 0) {
      System.out.println("\033[31m¡ERROR! No necesitas argumentos.");
      System.exit(-1);
    }

    System.out.printf("Escribe un caracter:\t");
    char c = System.console().readLine().charAt(0);
    
    System.out.printf("¿Donde quieres el vertice?:\t");
    char vertice = System.console().readLine().charAt(0);

    switch (vertice){

      case 'r':
        System.out.println(c + "" + ' ' + "" + ' ' + "" + ' ' + "" + ' ');
        System.out.println(c + "" + c + "" + ' ' + "" + ' ' + "" + ' ');
        System.out.println(c + "" + c + "" + c + "" + ' ' + "" + ' ');
        System.out.println(c + "" + c + "" + c + "" + c + "" + ' ');
        System.out.println(c + "" + c + "" + c + "" + c + "" + c);
        System.out.println(c + "" + c + "" + c + "" + c + "" + ' ');
        System.out.println(c + "" + c + "" + c + "" + ' ' + "" + ' ');
        System.out.println(c + "" + c + "" + ' ' + "" + ' ' + "" + ' ');
        System.out.println(c + "" + ' ' + "" + ' ' + "" + ' ' + "" + ' ');
      break;

      case 'l':
        System.out.println(' ' + "" + ' ' + "" + ' ' + "" + ' ' + "" + c);
        System.out.println(' ' + "" + ' ' + "" + ' ' + "" + c + "" + c);
        System.out.println(' ' + "" + ' ' + "" + c + "" + c + "" + c);
        System.out.println(' ' + "" + c + "" + c + "" + c + "" + c);
        System.out.println(c + "" + c + "" + c + "" + c + "" + c);
        System.out.println(' ' + "" + c + "" + c + "" + c + "" + c);
        System.out.println(' ' + "" + ' ' + "" + c + "" + c + "" + c);
        System.out.println(' ' + "" + ' ' + "" + ' ' + "" + c + "" + c);
        System.out.println(' ' + "" + ' ' + "" + ' ' + "" + ' ' + "" + c);
      break;

      case 't':
        System.out.println(' ' + "" + ' ' + "" + ' ' + "" + ' ' + "" + c + "" + ' ' + "" + ' ' + "" + ' ' + "" + ' ');
        System.out.println(' ' + "" + ' ' + "" + ' ' + "" + c + "" + c + "" + c + "" + ' ' + "" + ' ' + "" + ' ');
        System.out.println(' ' + "" + ' ' + "" + c + "" + c + "" + c + "" + c + "" + c + "" + ' ' + "" + ' ');
        System.out.println(' ' + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + ' ');
        System.out.println(c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c);
      break;

      case 'b':
        System.out.println(c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c);
        System.out.println(' ' + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + ' ');
        System.out.println(' ' + "" + ' ' + "" + c + "" + c + "" + c + "" + c + "" + c + "" + ' ' + "" + ' ');
        System.out.println(' ' + "" + ' ' + "" + ' ' + "" + c + "" + c + "" + c + "" + ' ' + "" + ' ' + "" + ' ');
        System.out.println(' ' + "" + ' ' + "" + ' ' + "" + ' ' + "" + c + "" + ' ' + "" + ' ' + "" + ' ' + "" + ' ');
      break;
    }
  }
}