package net.ubung.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


     private Spieler player1 = new Spieler(1, "X");
     private Spieler player2 = new Spieler(2, "O");
     private Spieler currentPlayer = player1;
     Main_logic ml = new Main_logic();
     private int freieFelder = 9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void enterTab(View view) {
        TextView free = (TextView)findViewById(R.id.freieFields);
        TextView text = (TextView)findViewById(R.id.SpielerAnzeige);
        Button button = (Button)view;
        int id  = 0;
        switch (button.getId()){
            case R.id.btn1: id = 1; break;
            case R.id.btn2: id = 2; break;
            case R.id.btn3: id = 3; break;
            case R.id.btn4: id = 4; break;
            case R.id.btn5: id = 5; break;
            case R.id.btn6: id = 6; break;
            case R.id.btn7: id = 7; break;
            case R.id.btn8: id = 8; break;
            case R.id.btn9: id = 9; break;
            default: break;

        }
        int abb = -1;
       if(convertCheckKoordinaten(id)){
           button.setText(currentPlayer.getPref());
           --freieFelder;
           free.setText(freieFelder);
           if(freieFelder<5) {
               abb = ml.checkAbbruch();
               switch (abb) {
                   case 1:
                       Toast.makeText(getApplicationContext(), "Spieler 1 ist der Gewinner", Toast.LENGTH_LONG).show();
                       ml.resetfield();
                       resetTable();
                       break;
                   case 2:
                       Toast.makeText(getApplicationContext(), "Spieler 2 ist der Gewinner", Toast.LENGTH_LONG).show();
                       ml.resetfield();
                       resetTable();
                       break;
                   case 0:
                       Toast.makeText(getApplicationContext(), "Das Spiel ist aus - kein Sieger", Toast.LENGTH_LONG).show();
                       ml.resetfield();
                       resetTable();
                       break;

               }
           }
           if (currentPlayer.equals(player1)) {
               currentPlayer = player2;
               text.setText("Spieler 2");
           } else {
               currentPlayer = player1;
               text.setText("Spieler 1");
           }
       }else{
           Toast.makeText(getApplicationContext(),"Dieses Feld ist schon besetzt", Toast.LENGTH_LONG).show();
       }

    }

    private void resetTable(){
        currentPlayer = player1;
        freieFelder = 9;
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

}