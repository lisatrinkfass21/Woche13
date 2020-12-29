package net.ubung.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    private final int id1 = R.id.btn1;
    private final int id2 = R.id.btn2;
    private final int id3 = R.id.btn3;
    private final int id4 = R.id.btn4;
    private final int id5 = R.id.btn5;
    private final int id6 = R.id.btn6;
    private final int id7 = R.id.btn7;
    private final int id8 = R.id.btn8;
    private final int id9 = R.id.btn9;

     /*

     private Spieler player1 = new Spieler(1, "X");
     private Spieler player2 = new Spieler(2, "O");
     private Spieler currentPlayer = player1;
     Main_logic ml = new Main_logic();
     private int freieFelder = 9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resetTable();
        ml.start();
    }

    public void enterTab(View view) {
        TextView free = (TextView)findViewById(R.id.freieFields);
        TextView text = (TextView)findViewById(R.id.SpielerAnzeige);
        Button button = (Button)view;
        int id  = 0;
        switch (button.getId()){
            case id1: id = 1; break;
            case id2: id = 2; break;
            case id3: id = 3; break;
            case id4: id = 4; break;
            case id5: id = 5; break;
            case id6: id = 6; break;
            case id7: id = 7; break;
            case id8: id = 8; break;
            case id9: id = 9; break;
            default: break;

        }
        int abb = -5;
       if(convertCheckKoordinaten(id)){
           button.setText(currentPlayer.getPref());
           --freieFelder;
           free.setText(String.valueOf(freieFelder));
           if(freieFelder<5) {
               abb = ml.checkAbbruch();
                   switch (abb) {
                       case 1:
                           ml.resetfield();
                           resetTable();
                           Toast.makeText(getApplicationContext(), "Spieler 1 ist der Gewinner", Toast.LENGTH_LONG).show();
                           break;
                       case 2:
                           ml.resetfield();
                           resetTable();
                           Toast.makeText(getApplicationContext(), "Spieler 2 ist der Gewinner", Toast.LENGTH_LONG).show();

                           break;
                       case 0:
                           ml.resetfield();
                           resetTable();
                           Toast.makeText(getApplicationContext(), "Das Spiel ist aus - kein Sieger", Toast.LENGTH_LONG).show();
                           break;
                   }
               }
           if (abb == -5) {
               if (currentPlayer.equals(player1)) {
                   currentPlayer = player2;
                   text.setText("Spieler 2");
               } else {
                   currentPlayer = player1;
                   text.setText("Spieler 1");
               }
           }

       }else{
           Toast.makeText(getApplicationContext(),"Dieses Feld ist schon besetzt", Toast.LENGTH_LONG).show();
       }

    }

    private void resetTable(){
        TextView free = (TextView)findViewById(R.id.freieFields);
        TextView text = (TextView)findViewById(R.id.SpielerAnzeige);
        currentPlayer = player1;
        text.setText("Spieler 1");
        freieFelder = 9;
        free.setText("9");
        Button b1 = (Button)findViewById(R.id.btn1);
        Button b2 = (Button)findViewById(R.id.btn2);
        Button b3 = (Button)findViewById(R.id.btn3);
        Button b4 = (Button)findViewById(R.id.btn4);
        Button b5 = (Button)findViewById(R.id.btn5);
        Button b6 = (Button)findViewById(R.id.btn6);
        Button b7 = (Button)findViewById(R.id.btn7);
        Button b8 = (Button)findViewById(R.id.btn8);
        Button b9 = (Button)findViewById(R.id.btn9);
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
    }

    private boolean convertCheckKoordinaten(int id){
        int y = -1;
        int x = -1;
        switch(id){
            case 1:
                y= 0;
                x=0;
                break;
            case 2:
                x=0;
                y=1;
                break;
            case 3:
                x=0;
                y=2;
                break;
            case 4:
                x=1;
                y=0;
                break;
            case 5:
                x=1;
                y=1;
                break;
            case 6:
                x=1;
                y=2;
                break;
            case 7:
                x=2;
                y=0;
                break;
            case 8:
                x=2;
                y=1;
                break;
            case 9:
                x=2;
                y=2;
                break;
            default: break;
        }
       return ml.setPlaymove(x,y);
    }



     */

