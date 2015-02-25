/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasereloj;

import java.util.Calendar;

/**
 *
 * @author Manuel Manzano López
 */
public class Reloj {

    byte horas, minutos, segundos;
    String ampm;

    Reloj(byte horas, byte minutos, byte segundos) {
        if (horas <= 23 && horas >= 0) {
            this.horas = horas;
        } else {
            this.horas = 0;
        }
        if (minutos <= 59 && minutos >= 0) {
            this.minutos = minutos;
        } else {
            this.minutos = 0;
        }
        if (segundos <= 59 && segundos >= 0) {
            this.segundos = segundos;

        } else {
            this.segundos = 0;
        }
    }

    Reloj() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    String getHoraformato24() {
        
        return String.valueOf(getHoras() + ":" + getMinutos() + ":" + getSegundos());
    }

    String getHoraformatoreloj() {
        byte horasaux;
        if (horas <= 12 ) {
            ampm = "AM";
            horasaux = horas;
        } else {
            horasaux = (byte) (horas - 12);
            ampm = "PM";
            horas = (byte) (horas + 12);
        }

        return String.valueOf(horasaux + ":" + getMinutos() + ":" + getSegundos() + " "
                + ampm);

    }

    void ponerHora(byte horas, byte minutos) {
        if (horas >= 23 && horas >= 0) {
            this.horas = horas;
        } else {
            this.horas = 0;
        }
        if (minutos >= 59 && minutos >= 0) {
            this.minutos = minutos;
        } else {
            this.minutos = 0;
        }
        this.segundos = 0;
    }

    void ponerHora(byte horas, byte minutos, byte segundos) {
        this.ponerHora(horas, minutos);
        if (segundos >= 59 && segundos >= 0) {
            this.segundos = segundos;

        } else {
            this.segundos = 0;
        }
    }

    void ponerHoras(byte horas, byte minutos, byte segundos, String formato) {
        this.ponerHora(horas, minutos, segundos);
        if (formato.equalsIgnoreCase("AM") && horas <= 12) {
            ampm = "AM";
        }
        if (formato.equalsIgnoreCase("PM") && horas <= 24) {
            ampm = "PM";
        }
    }
    void ponerEnHoras(){
        Calendar tiempo = Calendar.getInstance();
        segundos=(byte)tiempo.get(Calendar.SECOND);
        minutos=(byte)tiempo.get(Calendar.MINUTE);
        horas=(byte)tiempo.get(Calendar.HOUR_OF_DAY);
    }

    String getFormato() {
        return ampm;
    }

    byte getHoras() {
        return horas;
    }

    byte getMinutos() {
        return minutos;
    }

    byte getSegundos() {
        return segundos;
    }
    String getFormatohora(boolean veinticuatrohampm){
        if (veinticuatrohampm){
            return this.getHoraformato24();
        }else{
            if(horas>=12 && minutos>=30  ){
                if(horas>12){
                    
                  return String.valueOf((horas-12)+":"+ minutos+":"+segundos);
                }else{
                    return String.valueOf(horas+":"+minutos+":"+segundos);
                }
            }else{
                return String.valueOf(horas+":"+minutos+":"+segundos);
            }
        }
    }
    boolean getFormatohora(){
        return !(horas<12 && minutos <30);
    }
}

 