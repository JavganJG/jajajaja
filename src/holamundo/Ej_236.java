/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;
import java.util.Scanner;
/**
 *
 * @author JavganJG
 */
public class Ej_236 {
    public static void main(String[] args){
         Scanner teclado = new Scanner(System.in);
         double num = 0.0, suma = 0.0;
         boolean rdo = false;
         System.out.println("Introduzca el primer número");
         num = teclado.nextDouble();
         suma = suma + num;
         System.out.println("Introduzca el segundo número");
         num = teclado.nextDouble();
         suma = suma + num; 
         System.out.println("Introduzca el tercer número");
         num = teclado.nextDouble();
         suma = suma + num;
         System.out.println("Introduzca el cuarto número");
         num = teclado.nextDouble();
         suma = suma + num;
         System.out.println("Introduzca el quinto número");
         num = teclado.nextDouble();
         suma = suma + num;

         rdo = (suma <= 100);

         System.out.println("Is your money account okay? " + rdo);
    }
}
