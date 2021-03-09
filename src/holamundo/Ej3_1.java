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
public class Ej3_1 {
    public static void main(String[] args){
       Scanner teclado = new Scanner(System.in);
       String borracho = "";
                borracho = teclado.nextLine();
       if("s".equals(borracho)){
           System.out.println("No conduzcas");
           System.out.println("Estas borracho");
       }
              
       
    }
}
