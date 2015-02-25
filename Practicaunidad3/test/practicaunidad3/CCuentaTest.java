/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaunidad3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manuel Manzano López
 */
public class CCuentaTest {

    public CCuentaTest() {
    }

    /**
     * Test 1 para ingresar una cantidad positiva de dinero en la cuenta, si el
     * método ingresar es correcto la prueba debe de ser exitosa. Se supone que
     * el saldo de la cuenta es mayor o igual a cero,es decir, positivo, en este
     * caso partiremos de que el saldo de la cuenta es 100, y se va a ingresar
     * 1000 unidades, el resultado final de la prueba debe de ser de 1100 como
     * saldo que se dispone en la cuenta, y la prueba se considera exitosa.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testIngresar1() throws Exception {
        System.out.println("Test 1 para comprobar el método Ingresar de 1000.0,\n"
                + "paritendo de que la cuenta tiene de saldo 100.0\n"
                + "El resultado total 1100.0 \n");
        double cantidad = 1000.0;
        System.out.println("Ingresar: " + cantidad);
        double saldo = 100.0;
        System.out.println("Saldo disponible:" + saldo);
        CCuenta miCuenta = new CCuenta("", "", saldo, 0);
        miCuenta.ingresar(cantidad);
        System.out.println("Saldo disponible despues de Ingresar:"
                + miCuenta.estado() + "\n");
        assertTrue(miCuenta.estado() == 1100.0);
    }

    /**
     * Test 2 para ingresar una cantidad negativa dinero en la cuenta, si el
     * método ingresar es correcto la prueba debe de ser exitosa. Se supone que
     * el saldo de la cuenta es mayor o igual a cero,es decir, positivo, en este
     * caso partiremos de que el saldo de la cuenta es 100, y se va a ingresar
     * -1000 unidades, el resultado final de la prueba debe de ser de 1000 como
     * saldo que se dispone en la cuenta,ya que debe de saltar la excepción de
     * que no se puede ingresar una cantidad negativa "No se puede ingresar una
     * cantidad negativa" y la prueba se considera exitosa.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testIngresar2() throws Exception {
        System.out.println("Test 2 para comprobar el método Ingresar de -1000.0,\n"
                + "paritendo de que la cuenta tiene de saldo 100.0\n"
                + "El resultado total 100.0 \n");
        double cantidad = -1000.0;
        System.out.println("Ingresar: " + cantidad);
        double saldo = 100.0;
        System.out.println("Saldo disponible:" + saldo);
        CCuenta miCuenta = new CCuenta("", "", saldo, 0);
        try {
            miCuenta.ingresar(cantidad);
            fail("Intento de ingresar una cantidad negativa");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Saldo disponible despues de Ingresar:"
                + miCuenta.estado() + "\n");
        assertTrue(miCuenta.estado() == 100.0);
    }

    /**
     * Test 1 para retirar una cantidad positiva de dinero de la cuenta, si el
     * método retirar es correcto la prueba retirar debe de ser exitosa. Se
     * supone que el saldo de la cuenta a retirar, debe de ser una cantidad
     * mayor o igual que cero, es decir, positiva, además la cantidad a retirar
     * no debe de ser mayor a la cantidad que se encuentra en la cuenta,
     * suponemos que en la cuenta dispone de 1000 unidades de saldo, y se va a
     * retirar 100 unidades, el resultado final de esta prueba debe de 900
     * unidades de saldo disponible en la cuenta y la prueba se considera
     * exitosa.
     *
     * @throws Exception
     */
    @Test
    public void testRetirar1() throws Exception {
        System.out.println("Test 1 para comprobar el método Retirar de 100,\n"
                + "paritendo de que la cuenta tiene de saldo 1000.\n"
                + "El resultado total 900.0 \n ");
        double cantidad = 100.0;
        System.out.println("Retirar: " + cantidad);
        double saldo = 1000.0;
        System.out.println("Saldo disponible:" + saldo);
        CCuenta miCuenta = new CCuenta("", "", saldo, 0);
        miCuenta.retirar(cantidad);
        System.out.println("Saldo disponible despues de Retirar:"
                + miCuenta.estado() + "\n");
        assertTrue(miCuenta.estado() == 900.0);
    }

