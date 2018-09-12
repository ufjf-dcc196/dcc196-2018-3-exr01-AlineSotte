package br.ufjf.dcc196.exercicio;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ServidorActivity extends AppCompatActivity {
    private EditText edtnomeserv, edtsiapserv;
    private Button butokserv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servidor);

        edtnomeserv = (EditText) findViewById(R.id.editnameservidor);
        edtsiapserv = (EditText) findViewById(R.id.editsiapservidor);
        butokserv = (Button) findViewById(R.id.btnservidor);

        butokserv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_servidor = new Intent();

                intent_servidor.putExtra(MainActivity.SERVIDOR_NOME, edtnomeserv.getText().toString());
                intent_servidor.putExtra(MainActivity.SERVIDOR_SIAP, edtsiapserv.getText().toString());
                setResult(Activity.RESULT_OK, intent_servidor);
                finish();
            }
        });
    }}
