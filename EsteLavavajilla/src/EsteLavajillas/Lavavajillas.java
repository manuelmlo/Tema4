package EsteLavajillas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuel Manzano López
 */
public class Lavavajillas { 
    /**
     * Valor del programa de enjuagado.
     */
    public static final int RINSING=1;
    /**
     * Valor del programa de Prelavado.
     */
    public static final int PREWASHER=2;
    /**
     * Valor del programa de Lavado.
     */
    public static final int WASHER=3;
    /**
     * Valor del programa de Aclarado.
     */
    public static final int RINSE=4;
    /**
     * Valor del programa de secado.
     */
    public static final int DRY=5;

    /**
     *Estado de la Puerta, abierta o cerrada.
     */
    protected boolean statusdoor=false;

    /**
     *Estado de la Energía,si hay conrriente o no hay corriente.
     */
    protected boolean statuspower=false;

    /**
     *Estado del programa del Lavavajillas, programa que se está
     * ejecutando en el proceso de lavado.
     */
    protected int statusprogram=1;
    
    /**
     * Este método configura el estado de la puerta del lavajillas.
     * Cada llamada al método cambia el estado de la puerta del lavajillas,se 
     * se parte de la puerta del lavajillas con la puerta abierta.
     * @param status
     */
    public void setStatusdoor(boolean status){
        if(status){
            statusdoor=false;
            statuspower=false;
        }else{
            statusdoor=true;
        }
    }
    
    /**
     * Este método configura el estado de la energía del lavajillas.
     * Cada llamada al método cambia el estado de energía del lavajillas, de 
     * apagado a encendido y viceversa.
     * @param status
     */
    public void setStatuspower(boolean status){
        if(status){
            statuspower=false;
        }else{
            statuspower=true;
        }
        
    }
    
    /**
     * Este método configura el estado del lavavajillas mediante los valores de 
     * admitidos.
     * Los valores admitidos solo realizan el cambio de estado mediante el 
     * parámetro de entrada status, que admite los valores definidos en las 
     * propiedades estáticas.
     * @param status 
     */
    public void setStatusProgramManual(int status){
        if (statusdoor && statuspower &&(RINSING<=status && status<=DRY)){
            statusprogram=status;
        }
    }
    
    /**
     * Este método configura el estado del lavavajillas automáticamente según el
     * estado actual.
     * Se avanza un nivel de estado a partir del estado actual del lavajillas 
     * en el caso de utilizar el mismo método en el último estado, volverá a 
     * empezar de nuevo el programa inicial.
     */
    public void setStatusProgramAuto(){
        if (statusdoor && statuspower){
            if(statusprogram<DRY){
                statusprogram++;
            }else{
                statusprogram=RINSING;
            }
        }
    }
    
    /**
     * Este método devuelve el estado de la puerta.
     * @return 
     */
    public boolean isStatusdoor() {
        return statusdoor;
    }
    
    /**
     * Este método devuelve el estado de la energía.
     * @return 
     */

    public boolean isStatuspower() {
        return statuspower;
    }
    
    /**
     * Este método devuleve el estado del programa actual.
     * @return 
     */
    public int getStatusprogram() {
        return statusprogram;
    }
    /**
     * Método retorna el programa que se está ejecutando en el lavavajilla.
     * @return El programa que se está ejecutando.
     */
    public String getStatusprogramString(){
        switch(getStatusprogram()){
            case 1:
                return "Enjuagado";
                
            case 2:
                return "Prelavado";
               
            case 3:
                return "Lavado";
                
            case 4:
                return "Enjuagado";
                
            case 5:
                return "Secado";
                
            default:
                return "Error";
        }   
    }
    /**
     * Método que retorna en String el estado de la puerta del lavajillas.
     * @return Estado de la puerta.
     */
    public String getStatusdoor(){
        if(!this.isStatusdoor()){
            return "Abierta";
        }else{
            return "Cerrada";
        }
    }
    /**
     * Método que retorna en String el estado de la energía del lavajillas.
     * @return Estado de la energía.
     */
    public String getStatuspower(){
        if(this.isStatuspower()){
            return "Encendido";
        }else{
            return "Apagado";
        }
    }
}