    /**
     * Test 2 para retirar una cantidad negativa de dinero de la cuenta, si el
     * método retirar es correcto la prueba retirar debe de ser exitosa. Se
     * supone que el saldo de la cuenta a retirar, debe de ser una cantidad
     * mayor o igual que cero, es decir, positiva, además la cantidad a retirar
     * no debe de ser mayor a la cantidad que se encuentra en la cuenta,
     * suponemos que en la cuenta dispone de 1000 unidades de saldo, y se va a
     * retirar -100 unidades una cantidad negativa, el resultado final de esta
     * prueba debe de ser 1000 unidades de saldo disponible en la cuenta, ya que
     * debe de saltar la excepción de que no se puede retirar cantidad negativa
     * "No se puede retirar una cantidad negativa" y la prueba se considera
     * exitosa.
     *
     * @throws Exception
     */
    @Test
    public void testRetirar2() throws Exception {
        System.out.println("Test 2 para comprobar el método Retirar de -100,\n"
                + "paritendo de que la cuenta tiene de saldo 1000.\n"
                + "El resultado total 1000.0 \n ");
        double cantidad = -100.0;
        System.out.println("Retirar: " + cantidad);
        double saldo = 1000.0;
        System.out.println("Saldo disponible:" + saldo);
        CCuenta miCuenta = new CCuenta("", "", saldo, 0);
        try {
            miCuenta.retirar(cantidad);
            fail("Intento de retirar una cantidad negativa");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Saldo disponible despues de Retirar:"
                + miCuenta.estado() + "\n");
        assertTrue(miCuenta.estado() == 1000.0);
    }


    /**
     * Test 3 para retirar una cantidad mayor al saldo disponible de dinero de
     * la cuenta, si el método retirar es correcto la prueba retirar debe de ser
     * exitosa. Se supone que el saldo de la cuenta a retirar, debe de ser una
     * cantidad mayor o igual que cero, es decir, positiva, además la cantidad a
     * retirar no debe de ser mayor a la cantidad que se encuentra en la cuenta,
     * suponemos que en la cuenta dispone de 1000 unidades de saldo, y se va a
     * retirar 1100 unidades, es decir, una cantidad superior al saldo
     * disponible el resultado final de esta prueba debe de ser 1000 unidades de
     * saldo disponible en la cuenta, ya que debe de saltar la excepción de que
     * no se puede retirar cantidad superior al saldo disponible "No hay saldo
     * suficiente" y la prueba se exitosa.
     *
     * @throws Exception
     */
    @Test
    public void testRetirar3() throws Exception {
        System.out.println("Test 3 para comprobar el método Retirar de -100,\n"
                + "paritendo de que la cuenta tiene de saldo 1000.\n"
                + "El resultado total 1000.0 \n ");
        double cantidad = 1100.0;
        System.out.println("Retirar: " + cantidad);
        double saldo = 1000.0;
        System.out.println("Saldo disponible:" + saldo);
        CCuenta miCuenta = new CCuenta("", "", saldo, 0);
        try {
            miCuenta.retirar(cantidad);
            fail("Intento de retirar una cantidad mayor al saldo disponible.");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Saldo disponible despues de Retirar:"
                + miCuenta.estado() + "\n");
        assertTrue(miCuenta.estado() == 1000.0);
    }

