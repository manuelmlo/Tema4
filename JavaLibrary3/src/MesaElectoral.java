/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuel Manzano López.
 */
public class MesaElectoral {
    private String presidente;
    private String secretario;
    private String vocal;
    private int censo=0;
    private boolean abierta;
    private int votosPartido0;
    private int votosPartido1;
    private int votosPartido2;
    
    static final int BB=0;
    static final int PSAO=1;
    static final int UI=2;

    public MesaElectoral(String presidente, String secretario, String vocal, int censo) {
        this.presidente = presidente;
        this.secretario = secretario;
        this.vocal = vocal;
        this.censo = censo;
        this.abierta=false;
    }

    public MesaElectoral(int censo) {
        this.censo = censo;
        this.abierta=true;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }
    public void setVotos(int num, int partido){
        if(abierta){
            switch (partido){
                case BB:
                    votosPartido0+=num;
                    break;
                case PSAO:
                    votosPartido1+=num;
                    break;
                case UI:
                    votosPartido2+=num;
                    break;

            }
        }
        
    }
    public void setVotos(int partido){
        if(abierta){
            switch (partido){
                case BB:
                    votosPartido0++;
                    break;
                case PSAO:
                    votosPartido1++;
                    break;
                case UI:
                    votosPartido2++;
                    break;

            }
        }
    }
    
    public int getVotos(int partido){
        switch (partido){
                case BB:
                    return votosPartido0;
                case PSAO:
                    return votosPartido1;
                case UI:
                    return votosPartido2;
                default:
                    return 0;
        }
    }
    
    public int participacion(){
        return 100*(censo/(getVotos(BB)+getVotos(PSAO)+getVotos(UI)));
    }
    
}
