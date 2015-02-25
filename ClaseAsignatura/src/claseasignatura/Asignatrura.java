/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseasignatura;

/**
 *
 * @author Manuel Manzano López
 */
public class Asignatrura {

    String nombreasignatura;
    String cursoimpartida;
    byte codigoasignatura;

    Asignatrura(String nombreasignatura, String cursoimpartida, byte codigoasignatura) {
        this.nombreasignatura = nombreasignatura;
        this.cursoimpartida = cursoimpartida;
        this.codigoasignatura = (byte) codigoasignatura;
    }

    String getNombreasignatura() {
        return nombreasignatura;
    }

    String getCursoimpartida() {
        return cursoimpartida;
    }

    byte getCodigoasignatura() {
        return codigoasignatura;
    }

    @Override
    public String toString() {
        return "Asignatrura{" + "Nombre asignatura=" + nombreasignatura
                + ", Curso=" + cursoimpartida + ", Codigo Asignatura="
                + codigoasignatura + '}';
    }
}
