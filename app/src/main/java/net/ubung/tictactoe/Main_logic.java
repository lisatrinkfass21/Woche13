package net.ubung.tictactoe;

public class Main_logic {

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
        currentSpieler  = s1;
        freieFelder = 9;
    }

    public boolean setPlaymove(int x, int y){
        if(checkKoordinaten(x,y)) {
            field[x][y] = currentSpieler.getPref();
            --freieFelder;
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
            if(field[i][0].equals(field[i][1]) && field[i][1].equals(field[i][2])){
                return currentSpieler.getSpielerId();
            }
        }

        //checkColumn
        for (int i = 0; i<field.length; i++){
            if(field[0][i].equals(field[1][i]) && field[1][i].equals(field[2][i])){
                return currentSpieler.getSpielerId();
            }
        }

        //check diogonale
        if(field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2])) {
            return 1;
        }
        if(field[0][3].equals(field[1][1]) && field[1][1].equals(field[2][0])) {
            return 1;
        }

        //check unentschieden
        if(freieFelder==0){
            return 0;
        }

        if (currentSpieler.equals(s1)) {
            currentSpieler = s2;
        } else {
            currentSpieler = s1;
        }
        return -1;
    }
    }




