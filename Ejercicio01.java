package Aplicaciones;
import java.util.Scanner;
public class Ejercicio01 {
  public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       float IMC, peso, altura;
       System.out.print("Ingrese el valor del peso (Kg): ");
       peso = Float.parseFloat (teclado.nextLine());
       
       System.out.print("Ingrese el valor de la altura (m): ");
       altura = Float.parseFloat (teclado.nextLine()); 
       
       IMC = peso/(altura * altura);
       System.out.println("-------------");
       System.out.println("----Report---");
       System.out.println("-------------");
       System.out.println("El peso es: "+ peso);
       System.out.println("La altura es: " + altura);
       System.out.println("El IMC es: "+ IMC);
       System.out.println("-------------");
       
       }
}

