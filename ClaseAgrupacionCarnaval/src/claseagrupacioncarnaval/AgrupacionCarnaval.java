/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseagrupacioncarnaval;

/**
 *
 * @author Manuel Manzano López
 */
public class AgrupacionCarnaval {
    final int CHIRIGOTA=1, COMPARSA=2,CORO=3,CUARTETO=4 ;
    String nombre;
    String autorletra;
    String autormusica;
    int categoria;
    int numcomponente;
    int puntuacion;

    public AgrupacionCarnaval(String nombre, String autorletra, 
            String autormusica, int categoria, int numcomponente, 
            int puntuacion) {
        this.nombre = nombre;
        this.autorletra = autorletra;
        this.autormusica = autormusica;
        this.categoria = categoria;
        this.numcomponente = numcomponente;
        this.puntuacion = puntuacion;
    }

    public AgrupacionCarnaval(String nombre, String autorletraymusica, int categoria, int numcomponente, int puntuacion) {
        this.nombre = nombre;
        this.autorletra = autorletraymusica;
        this.autormusica = autorletraymusica;
        this.categoria = categoria;
        this.numcomponente = numcomponente;
        this.puntuacion = puntuacion;
    }
    
    boolean puntuar(int puntuacion){

        if(puntuacion<=100){
            this.puntuacion=puntuacion;
        }
        
        return (puntuacion<=100);
    }
    boolean puntuar(int presentación, int pasodobles, int cuplés, int popurrí){
        
        if(((presentación+pasodobles+cuplés+popurrí)<=100)){
            this.puntuacion=presentación+pasodobles+cuplés+popurrí;
        }
        return ((presentación+pasodobles+cuplés+popurrí)<=100);
    }

    int getPuntuacion() {
        return puntuacion;
    }


    @Override
    public String toString() {
        return "AgrupacionCarnaval \n" + "Nombre :" + nombre + "\n Categoría :" +
                categoria + "\n Puntuacion :" + puntuacion ;
    }
    
}
