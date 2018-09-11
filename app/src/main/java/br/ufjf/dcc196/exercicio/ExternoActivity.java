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

    @Override
    protected void onResume(){

        super.onResume();
        Toast.makeText(getApplicationContext(),"exter onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(),"exter onStop()", Toast.LENGTH_SHORT).show(); }


    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(),"exter onRestart()", Toast.LENGTH_SHORT).show(); }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(),"exter onPause()", Toast.LENGTH_SHORT).show(); }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"exter onDestroy()", Toast.LENGTH_SHORT).show(); }
      }


