package br.ufjf.dcc196.exercicio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_externo;
    private Button btn_seridor;
    private Button btn_aluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_aluno=findViewById(R.id.btnaluno);
        btn_externo=findViewById(R.id.btnexterno);
        btn_seridor=findViewById(R.id.btnservidor);

    }
}
