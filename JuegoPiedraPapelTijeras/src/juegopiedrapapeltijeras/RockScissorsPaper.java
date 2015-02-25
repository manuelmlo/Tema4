package juegopiedrapapeltijeras;

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
public class RockScissorsPaper {

    public final int ROCK = 0;
    public final int PAPER = 1;
    public final int SCISSORS = 2;
    public final int LIZARD = 3;
    public final int SPOCK = 4;
    static protected int symbols = 3;
    static protected int movegamer;
    static protected int movecomputer;
    static public String namegamer = "Gamer";
    static public Color gamercolor = Color.GRAY;
    static protected int numround=3;
    static protected int score;
    static protected int winner;
    protected static String auxs;
    protected static int scoregamer;
    protected static int scorecomputer;
    protected static int roundwingamer;
    protected static int roundwinpc;
    protected static int numroundgamer;
    protected static int numroundpc;
    protected static int numrounds;

    public static int getMovegamer() {
        return movegamer;
    }

    public static int getMovecomputer() {
        return movecomputer;
    }

    /**
     *
     */
    public RockScissorsPaper() {
        symbols = 3;
    }

    /**
     * Método para establecer el nombre del jugador.
     *
     * @param namegamer Nombre del jugador.
     */
    public static void setNamegamer(String namegamer) {
        RockScissorsPaper.namegamer = namegamer;
    }

    /**
     * Método para establecer el color del jugador.
     *
     * @param gamercolor Color del jugador.
     */
    public static void setGamercolor(Color gamercolor) {
        RockScissorsPaper.gamercolor = gamercolor;
    }

    /**
     * Constructor para juego estableciendo el tipo de juego. Un entero mayor o
     * igual a 3 y números impares.
     *
     * @param symbols El tipo de juego mediante entero
     */
    public RockScissorsPaper(int symbols) {
        if (symbols >= 3 && !(0 == symbols % 2)) {
            this.symbols = symbols;
        } else {
            this.symbols = symbols + 1;
        }
    }

    /**
     * Constructor para juego clásico piedra, papel, tijeras. Se estable el
     * nombre y el color del jugador.
     *
     * @param name Nombre del jugador.
     * @param gamercolor Color del jugador.
     */
    public RockScissorsPaper(String name, Color gamercolor) {
        RockScissorsPaper.namegamer = name;
        RockScissorsPaper.gamercolor = gamercolor;
        Random select = new Random();
        select.nextInt(symbols);
    }

    /**
     * Método para establecer la elección del jugador.
     *
     * @param gamerchoice Entero para la elección del jugador.
     */
    public static void setGamer(int gamerchoice) {
        movegamer = gamerchoice;
    }

    /**
     * Método para que el PC establezca una elección.
     */
    public static void setComputer() {
        Random choicecomputer = new Random();
        movecomputer = choicecomputer.nextInt(symbols);
    }

    /**
     * Método para realizar la metodología del juego en general.
     */
    protected static void gameGeneral() {

        auxs = "";
        for (int i = 0; i < symbols; i++) {
            if (i < (symbols / 2)) {
                if (movegamer < (symbols / 2)) {
                    if ((movegamer + (symbols / 2) + i + 1) < symbols) {
                        auxs += movegamer + (symbols / 2) + i + 1;
                    } else {
                        auxs += 0;
                    }
                } else {
                    if (movegamer > (symbols / 2)) {
                        auxs += movegamer - (symbols / 2) + i;
                    } else {
                        auxs += movegamer - (symbols / 2) + i;
                    }
                }
            }
            if (i == (symbols / 2)) {
                auxs += movegamer;
            }

            if (i > (symbols / 2)) {
                if (movegamer < (symbols / 2)) {
                    auxs += movegamer + (i - (symbols / 2));
                } else {
                    if (movegamer > (symbols / 2)) {
                        if ((movegamer + (i - (symbols / 2))) < symbols) {
                            auxs += movegamer + (i - (symbols / 2));
                        } else {
                            auxs += movegamer - symbols + i - (symbols / 2);
                        }
                    } else {
                        auxs += movegamer + (i - (symbols / 2));
                    }
                }
            }
        }
        System.out.println(auxs);
        System.out.println("Nº Symbols: " + symbols + "  Selection gamer: " + movegamer + ", Selection pc: " + movecomputer);
    }

