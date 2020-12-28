package net.ubung.tictactoe;

public class Spieler {
    private final int spielerId;
    private final String pref;

    public Spieler(int spielerId, String pref) {
        this.spielerId = spielerId;
        this.pref=pref;
    }

    public int getSpielerId() {
        return spielerId;
    }

    public String getPref() {
        return pref;
    }
}
