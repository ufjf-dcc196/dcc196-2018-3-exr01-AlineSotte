package br.ufjf.dcc196.exercicio;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ExternoActivity extends AppCompatActivity {

    private EditText edtnomeexter, edtemailext;
    private Button butokext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_externo);

        edtnomeexter = (EditText) findViewById(R.id.editnomeexterno);
        edtemailext = (EditText) findViewById(R.id.editemailexterno);
        butokext = (Button) findViewById(R.id.btnOkexterno);

        butokext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_externo = new Intent();

                intent_externo.putExtra(MainActivity.EXTERNO_NOME, edtnomeexter.getText().toString());
                intent_externo.putExtra(MainActivity.EXTERNO_EMAIL, edtemailext.getText().toString());
                setResult(Activity.RESULT_OK, intent_externo);
                finish();
            }
        });
    }}
