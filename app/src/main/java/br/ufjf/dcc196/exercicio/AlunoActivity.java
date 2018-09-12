package br.ufjf.dcc196.exercicio;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AlunoActivity extends AppCompatActivity {

    private EditText edtnomeal, edtemailal;
    private Button butok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);

        edtnomeal=(EditText)findViewById(R.id.editnomealuno);
        edtemailal=(EditText)findViewById(R.id.editmatriculoaluno);
        butok=(Button)findViewById(R.id.btnaluno);

        butok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();

                intent.putExtra(MainActivity.ALUNO_NOME, edtnomeal.getText().toString());
                intent.putExtra(MainActivity.ALUNO_MATRICULA, edtemailal.getText().toString());
                setResult(Activity.RESULT_OK, intent);
                finish();
                }
        });
}


}
