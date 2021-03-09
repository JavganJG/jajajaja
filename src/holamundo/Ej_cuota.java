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
public class Ej_cuota {
    public static void main(String[] args){
         Scanner teclado = new Scanner(System.in);
         double Cuota = 0.0;
         double InteresAnual = 0.0;
         double NumeroPagos = 0.0;
         double Prestamo = 0.0;
         System.out.println("¿Cual es el prestamo a pagar?");
         Prestamo = teclado.nextDouble();
         System.out.println("¿Cual es el interés anual?");
         InteresAnual = teclado.nextDouble();
         System.out.println("¿Cual es la duración en años?");
         NumeroPagos = teclado.nextDouble();
         Cuota = (Prestamo*InteresAnual)/1-(1/Math.pow((1+ InteresAnual), NumeroPagos));
         System.out.printf("La cantidad mensual que hay que paga es %,.2f \n ", Cuota);
    }
   
    
}
