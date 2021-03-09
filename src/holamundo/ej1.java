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
public class ej1 {
    public static void main(String[] args) {
        double pvp = 85.00;
        final double descuento = 0.15;
        final double rebaja = (pvp - (descuento*pvp));
        System.out.println("El descuento esta en " + pvp);

    }
}
