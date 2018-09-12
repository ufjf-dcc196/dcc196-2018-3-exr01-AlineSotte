package br.ufjf.dcc196.exercicio;

import android.app.ActionBar;
import android.app.Activity;
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

    private TextView texmens;
    private TextView texalun;
    private TextView texserv;
    private TextView texextr;

    private int contaluno, contservidor, contexterno;

    private static final int REQUEST_ALUNO=2;
    private static final int REQUEST_SERVIDOR=1;
    private static final int REQUEST_EXTERNO=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texmens=(TextView)findViewById(R.id.textmensagem);
        texalun=(TextView)findViewById(R.id.textservidor);
        texextr=(TextView)findViewById(R.id.textaluno);
        texserv=(TextView)findViewById(R.id.textexterno);

        btn_servidor = (Button)findViewById(R.id.btnservidor);
        btn_servidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, ServidorActivity.class);
               startActivityForResult(intent,MainActivity.REQUEST_SERVIDOR);
            }
        });

        btn_aluno = (Button)findViewById(R.id.btnaluno);
        btn_aluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AlunoActivity.class);
                startActivityForResult(intent,MainActivity.REQUEST_ALUNO);
            }
        });

        btn_externo=(Button)findViewById(R.id.btnexterno);
        btn_externo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ExternoActivity.class);
                startActivityForResult(intent, MainActivity.REQUEST_EXTERNO);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==MainActivity.REQUEST_ALUNO
                && resultCode== Activity.RESULT_OK && data != null){
            Bundle bundleResultado=data.getExtras();
            String nomeservidorr=bundleResultado.getString(MainActivity.SERVIDOR_NOME);
            String siapservidorr=bundleResultado.getString(MainActivity.SERVIDOR_SIAP);
            texmens.setText("Nome Servidor:"+nomeservidorr +"SIAP:"+siapservidorr);
            contservidor++;
            texalun.setText("Servido"+contservidor);
        }

        else if(requestCode==MainActivity.REQUEST_ALUNO
                && resultCode== Activity.RESULT_OK && data != null){
            Bundle bundleResultado=data.getExtras();
            String nomealluno=bundleResultado.getString(MainActivity.ALUNO_NOME);
            String matriculaalluno=bundleResultado.getString(MainActivity.ALUNO_MATRICULA);
            texmens.setText("Nome Servidor:"+ nomealluno +"matricula:"+ matriculaalluno);
            contaluno++;
            texserv.setText("aluno=" + contaluno);

        }

       else if(requestCode==MainActivity.REQUEST_ALUNO
                && resultCode== Activity.RESULT_OK && data != null){
            Bundle bundleResultado=data.getExtras();
            String nomeexternoo=bundleResultado.getString(MainActivity.EXTERNO_NOME);
            String emailexternoo=bundleResultado.getString(MainActivity.EXTERNO_EMAIL);
            texmens.setText("Nome Servidor:"+ nomeexternoo +"matricula:"+ emailexternoo);
            contexterno++;
            texextr.setText("Externo:" + contexterno);

        }

    }
}











