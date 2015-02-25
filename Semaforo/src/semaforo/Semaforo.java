/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

/**
 *
 * @author Manuel Manzano López
 */
public class Semaforo {
    int posicion=0;
    boolean parpadeando =false;
    
    int getEstado(){
        return posicion;
    }
  
    void subir(){
        if(posicion==0||posicion==1){
            posicion++;
        }
    }
    void bajar(){
        if(posicion==2||posicion==1 ){
            posicion--;
        }
   
    }
    boolean isparpadenado(){
        if (posicion==1){
            return parpadeando=true;
            
        }else{
            return parpadeando=false;
        }
    }
}