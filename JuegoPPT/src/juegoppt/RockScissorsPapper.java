package juegoppt;


import java.awt.Color;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel Manzano López
 */
public class RockScissorsPapper {

    public final int ROCK = 0;
    public final int PAPER = 1;
    public final int SCISSORS = 2;
    static int symbols;
    static int movegamer;
    static public String namegamer;
    static public Color gamercolor;
    static protected int nummove=0;
    static protected int score;
    static protected int movecomputer;
    static protected String auxs;
    static protected int winner;
    protected int scoregamer;
    protected int scorecomputer;

    /**
     *
     */
    public RockScissorsPapper() {
        symbols = 3;
    }

    /**
     *
     * @param symbols
     */
    public RockScissorsPapper(int symbols) {
        if (symbols >= 3 && !(0 == symbols % 2)) {
            this.symbols = symbols;
        } else {
            this.symbols = symbols + 1;
        }
    }

    /**
     *
     * @param name
     * @param gamercolor
     */
    public RockScissorsPapper(String name, Color gamercolor) {
        RockScissorsPapper.namegamer = name;
        RockScissorsPapper.gamercolor = gamercolor;
        Random select = new Random();
        select.nextInt(symbols);
    }

    /**
     *
     * @param gamerchoice
     */
    static void setGamer(int gamerchoice) {
        movegamer = gamerchoice;
    }

    /**
     *
     */
    static void setComputer() {
        Random choicecomputer = new Random();
        movecomputer = choicecomputer.nextInt(symbols);
    }

    /**
     *
     */
    static protected void gameGeneral() {
        auxs = "";
        for (int i = 0; i <= symbols; i++) {

            if (i < (symbols % 2)) {
                auxs += movegamer - symbols - i;
            }
            if (i == (symbols % 2)) {
                auxs += movegamer;
            }
            if (i > (symbols % 2)) {
                auxs += (symbols - i) * (-1);
            }
        }             
    }

    protected void score() {
        switch(winner){
            case -1:
                scorecomputer=50;
                scoregamer=50;
                break;
            case 0:
                scorecomputer=100;
                break;
            case 1:
                scoregamer=100;
                break;
            default:
        }
    }

    public void upLevel() {
        if (symbols >= 3) {
            symbols = symbols / 2;
            symbols++;
            symbols = (symbols * 2) + 1;
        }
    }

    public void downLevel() {
        if (!(symbols > 3)) {
            symbols = symbols / 2;
            symbols--;
            symbols = (symbols * 2) + 1;
        }
    }

    static void whoIsWinner() {
        if (nummove>0){
            gameGeneral();
            for(int i=0;i<auxs.length();i++){
                if(movecomputer==Integer.valueOf(String.valueOf(auxs.charAt(i)))){
                    if(i==(symbols%2)){
                        winner=0;
                    }else{
                        if(i==((symbols/2)-1)||i==(symbols/2)+1){
                            if(i==((symbols/2)-1)){
                               winner=2; 
                            }
                            if(i==(symbols/2)+1){
                                winner=1;
                            }
                        }else{
                            if(i<((symbols/2)-1)){
                                winner=1;
                            }
                            if(i>(symbols/2)+1){
                                winner=2;
                            }
                        
                        }
                    
                    }
                   
                }     
            }
        }else{
            nummove=symbols;
        }
    }
//    public void whoIsWinner(int gamer1, int gamer2) {
//        
//        if (nummove>0){
//            gameGeneral();
//            for(int i=0;i<auxs.length();i++){
//                if(movecomputer==Integer.valueOf(String.valueOf(auxs.charAt(i)))){
//                    if(i==(symbols%2)){
//                        winner=0;
//                    }else{
//                        if(i==((symbols/2)-1)||i==(symbols/2)+1){
//                            if(i==((symbols/2)-1)){
//                               winner=2; 
//                            }
//                            if(i==(symbols/2)+1){
//                                winner=1;
//                            }
//                        }else{
//                            if(i<((symbols/2)-1)){
//                                winner=1;
//                            }
//                            if(i>(symbols/2)+1){
//                                winner=2;
//                            }
//                        
//                        }
//                    
//                    }
//                   
//                }     
//            }
//        }else{
//            nummove=symbols;
//        }
//    }
    
    public void gameTry(int gametry ){
        nummove=gametry; 
    }

    public int getScoregamer() {
        return scoregamer;
    }

    public int getScorecomputer() {
        return scorecomputer;
    }

    public static int getTry() {
        return nummove;
    }

    public static int getWinner() {
        return winner;
    }
    
    
}

