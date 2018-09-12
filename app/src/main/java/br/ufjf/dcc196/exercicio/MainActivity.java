package br.ufjf.dcc196.exercicio;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String ALUNO_NOME ="nome";
    public static  final String ALUNO_MATRICULA= "matricula";
    public static final String SERVIDOR_NOME ="nome";
    public static  final String SERVIDOR_SIAP= "siap";
    public static final String EXTERNO_NOME ="nome";
    public static  final String EXTERNO_EMAIL= "email";
    private Button btn_externo;
    private Button btn_servidor;
    private Button btn_aluno;
    private TextView edtnome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_servidor = (Button)findViewById(R.id.btnservidor);
        btn_servidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, ServidorActivity.class);
               startActivity(intent);
            }
        });

        btn_aluno = (Button)findViewById(R.id.btnaluno);
        btn_aluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AlunoActivity.class);
                startActivity(intent);
            }
        });

        btn_externo=(Button)findViewById(R.id.btnexterno);
        btn_externo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ExternoActivity.class);
                startActivity(intent);
            }
        });
    }

}











