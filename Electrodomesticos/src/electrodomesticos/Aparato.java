package electrodomesticos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuel Manzano López
 */
public class Aparato {
    private String nombreaparato="";
    private int consumo=0;
    private boolean estado=false;
    private static int consumototal=0;

   public Aparato(String nombreaparato, int consumo,boolean estado){
       this.nombreaparato=nombreaparato;
       this.consumo=consumo;
       this.estado=estado;
    }
    public Aparato (String nombreaparato, int consumo){
        this.nombreaparato=nombreaparato;
        this.consumo=consumo;
    }

    public void setNombreaparato(String nombreaparato) {
        this.nombreaparato = nombreaparato;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public void setEstado(boolean estado) {
        this.consumoTotal(estado);
        
    }
    protected  void consumoTotal(boolean estado){
        if(estado){
           this.consumototal+=this.consumo; 
        }else{
            this.consumototal-=this.consumo;
        }
}
    
    static int getConsumoTotal(){
        
        return consumototal ;
    }

    public boolean isEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Aparato" + "Nombreaparato=" + nombreaparato + "\n Consumo=" + 
                consumo + "\n estado=" + estado ;
    }

    
}