    /**
     * Método para establecer las distintas puntuaciones. Según de quien a
     * ganado la ronda, PC, jugador o empate.
     */
    protected static void score() {
        switch (winner) {
            case 0:
                scorecomputer += 50;
                scoregamer += 50;
                break;
            case 1:
                scorecomputer += 100;
                break;
            case 2:
                scoregamer += 100;
                break;
            default:
        }
        if (getNumround() == 0) {
            if (roundwingamer > roundwinpc) {
                numroundgamer++;
                roundwingamer = 0;
                roundwinpc = 0;
            }
            if (roundwingamer < roundwinpc) {
                numroundpc++;
                roundwingamer = 0;
                roundwinpc = 0;
            }
        }
    }

    /**
     * Método que establece si ha habido un empate, o cual de los oponentes, ha
     * ganado la partida.
     */
    public static void whoIsWinner() {
        if (numround > 0) {
            RockScissorsPaper.gameGeneral();
            for (int i = 0; i < auxs.length(); i++) {
                if (movecomputer == Integer.valueOf(String.valueOf(auxs.charAt(i)))) {
                    if (i == (symbols % 2)) {
                        winner = 0;
                    } else {
                        if (i == ((symbols / 2) - 1) || i == (symbols / 2) + 1) {
                            if (i == ((symbols / 2) - 1)) {
                                winner = 2;
                                roundwingamer++;
                            }else{
                                if (i == (symbols / 2) + 1) {
                                winner = 1;
                                roundwinpc++;
                                }
                            }
                        } else {
                            if (i < ((symbols / 2) - 1)) {
                                winner = 1;
                                roundwinpc++;
                            }else{
                                if (i > (symbols / 2) + 1) {
                                winner = 2;
                                roundwingamer++;
                            }
                            }
                        }
                    }
                }
            }
            RockScissorsPaper.counter();
        } else {
            numround = symbols;
        }
        RockScissorsPaper.score();
    }

    /**
     * Método para establecer el número de intentos. Intentos antes de decidir
     * quién gana PC o Jugador o Empate.
     *
     * @param gameround Intentos de que compone la partida.
     */
    public static void setGameRound(int gameround) {
        numround = gameround;
    }

    /**
     * Método que devuelve la puntuación del jugador.
     *
     * @return Puntuación obtenida del jugador.
     */
    public static int getScoregamer() {
        return scoregamer;
    }

    /**
     * Método que devuelve la puntuación del PC.
     *
     * @return Puntuación obtenida del PC.
     */
    public static int getScorecomputer() {
        return scorecomputer;
    }

    /**
     * Método que devuelve el ganador. 0 si ha habido un empate, 1 si gana el
     * PC, 2 si gana el jugador
     *
     * @return Retorna un entero de quien gana el intento de la partida.
     */
    public static int getWinner() {
        return winner;
    }

    /**
     * Método para establecer la puntuación del jugador.
     *
     * @param scoregamer Puntuación del jugador.
     */
    public static void setScoregamer(int scoregamer) {
        RockScissorsPaper.scoregamer = scoregamer;
    }

    /**
     * Método para establecer la puntuación de PC.
     *
     * @param scorecomputer Puntuación del PC.
     */
    public static void setScorecomputer(int scorecomputer) {
        RockScissorsPaper.scorecomputer = scorecomputer;
    }

