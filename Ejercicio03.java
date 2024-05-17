package Aplicaciones;
import java.util.Scanner;
public class Ejercicio03 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       float base, altura, AreaR, PerimetroR;
       System.out.print("Ingrese el valor de la base: ");
       base = Float.parseFloat (teclado.nextLine());
       
       System.out.print("Ingrese el valor de la altura: ");
       altura = Float.parseFloat (teclado.nextLine()); 
       
       AreaR = base * altura;
       PerimetroR = 2 * (base + altura);
       
       System.out.println("-------------");
       System.out.println("----Report---");
       System.out.println("-------------");
       System.out.println("La base es: "+ base);
       System.out.println("La altura es: " + altura);
       System.out.println("El Área del rectangulo es: "+ AreaR);
       System.out.println("El Perímetro del rectángulo es: "+ PerimetroR);
       System.out.println("-------------");
       }
}
