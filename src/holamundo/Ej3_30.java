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
public class Ej3_30 {
    public static void main(String[] args){
     Scanner teclado = new Scanner(System.in);
     int numero = 1;
     int suma = 0;
     int contador = 0;
     int veces = 0;
     boolean cierto = false;
        System.out.println("Cuantas veces sumo números pares");
     if(teclado.hasNextInt()){ 
     veces = teclado.nextInt();
     if(cierto){
         while((contador!=veces)&&(cierto)){
             numero++;
            if(numero%2==0){
              suma = suma + numero;
              contador++;
            }
        }
     }
     else{
         System.out.println(" No es un numero entero");
     }
         System.out.println(suma);
    }
    }
}
