package Aplicaciones;
import java.util.Scanner;
public class Ejercicio04 {
public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       float radio, altura, AreaC, VolumenC;
       System.out.print("Ingrese el valor del radio: ");
       radio = Float.parseFloat (teclado.nextLine());
       
       System.out.print("Ingrese el valor de la altura: ");
       altura = Float.parseFloat (teclado.nextLine()); 
       
       AreaC = 2 * (float) Math.PI * radio *(radio + altura);
       VolumenC = (float) Math.PI * (radio * radio) * altura;
       
       System.out.println("-------------");
       System.out.println("----Report---");
       System.out.println("-------------");
       System.out.println("El radio es: "+ radio);
       System.out.println("La altura es: " + altura);
       System.out.println("El Área del cilindro es: "+ AreaC);
       System.out.println("El Volumen del cilindro es: "+ VolumenC);
       System.out.println("-------------");
       }
} 

