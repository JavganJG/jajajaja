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
public class Ej3_40 {
    public static void main(String[] args){
        int numpr = 0;
        int numfi = 0;
        String numeros = "";
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número (entero positivo) en el que comenzará la serie:");
        numpr = teclado.nextInt();
        System.out.println("Introduce el número (entero positivo) en el que finalizará la serie:");
        numfi = teclado.nextInt();
        
        numeros = ""+numpr;
        if(numpr<numfi){
            do{
                numpr++;
                numeros = numeros +"-"+numpr;
                
            }while(numpr < numfi);    
                System.out.println(numeros);
        }
    }
}
