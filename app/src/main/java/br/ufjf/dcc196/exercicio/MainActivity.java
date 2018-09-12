package br.ufjf.dcc196.exercicio;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


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

    private EditText texmens;
    private EditText texalun;
    private EditText texserv;
    private EditText texextr;

    private int contaluno, contservidor, contexterno;

    private static final int REQUEST_ALUNO=1;
    private static final int REQUEST_SERVIDOR=2;
    private static final int REQUEST_EXTERNO=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texmens=(EditText)findViewById(R.id.textmensagem);
        texserv=(EditText)findViewById(R.id.textservidor);
        texalun=(EditText)findViewById(R.id.textaluno);
        texextr=(EditText)findViewById(R.id.textexterno);

        btn_servidor = (Button)findViewById(R.id.btnservidor);
        btn_servidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent1 = new Intent(MainActivity.this, ServidorActivity.class);
               startActivityForResult(intent1,REQUEST_SERVIDOR);
            }
        });

        btn_aluno = (Button)findViewById(R.id.btnaluno);
        btn_aluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, AlunoActivity.class);
                startActivityForResult(intent2,REQUEST_ALUNO);

            }
        });

        btn_externo=(Button)findViewById(R.id.btnexterno);
        btn_externo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, ExternoActivity.class);
                startActivityForResult(intent3,REQUEST_EXTERNO);

            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==MainActivity.REQUEST_SERVIDOR
                && resultCode== Activity.RESULT_OK && data != null){
            Bundle bundleResultado=data.getExtras();
            String nomeservidorr=bundleResultado.getString(MainActivity.SERVIDOR_NOME);
            String siapservidorr=bundleResultado.getString(MainActivity.SERVIDOR_SIAP);
            texmens.setText("Nome :"+nomeservidorr +"SIAP:"+siapservidorr);
            contservidor++;
            texalun.setText("Servidor"+contservidor);
        }

        else if(requestCode==MainActivity.REQUEST_ALUNO
                && resultCode== Activity.RESULT_OK && data != null){
            Bundle bundleResultado=data.getExtras();
            String nomealluno=bundleResultado.getString(MainActivity.ALUNO_NOME);
            String matriculaalluno=bundleResultado.getString(MainActivity.ALUNO_MATRICULA);
            texmens.setText("Nome:"+ nomealluno +"matricula:"+ matriculaalluno);
            contaluno++;
            texserv.setText("aluno=" + contaluno);

        }

       else if(requestCode==MainActivity.REQUEST_EXTERNO
                && resultCode== Activity.RESULT_OK && data != null){
            Bundle bundleResultado=data.getExtras();
            String nomeexternoo=bundleResultado.getString(MainActivity.EXTERNO_NOME);
            String emailexternoo=bundleResultado.getString(MainActivity.EXTERNO_EMAIL);
            texmens.setText("Nome:"+ nomeexternoo +"email:"+ emailexternoo);
            contexterno++;
            texextr.setText("Externo:" + contexterno);

        }

    }
}











