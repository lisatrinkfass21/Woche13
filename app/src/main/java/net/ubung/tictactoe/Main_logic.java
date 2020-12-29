package net.ubung.tictactoe;

public class Main_logic {

    /* TicTacToe für 2 Spieler

    Spieler s1 = new Spieler(1, "X");
    Spieler s2 = new Spieler(2, "O");
    Spieler currentSpieler;
    String[][] field;
    private int freieFelder = 9;
    

    public void start(){
        currentSpieler = s1;
        resetfield();

    }

    public void resetfield(){
        field = new String[3][3];
        for (int i = 0; i< field.length; i++){
            for (int j = 0; j < field.length; j++){
                field[i][j]= "";
            }
        }
        currentSpieler  = s2;
        freieFelder = 9;
    }

    public boolean setPlaymove(int x, int y){

        if(checkKoordinaten(x,y)) {
            field[x][y] = currentSpieler.getPref();
            --freieFelder;
            if (currentSpieler.equals(s1)) {
                currentSpieler = s2;
            } else {
                currentSpieler = s1;
            }
            return true;
        }


    return false;
    }



    private boolean checkKoordinaten(int x, int y){
        if(field[x][y].equals("")){
            return true;
        }
        return false;
    }

    public int checkAbbruch(){
        //int steht für AbbruchType:
        // -1: kein Abbruch
        // 0: unentschieden
        // 1: Spieler1
        // 2: Spieler2


        //checkrow
        for (int i = 0; i< field.length; i++){
            if(!field[i][0].equals("")&&field[i][0].equals(field[i][1]) && field[i][1].equals(field[i][2])){
                return currentSpieler.getSpielerId();
            }
        }

        //checkColumn
        for (int i = 0; i<field.length; i++){
            if(!field[0][i].equals("")&&field[0][i].equals(field[1][i]) && field[1][i].equals(field[2][i])){
                return currentSpieler.getSpielerId();
            }
        }

        //check diogonale
        if(!field[0][0].equals("")&&field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2])) {
            return currentSpieler.getSpielerId();
        }
        if(!field[0][2].equals("")&&field[0][2].equals(field[1][1]) && field[1][1].equals(field[2][0])) {
            return currentSpieler.getSpielerId();
        }


        //check unentschieden
        if(freieFelder==0){
            return 0;
        }


        return -5;
    }



     *///TicTacToe mit MiniMaxAlgorithmus

    Spieler s1 = new Spieler(1, "X");
    MiniMax mm = new MiniMax();
    String[][] field;
    private int freieFelder = 9;
    String currentSpieler = s1.getPref();

    public void start(){
        resetfield();
    }

    public void resetfield(){
        field = new String[3][3];
        for (int i = 0; i< field.length; i++){
            for (int j = 0; j < field.length; j++){
                field[i][j]= "";
            }
        }
        currentSpieler  = "X";
        freieFelder = 9;
    }

    public Move setComputerMove(){
        Move best = mm.findBestMove(field);
        field[best.getRow()][best.getCol()] = "O";
        currentSpieler = "X";
        --freieFelder;
        return best;
    }

    public boolean setPlaymove(int x, int y){
        if(checkKoordinaten(x,y)) {
            field[x][y] = "X";
            --freieFelder;
            currentSpieler="O";
            return true;
        }


        return false;
    }

    private boolean checkKoordinaten(int x, int y){
        if(field[x][y].equals("")){
            return true;
        }
        return false;
    }

    public int checkAbbruch(){

        //checkrow
        for (int i = 0; i< field.length; i++){
            if(!field[i][0].equals("")&&field[i][0].equals(field[i][1]) && field[i][1].equals(field[i][2])){
                if(currentSpieler.equals("X")){
                    return 2;
                }else{
                    return 1;
                }
            }
        }

        //checkColumn
        for (int i = 0; i<field.length; i++){
            if(!field[0][i].equals("")&&field[0][i].equals(field[1][i]) && field[1][i].equals(field[2][i])){
                if(currentSpieler.equals("X")){
                    return 2;
                }else{
                    return 1;
                }
            }
        }

        //check diogonale
        if(!field[0][0].equals("")&&field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2])) {
            if(currentSpieler.equals("X")){
                return 2;
            }else{
                return 1;
            }
        }
        if(!field[0][2].equals("")&&field[0][2].equals(field[1][1]) && field[1][1].equals(field[2][0])) {
            if(currentSpieler.equals("X")){
                return 2;
            }else{
                return 1;
            }
        }


        //check unentschieden
        if(freieFelder==0){
            return 0;
        }


        return -5;
    }




}



