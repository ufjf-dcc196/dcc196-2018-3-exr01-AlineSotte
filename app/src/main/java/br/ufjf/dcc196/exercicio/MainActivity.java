package br.ufjf.dcc196.exercicio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_externo;
    private Button btn_seridor;
    private Button btn_aluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_seridor = (Button) findViewById(R.id.btnservidor);
        btn_aluno = (Button) findViewById(R.id.btnaluno);
        btn_externo = (Button) findViewById(R.id.btnexterno);

        btn_seridor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_servidor);
            }
        });


        btn_aluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_aluno);
            }
        });


        btn_externo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_externo);
            }
        });
    }
}












