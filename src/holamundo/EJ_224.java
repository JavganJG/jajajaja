/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author JavganJG
 */
public class EJ_224 {
    public static void main(String[] args){
        final double PI =3.1415;
        double diametro =15.5, altura = 12;
        double area, volumen, radio;
        radio = diametro / 2;
        area = ((2*PI*radio*radio)+(2*PI*radio*altura));
        volumen = (PI*radio*radio*altura);
        System.out.println("Para un cilindro de radio " + radio + " y altura " + altura);
        System.out.printf("El área es: %.4f \n",  area);
        System.out.printf("El volumen es: %.2f %n" , volumen);
    }
}
