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
public class Ej3_11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduzca dos números.");
        System.out.println("Número 1:");
        num1 = teclado.nextInt();
        System.out.println("Número 2:");
        num2 = teclado.nextInt();
        
        if (num1 < num2){
            System.out.println("Números ordenados: " + num1+", "+num2+".");
        }else{
            if (num2 < num1){
                System.out.println("Números ordenados: " + num2+", "+num1+".");
            }else{
                System.out.println("Números iguales");
            }
        }
    }
}