    /**
     * Test 1 para ingresar y retirar dinero en la cuenta, si el método Ingresar y
     * retirar es correcto,la prueba debe de ser exitosa. Se supone que el saldo
     * de la cuenta es mayor o igual a cero,es decir, positivo, en este caso
     * partiremos de que el saldo de la cuenta es 1000, y se va a ingresar 500
     * unidades, y seguidamente se retira 250 unidades, el resultado final de la
     * prueba debe de ser de 1250 como saldo que se dispone en la cuenta, y la
     * prueba se considera exitosa.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testIngresarRetirar1() throws Exception {
        System.out.println("Test 1 para comprobar el método Ingresar y Retirar\n "
                + "Primero se realiza un ingreso de 500.0,\n"
                + "paritendo de que la cuenta tiene de saldo 1000.0 \n"
                + "Seguidamente se retira 250.0 para comprobar el método retirar "
                + "El resultado total 1250.0 \n");
        double cantidad = 500.0;
        System.out.println("Ingresar: " + cantidad);
        double saldo = 1000.0;
        System.out.println("Saldo disponible:" + saldo);
        CCuenta miCuenta = new CCuenta("", "", saldo, 0);
        miCuenta.ingresar(cantidad);
        System.out.println("Saldo disponible despues de Ingresar:"
                + miCuenta.estado());
        cantidad = 250;
        System.out.println("Retirar: " + cantidad);
        miCuenta.retirar(cantidad);
        System.out.println("Saldo disponible despues de retirar:"
                + miCuenta.estado() + "\n");
        assertTrue(miCuenta.estado() == 1250.0);
    }
        /**
     * Test 2 para ingresar y retirar dinero en la cuenta, si el método Ingresar y
     * retirar es correcto,la prueba debe de ser exitosa. 
     * Se supone que el saldo
     * de la cuenta es mayor o igual a cero,es decir, positivo, en este caso
     * partiremos de que el saldo de la cuenta es 1000, y se va a ingresar -500
     * unidades, y seguidamente se retira -250 unidades, el resultado final de la
     * prueba debe de ser de 1000, puesto que no se puede ingresar una
     * cantidad negativa y saltará la excepción "No se puede ingresar una cantidad
     * negativa" y del mismo modo saltará la excepción "No se puede retirar una
     * cantidad negativa",es decir, 1000 como saldo que se dispone en la cuenta,
     * y la prueba se considera exitosa.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testIngresarRetirar2() throws Exception {
        System.out.println("Test 2 para comprobar el método Ingresar y Retirar\n "
                + "Primero se realiza un ingreso de -500.0,\n"
                + "paritendo de que la cuenta tiene de saldo 1000.0 \n"
                + "Seguidamente se retira -250.0 para comprobar el método retirar "
                + "El resultado total 1000.0 \n");
        double cantidad = -500.0;
        System.out.println("Ingresar: " + cantidad);
        double saldo = 1000.0;
        System.out.println("Saldo disponible:" + saldo);
        CCuenta miCuenta = new CCuenta("", "", saldo, 0);
        try {
            miCuenta.ingresar(cantidad);
            fail("Intento de ingresar una cantidad negativa.");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Saldo disponible despues de Ingresar:"
                + miCuenta.estado());
        cantidad = -250;
        System.out.println("Retirar: " + cantidad);
        try {
            miCuenta.ingresar(cantidad);
            fail("Intento de retirar una cantidad negativa.");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Saldo disponible despues de retirar:"
                + miCuenta.estado() + "\n");
        assertTrue(miCuenta.estado() == 1000.0);
    }
    /**
     * Test 3 para ingresar y retirar dinero en la cuenta, si el método Ingresar y
     * retirar es correcto,la prueba debe de ser exitosa. 
     * Se supone que el saldo
     * de la cuenta es mayor o igual a cero,es decir, positivo, en este caso
     * partiremos de que el saldo de la cuenta es 1000, y se va a ingresar 500
     * unidades, y seguidamente se retira -250 unidades, el resultado final de la
     * prueba debe de ser de 1500,  en el método retirar saltará la excepción 
     * "No se puede retirar una cantidad negativa",es decir, 1500 como saldo que 
     * se dispone en la cuenta, y la prueba se considera exitosa.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testIngresarRetirar3() throws Exception {
        System.out.println("Test 3 para comprobar el método Ingresar y Retirar\n "
                + "Primero se realiza un ingreso de 500.0,\n"
                + "paritendo de que la cuenta tiene de saldo 1000.0 \n"
                + "Seguidamente se retira -250.0 para comprobar el método retirar "
                + "El resultado total 1000.0 \n");
        double cantidad = 500.0;
        System.out.println("Ingresar: " + cantidad);
        double saldo = 1000.0;
        System.out.println("Saldo disponible:" + saldo);
        CCuenta miCuenta = new CCuenta("", "", saldo, 0);
        System.out.println("Saldo disponible despues de Ingresar:"
                + miCuenta.estado());
        miCuenta.ingresar(cantidad);
        cantidad = -250;
        System.out.println("Retirar: " + cantidad);
        try {
            miCuenta.ingresar(cantidad);
            fail("Intento de retirar una cantidad negativa.");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Saldo disponible despues de retirar:"
                + miCuenta.estado() + "\n");
        assertTrue(miCuenta.estado() == 1500.0);
    }
    
    /**
     * Test 4 para ingresar y retirar dinero en la cuenta, si el método Ingresar y
     * retirar es correcto,la prueba debe de ser exitosa. 
     * Se supone que el saldo
     * de la cuenta es mayor o igual a cero,es decir, positivo, en este caso
     * partiremos de que el saldo de la cuenta es 1000, y se va a ingresar 500
     * unidades, y seguidamente se retira 1510 unidades, el resultado final de la
     * prueba debe de ser de 1500,  en el método retirar saltará la excepción 
     * "No hay suficiente saldo",es decir, 1500 como saldo que 
     * se dispone en la cuenta, y la prueba se considera exitosa.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testIngresarRetirar4() throws Exception {
        System.out.println("Test 4 para comprobar el método Ingresar y Retirar\n "
                + "Primero se realiza un ingreso de -500.0,\n"
                + "paritendo de que la cuenta tiene de saldo 1000.0 \n"
                + "Seguidamente se retira 1501.0 para comprobar el método retirar "
                + "El resultado total 1500.0 \n");
        double cantidad = 500.0;
        System.out.println("Ingresar: " + cantidad);
        double saldo = 1000.0;
        System.out.println("Saldo disponible:" + saldo);
        CCuenta miCuenta = new CCuenta("", "", saldo, 0);
        miCuenta.ingresar(cantidad);
        System.out.println("Saldo disponible despues de Ingresar:"
                + miCuenta.estado());
        cantidad = 1501;
        System.out.println("Retirar: " + cantidad);
        try {
            miCuenta.retirar(cantidad);
            fail("Intento de retirar una cantidad negativa.");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Saldo disponible despues de retirar:"
                + miCuenta.estado() + "\n");
        assertTrue(miCuenta.estado() == 1500.0);
    }
}
