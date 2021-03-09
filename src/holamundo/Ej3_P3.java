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
public class Ej3_P3 {
        public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int cantidad = 0;
        int Billetes500 = 0;
        int Billetes200 = 0;
        int Billetes100 = 0;
        int Billetes50 = 0;
        int Billetes20 = 0;
        int Billetes10 = 0;
        int Billetes5 = 0;
            System.out.println("Dame una cantidad");
            cantidad = teclado.nextInt();
            if(cantidad%5==0){
                while((cantidad>=500)&&(cantidad!=0)){
                    cantidad=cantidad-500;
                    Billetes500++;                    
                }
                while((cantidad>=200)&&(cantidad!=0)){
                    cantidad=cantidad-200;
                    Billetes200++;
                } 
                while((cantidad>=100)&&(cantidad!=0)){
                    cantidad=cantidad-100;
                    Billetes100++;                    
                }
                while((cantidad>=50)&&(cantidad!=0)){
                    cantidad=cantidad-50;
                    Billetes50++;                    
                }
                while((cantidad>=20)&&(cantidad!=0)){
                    cantidad=cantidad-20;
                    Billetes20++;                    
                }
                while((cantidad>=10)&&(cantidad!=0)){
                     cantidad=cantidad-10;
                    Billetes10++;                   
                }
                while((cantidad>=5)&&(cantidad!=0)){
                    cantidad=cantidad-5;
                    Billetes5++;                    
                }
            System.out.println(Billetes500+" billetes de 500");
            System.out.println(Billetes200+" billetes de 200");
            System.out.println(Billetes100+" billetes de 100");
            System.out.println(Billetes50+" billetes de 50");
            System.out.println(Billetes20+" billetes de 20");
            System.out.println(Billetes10+" billetes de 10");
            System.out.println(Billetes5+" billetes de 5"); 
            }else{
                System.out.println("La cantidad debe solo calcularse en billetes");
            }
           
        }
}
