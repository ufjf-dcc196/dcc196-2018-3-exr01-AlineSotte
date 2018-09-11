package br.ufjf.dcc196.exercicio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ServidorActivity extends AppCompatActivity {

//    TextView txt_mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servidor);


        
     Toast.makeText(getApplicationContext(), "serv onCreate()",Toast.LENGTH_SHORT).show();

     }



    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(),"serv onStart()", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume(){

        super.onResume();
        Toast.makeText(getApplicationContext(),"serv onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(),"serv onStop()", Toast.LENGTH_SHORT).show(); }


    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(),"serv onRestart()", Toast.LENGTH_SHORT).show(); }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(),"serv onPause()", Toast.LENGTH_SHORT).show(); }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"serv onDestroy()", Toast.LENGTH_SHORT).show(); }
}

