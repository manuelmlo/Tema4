/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuel Manzano López.
 */
public class Pizza {
    /**
     * 
     */
    public static final int ING_ATUN=0;
    /**
     * 
     */
    public static final int ING_BACON=1;
    /**
     * 
     */
    public static final int ING_CEBOLLA=2;
    /**
     * 
     */
    public static final int ING_CHAMPIÑONES=3;
    /**
     * 
     */
    public static final int ING_JAMON=4;
    /**
     * 
     */
    public static final int ING_PIMIENTO=5;
    /**
     * 
     */
    public static final int ING_VACIO=6;
    /**
     * 
     */
    public static final int TAM_GRANDE=7;
    /**
     * 
     */
    public static final int TAM_PEQUEÑA=8;
    /**
     * 
     */
    
    protected int pedido=0;
    protected int tamaño=0;
    protected int ingrediente1=0;
    protected int ingrediente2=0;
    protected int ingrediente3=0;
    protected int estado=0;
    
    
    /**
     * Realiza el pedido de una pizza con un ingrediente,
     * del tamaño, asignando un número de pedido.
     * @param tamaño
     * @param ingrediente
     */
    public Pizza(int tamaño, int ingrediente) {
        this.tamaño=tamaño;
        this.ingrediente1=ingrediente;
        
    }
        /**
     * Realiza el pedido de una pizza con 3 ingredientes, 
     * del tamaño indicado asignando un número de pedido consecutivo.
     * @param tamaño
     * @param ingrediente1
     * @param ingrediente2
     */
    public Pizza (int tamaño, int ingrediente1, int ingrediente2){
        this.tamaño=tamaño;
        this.ingrediente1=ingrediente1;
        this.ingrediente1=ingrediente2;
        this.ingrediente1=ingrediente3;    }
    /**
     * Realiza el pedido de una pizza con 3 ingredientes, 
     * del tamaño indicado asignando un número de pedido consecutivo.
     * @param tamaño
     * @param ingrediente1
     * @param ingrediente2
     * @param ingrediente3
     */
    public Pizza (int tamaño, int ingrediente1, int ingrediente2, 
            int ingrediente3){
        this.tamaño=tamaño;
        this.ingrediente1=ingrediente1;
        this.ingrediente1=ingrediente2;
        this.ingrediente1=ingrediente3;
    }
    
    /**
     * Pasa la pizza a cocina si el tamaño de la pizza es correcto,
     * y los códigos deingredientes son correctos.
     */
    public void cocinar(){
        if(TAM_PEQUEÑA==tamaño || TAM_GRANDE==tamaño ){
            if (ingrediente1<=ING_ATUN && ingrediente1<=ING_VACIO){
                estado=1;
            }
            
        }else{
            estado=0;
        }
    }
    /**
     * Sirve el pedido de la pizza al cliente, 
     * calculando el precio de la misma
     */
    public void servir(){
    }
    /**
     * Permite cambiar un determinado el ingrediente cuyo número de orden 
     * se indique en el primer parámetro, asignado el ingrediente que se 
     * indique como segundo parámetro, permitiendo el cambio sólo si la 
     * pizza no ha entrado ya en cocina.
     * @param ordenIngrediente
     * @param ingrediente
     */
    public void setIngrediente(int ordenIngrediente, int ingrediente){
    
    }
    /**
     * Permite cambiar el tamaño de la pizza si todavía no ha entrado en cocina.
     * @param tamaño
     */
    public void setTamaño(int tamaño){
        
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Pizza{" + "pedido=" + pedido + ", tama\u00f1o=" + tamaño + ", ingrediente1=" + ingrediente1 + ", ingrediente2=" + ingrediente2 + ", ingrediente3=" + ingrediente3 + ", estado=" + estado + '}';
    }

    
}
