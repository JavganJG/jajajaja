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
public class Ej3_P2 {
     public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        int inverso = 0;
        String piramide_cubierta = "*";
        String piramide_no_cubierta = "";
        String piramide_total = "";
         System.out.println("Dime un número para realizar su pirámide:");
         numero = teclado.nextInt();
         inverso = numero;
         do{
             piramide_no_cubierta = "";
              for(int i= inverso;i > 0;i--){
                piramide_no_cubierta = piramide_no_cubierta+" ";
            }
            piramide_total = piramide_no_cubierta+piramide_cubierta+piramide_no_cubierta;
            System.out.println(piramide_total);

            piramide_cubierta = "*"+piramide_cubierta + "*";
             contador++;
             inverso--;
             
         }while(contador<numero);
        
        
     }
}
