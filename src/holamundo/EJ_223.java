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
public class EJ_223 {
        public static void main(String[] args) {
        double pvp = 85.00;
        final double descuento = 0.15;
        final double rebaja = (pvp - (descuento*pvp));
        System.out.println("En descuento esta en " + rebaja);

    }
}

