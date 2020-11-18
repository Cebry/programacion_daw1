/**
* Ejercicio 8
*
* Escribe un programa que declare 5 variables de tipo char.
* A continuación, crea otra variable como cadena de caracteres y
* asígnale como valor la concatenación de las anteriores 5 variables.
* Por último, muestra la cadena de caracteres por pantalla
* ¿Qué problemas te encuentras?
* ¿cómo lo has solucionado?
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio08{
  public static void main(String args[]){
    char mander = 'c';
    char meleon = 'h';
    char izard = 'a';
    char izardx = 'r';
    char izardy = 'm';
    String fuego = mander + "" + meleon + "" + izard + "" + izardx + "" + izardy ;

    System.out.println(fuego);
  }
}