    /**
     * Método que devuelve el nombre del entero. El entero corresponde al los
     * distintos elementos, que se pueden elegir, según el tipo del juego.
     *
     * @param itemselected Entero que se desea saber el nombre del simbolo.
     * @return Nombre asociado al número entero.
     */
    public static String toStringvalues(int itemselected) {
        switch (itemselected) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            case 3:
                return "Lizard";
            case 4:
                return "Spock";
            default:
                return "";
        }
    }

    /**
     *Método que debuelve en formato cadena de caracter el ganador del intento.
     * Según el entero que se guardo en último lugar.
     * @return Retorna una cadena si hay un empate, si ha ganado el PC o el jugador.
     */
    public static String getWinnerString() {
        switch (RockScissorsPaper.getWinner()) {
            case 0:
                return "Empate";
            case 1:
                return "PC";
            case 2:
                return "Gamer";
            default:
                return "Empate";
        }

    }

    /**
     *Método que devuelve el número de intentos que queda en el partida.
     * El número almacenado en último lugar.
     * @return Número de intentos.
     */
    public static int getNumround() {
        return numround;
    }

    /**
     *Método para establecer el número de intentos de la partida.
     * 
     * @param nummove Número de intentos de cada partida.
     */
    public static void setNumround(int nummove) {
        RockScissorsPaper.numround = nummove;
    }

    /**
     *Método interno para establecer un contador de número de intentos.
     * Cada vez que se evalua una partida resta un intento al total almacenado.
     */
    protected static void counter() {
        if (numround > 0) {
            RockScissorsPaper.setNumround((RockScissorsPaper.getNumround()) - 1);
        }
    }

    /**
     *Método que retorna en formato cadena la cantidad de intentos que quedan.
     * Número de intentos que quedan para terminar la partida.
     * @return Número de intentos que resta en formato cadena.
     */
    public static String toStringround() {
        return "this try is " + String.valueOf(getNumround());
    }

    /**
     *Método para establecer una nueva partida.
     * Este método reinicializa la puntuación del PC y del jugador, la última 
     * elección del jugador, y el número de veces que ha ganado el jugador y el
     * PC, cada ronda o intento dentro de la partida.
     * @param numround número de intento de la nueva partida.
     */
    public static void setDefault(int numround) {
        RockScissorsPaper.numround = numround;
        scorecomputer = 0;
        scoregamer = 0;
        movegamer = 0;
        numroundgamer = 0;
        numroundpc = 0;
        setNewround();

    }

    /**
     *Método para establecer el tipo de juego de este tipo.
     * Tipo de juego con distintas variaciones, establece que debe ser a partir
     * del número 3 y debe ser números impares, ajusta el número se es necesario
     * para que se ajuste a las condiciones.
     * @param symbols Número de simbolo que intervienes en las distintas variaciones del juego.
     */
    public static void setSymbols(int symbols) {
        if (symbols >= 3 && !(0 == symbols % 2)) {
            RockScissorsPaper.symbols = symbols;
        } else {
            RockScissorsPaper.symbols = symbols + 1;
        }
    }

    /**
     *Método que devuelve en formato cadena quien es el ganador.
     * En función de la puntuación, si ha habido empate, si ha gandado el PC
     * o el jugador.
     * @return Retorna en Ninguno o Empate, PC o Jugador, según la puntuación.
     */
    public static String getWinnerScore() {
        if (scorecomputer == scoregamer) {
            return "Ninguno o Empate";
        } else {
            if (scorecomputer > scoregamer) {
                return "PC";
            } else {
                if (scorecomputer > scoregamer) {
                    return "Gamer";
                }
            }
        }
        return "Ninguno o Empate";
    }

    /**
     *Método que devuelve el ganador de la partida en formato cadena.
     * Según el número de rondas o intentos que se han ganado dentro de la partida.
     * @return Retorna el nombre del jugador, PC o Empate. 
     */
    public static String getWinnerRound() {

        if (numroundgamer == numroundpc) {
            return " Empate ";
        } else {

            if (numroundgamer > numroundpc) {
                setNewround();
                return RockScissorsPaper.namegamer;
            } else {
                setNewround();
                return " PC ";
            }
        }
    }

    /**
     *Método interno para inicializar el número de rondas o intentos.
     * Rondas o intento acumulados en la partida.
     */
    protected static void setNewround() {
        numroundgamer = 0;
        numroundpc = 0;
    }
}
