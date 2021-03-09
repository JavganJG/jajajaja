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
public class Ej3_32 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int suma = 0;
        boolean cierto = true;
        System.out.println("Dime numeros enteros");
                
            do{
                numero = teclado.nextInt();
                suma = suma + numero;
            }while(numero !=0);
            System.out.println("El resultado es:"+ suma);
                
            
    }
}
