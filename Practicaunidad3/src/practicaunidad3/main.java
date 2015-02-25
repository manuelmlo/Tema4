/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaunidad3;

/**
 *
 * @author Manuel Manzano López
 */
public class main {

    /**
     *
     * @param args the command line arguments
     *
     */

    public static void main(String[] args) {

        CCuenta miCuenta;

        double saldoActual;

        miCuenta = new CCuenta("Juan López", "1000-2365-85-123456789", 2500, 0);

        try {

            miCuenta.retirar(-2300);

        } catch (Exception e) {

            System.err.println(e.getMessage());

            System.out.println("Fallo al retirar");

        }

        try {

            System.out.println("Ingreso en cuenta");

            miCuenta.ingresar(-1695);

        } catch (Exception e) {

            System.err.println(e.getMessage());

            System.out.println("Fallo al ingresar");

        }

        saldoActual = miCuenta.estado();

        System.out.println("El saldo actual es " + saldoActual);

    }

}
