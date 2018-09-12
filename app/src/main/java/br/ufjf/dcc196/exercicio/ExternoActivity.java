package br.ufjf.dcc196.exercicio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ExternoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_externo);


      Toast.makeText(getApplicationContext(), "exter onCreate()",Toast.LENGTH_SHORT).show();}



    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(),"exter onStart()", Toast.LENGTH_SHORT).show();

    }


      }


