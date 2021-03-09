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
public class Ej_ecuacion {
    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
        
        double Xpos = 0.0, Xneg =0.0, n1 = 0.0, n2 = 0.0, n3 = 0.0;
        double XposCalculo = 0.0;
        double XnegCalculo = 0.0;
        System.out.println("Dime el primer factor");
        n1 = teclado.nextDouble();
        System.out.println("Dime el segundo factor");
        n2 = teclado.nextDouble();
        System.out.println("Dime el tercer factor");
        n3 = teclado.nextDouble();
        
        Xpos = (-n2 + Math.sqrt(Math.pow(n2, 2 ) - 4*n1*n3)) / (2*n1);
        Xneg = (-n2 - Math.sqrt(Math.pow(n2, 2 ) - 2*n1*n3)) / (2*n1);
        
        
        
        
        
        XposCalculo = (n1*Math.pow(Xpos,2) + (n2*Xpos)+ n3);
        XnegCalculo = (n1*Math.pow(Xneg,2) + (n2*Xneg)+ n3);
        System.out.printf("El resultado de X = %.3f es: %.3f %n",Xpos,XposCalculo);
        System.out.printf("El resultado de X = %.3f es: %.3f %n",Xneg,XnegCalculo);
        System.out.println("JAJAJAJAJAJA IBAI");
    }
}
