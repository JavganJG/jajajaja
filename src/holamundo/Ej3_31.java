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
public class Ej3_31 {
    public static void  main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        String binario = "";
        boolean cierto = true;
        System.out.println("Escribe el número positivo que quieres pasar a binario:");
        if(teclado.hasNextInt()){
            numero = teclado.nextInt();
            if(cierto){
                while(numero>0){
                    if(numero%2==0){
                        numero = numero/2;
                        binario = "0"+ binario;
                    }else{
                        numero = (numero-1)/2;
                        binario = "1"+ binario;
                    }
                }
                System.out.println("El número binario es:"+binario);
            }
        }
    }
}
