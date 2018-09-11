package br.ufjf.dcc196.exercicio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class AlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);
    
     
     Toast.makeText(getApplicationContext(), "alun onCreate()",Toast.LENGTH_SHORT).show();

}

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(),"alun onStart()", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume(){

        super.onResume();
        Toast.makeText(getApplicationContext(),"alun onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(),"alun onStop()", Toast.LENGTH_SHORT).show(); }


    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(),"alun onRestart()", Toast.LENGTH_SHORT).show(); }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(),"alun onPause()", Toast.LENGTH_SHORT).show(); }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"alun onDestroy()", Toast.LENGTH_SHORT).show(); }
}
