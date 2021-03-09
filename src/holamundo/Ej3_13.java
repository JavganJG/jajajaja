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
public class Ej3_13 {
    public static void main(String[] args){    
        Scanner teclado = new Scanner(System.in);
         boolean lloviendo = true;
         boolean granizando = true;
         
        System.out.println("¿Esta lloviendo?");
        lloviendo = teclado.nextBoolean();
        
   if(lloviendo == true){
        System.out.println("¿Esta granizando?");
        granizando = teclado.nextBoolean();
        if(granizando == true){
            System.out.println("No salgas a la calle");
        }else{
            System.out.println("Coge el paraguas");
        }
   }else{
       System.out.println("Puedes pasear tranquilamente");
   }
        
    }
}