private Spieler player1 = new Spieler(1, "X");
    private String currentPlayer = player1.getPref();
    Main_logic ml = new Main_logic();
    private int freieFelder = 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resetTable();
        ml.start();
    }

    private void resetTable(){
        TextView free = (TextView)findViewById(R.id.freieFields);
        TextView text = (TextView)findViewById(R.id.SpielerAnzeige);
        currentPlayer = player1.getPref();
        text.setText("Spieler 1");
        freieFelder = 9;
        free.setText("9");
        Button b1 = (Button)findViewById(R.id.btn1);
        Button b2 = (Button)findViewById(R.id.btn2);
        Button b3 = (Button)findViewById(R.id.btn3);
        Button b4 = (Button)findViewById(R.id.btn4);
        Button b5 = (Button)findViewById(R.id.btn5);
        Button b6 = (Button)findViewById(R.id.btn6);
        Button b7 = (Button)findViewById(R.id.btn7);
        Button b8 = (Button)findViewById(R.id.btn8);
        Button b9 = (Button)findViewById(R.id.btn9);
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
    }

    public void enterTab(View view) {
        TextView free = (TextView)findViewById(R.id.freieFields);
        TextView text = (TextView)findViewById(R.id.SpielerAnzeige);
        Button button = (Button)view;
        int id  = 0;
        switch (button.getId()){
            case id1: id = 1; break;
            case id2: id = 2; break;
            case id3: id = 3; break;
            case id4: id = 4; break;
            case id5: id = 5; break;
            case id6: id = 6; break;
            case id7: id = 7; break;
            case id8: id = 8; break;
            case id9: id = 9; break;
            default: break;

        }
        int abb = -5;
        if(convertCheckKoordinaten(id)){
            button.setText(currentPlayer);
            --freieFelder;
            free.setText(String.valueOf(freieFelder));
                abb = ml.checkAbbruch();
                switch (abb) {
                    case 1:
                        ml.resetfield();
                        resetTable();
                        Toast.makeText(getApplicationContext(), "Spieler 1 ist der Gewinner", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        ml.resetfield();
                        resetTable();
                        Toast.makeText(getApplicationContext(), "Computer ist der Gewinner", Toast.LENGTH_LONG).show();

                        break;
                    case 0:
                        ml.resetfield();
                        resetTable();
                        Toast.makeText(getApplicationContext(), "Das Spiel ist aus - kein Sieger", Toast.LENGTH_LONG).show();
                        break;
                }

            if (abb == -5) {
               Move m = ml.setComputerMove();
               int idComp = convertMoveToID(m.getCol(), m.getRow());
               Button butt = (Button)findViewById(idComp);
               butt.setText("O");
               --freieFelder;
               free.setText(String.valueOf(freieFelder));
                abb = ml.checkAbbruch();
                switch (abb) {
                    case 1:
                        ml.resetfield();
                        resetTable();
                        Toast.makeText(getApplicationContext(), "Spieler 1 ist der Gewinner", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        ml.resetfield();
                        resetTable();
                        Toast.makeText(getApplicationContext(), "Computer ist der Gewinner", Toast.LENGTH_LONG).show();

                        break;
                    case 0:
                        ml.resetfield();
                        resetTable();
                        Toast.makeText(getApplicationContext(), "Das Spiel ist aus - kein Sieger", Toast.LENGTH_LONG).show();
                        break;
                }
            }

        }else{
            Toast.makeText(getApplicationContext(),"Dieses Feld ist schon besetzt", Toast.LENGTH_LONG).show();
        }

    }

    private int convertMoveToID(int col, int row){
        if(row == 0 && col == 0){
            return id1;
        }if(row == 0 && col == 1){
            return id2;
        }if(row == 0 && col == 2){
            return id3;
        }if(row == 1 && col == 0){
            return id4;
        }if(row == 1 && col == 1){
            return id5;
        }if(row == 1 && col == 2){
            return id6;
        }if(row == 2 && col == 0){
            return id7;
        }if(row == 2 && col == 1){
            return id8;
        }if(row == 2 && col == 2){
            return id9;
        }return 0;

    }









    private boolean convertCheckKoordinaten(int id){
        int y = -1;
        int x = -1;
        switch(id){
            case 1:
                y= 0;
                x=0;
                break;
            case 2:
                x=0;
                y=1;
                break;
            case 3:
                x=0;
                y=2;
                break;
            case 4:
                x=1;
                y=0;
                break;
            case 5:
                x=1;
                y=1;
                break;
            case 6:
                x=1;
                y=2;
                break;
            case 7:
                x=2;
                y=0;
                break;
            case 8:
                x=2;
                y=1;
                break;
            case 9:
                x=2;
                y=2;
                break;
            default: break;
        }
        return ml.setPlaymove(x,y);
    }


}