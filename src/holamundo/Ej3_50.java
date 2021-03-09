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
public class Ej3_50 {
    public static void main (String[] args){
        int num1=0, num2=0,impar=0,contador=0,suma=0;
        double media =0;
        Scanner teclado = new Scanner (System.in);
        System.out.print("Escribe el primer numero de la serie: ");
        num1=teclado.nextInt();
        System.out.print("Escribe el numero final de la serie: ");
        num2=teclado.nextInt();
            if (num1%2==0){
                impar = num1+1;
            }else{
                impar = num1;
            }
            contador = contador + 1;
        do{
            impar= impar+2;
            suma = suma+impar;
            contador = contador + 1;
        }while(impar<num2);
        media = suma/contador;
        System.out.println("La media de la serie de "+num1+" hasta "+num2+" es "+media);
    }
}
