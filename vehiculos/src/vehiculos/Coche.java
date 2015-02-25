/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Manuel Manzano López
 */
public class Coche {
    String modelo;
    String color;
    boolean metalizada;
    String matricula;
    int año;
    
    void asignarValores (String mod, String col, boolean met, String mat,int anio){
        modelo=mod;
        color=col;
        metalizada=met;
        matricula=mat;
        año=anio;
    }
    String mostrarDatos (){
        return modelo+", "+color;  
    }
    
}
