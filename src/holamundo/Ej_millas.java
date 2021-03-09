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
public class Ej_millas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double millas = 0;
        double metros = 0;
        System.out.println("Escribe una distancia en millas");
        millas = teclado.nextDouble();
        metros = millas*1852;
        System.out.println("Esto son " + metros + " metros");
    }
}
