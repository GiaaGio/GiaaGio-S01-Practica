package Aplicaciones;
import java.util.Scanner;
public class Ejercicio02 {
public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       float ancho, altura, AreaT, PrecioT;
       System.out.print("Ingrese el valor del ancho: ");
       ancho = Float.parseFloat (teclado.nextLine());
       
       System.out.print("Ingrese el valor de la altura: ");
       altura = Float.parseFloat (teclado.nextLine()); 
       
       AreaT = ancho * altura;
       PrecioT = AreaT * 750;
       
       System.out.println("-------------");
       System.out.println("----Report---");
       System.out.println("-------------");
       System.out.println("El ancho es: "+ ancho);
       System.out.println("La altura es: " + altura);
       System.out.println("El Área del terreno es: "+ AreaT);
       System.out.println("El Precio del terreno es: "+ PrecioT);
       System.out.println("-------------");
       }
}
