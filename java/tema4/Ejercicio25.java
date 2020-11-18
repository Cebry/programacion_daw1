/**
* Ejercicio 25
*
* La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y 
* nos ha pedido hacer un configurador que calcule el precio según el alto y el ancho. 
* El precio base de una bandera es de un céntimo de euro el centímetro cuadrado.
* Si la queremos con un escudo bordado, el precio se incrementa en 2.50 € independientemente del tamaño.
* Los gastos de envío son 3.25 €. El IVA ya está incluido en todas las tarifas.
*
* @author Javier Cebrián Muñoz
*/

public class Ejercicio25{
  public static void main(String args[]){
   if (args.length != 3) {
      System.out.println("\033[31m¡ERROR! La invocación al programa es 'java Ejercicio25 <ancho> <alto> <escudo>'.");
      System.exit(-1);
    }
    
    int ancho = Integer.parseInt(args[0]);
    if(0 >= ancho){
      System.out.println("\033[31m¡ERROR! el ancho debe ser mayor de 0");
    }
    int largo = Integer.parseInt(args[1]);
    if(0 >= largo){
      System.out.println("\033[31m¡ERROR! el largo debe ser mayor de 0");
    }
    boolean escudo = Boolean.parseBoolean(args[2]);

    double precioBandera = largo * ancho / 100.0;
    double precioEscudo = 0.00;
    double precioEnvio = 3.25;


    if (escudo){
      precioEscudo = 2.50;
    }

    double precioTotal = precioBandera + precioEscudo + precioEnvio;
    System.out.println("Precio Bandera:\t" + precioBandera);
    System.out.println("Precio Escudo:\t" + precioEscudo);
    System.out.println("Precio Envio:\t" + precioEnvio);
    System.out.println("Precio Total:\t" + precioTotal);
    System.out.println("(IVA incluido)");
  }
}