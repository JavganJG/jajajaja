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
public class Ej3_P1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero = 1;
        int contador = 1;
        int contador2 = 0;
        String cadena ="";
        System.out.println("Dime un número:");
        numero = teclado.nextInt();
        do{
            cadena = "";
            contador2 =0;
            do{  

                
                cadena = cadena + contador;
                contador2++;
            }while(contador2 < contador);
            System.out.println(cadena);
            contador++;
        }while(contador<=numero);
    }
}
