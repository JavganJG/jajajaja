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
public class Ej3_16 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int dia, mes, anyo;
        String error;
        System.out.println("¿Que dia?");
        dia = teclado.nextInt();
        System.out.println("¿Que mes?");
        mes = teclado.nextInt();
        System.out.println("¿Que año?");
        anyo = teclado.nextInt();
        error = "";
        
        if((dia >= 1) && (dia < 31)){
            if((mes >= 1) && (mes < 13)){
                if((anyo >= 1990) && (anyo <2100)){
                    System.out.println(dia+"/"+mes+"/"+anyo);
                }else{
                   error = error+" Año no válido."; 
                }

            }else{
                error = error+" Mes no válido.";
                if((anyo >= 1990) && (anyo <2100)){  
                }
                else{
                    error = error+" Año no válido.";  
                }
            }

        }
        else{
            error = error+"Dia no válido.";
            if((mes >= 1) && (mes < 13)){
                if((anyo >= 1990) && (anyo <2100)){
                }else{
                    error = error+" Año no válido.";
                }
            }else{
                error = error+" Mes no válido.";
                if((anyo >= 1990) && (anyo <2100)){  
                }
                else{
                    error = error+" Año no válido.";  
                }
            }

        }
        System.out.println(error);
    }
}
