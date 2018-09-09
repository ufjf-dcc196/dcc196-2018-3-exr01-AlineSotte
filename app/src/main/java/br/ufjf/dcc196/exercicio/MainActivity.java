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
        setContentView(R.layout.activity_main);}

        public void CarregarTelaServidor(){
            setContentView(R.layout.activity_servidor);
            btn_seridor=(Button)findViewById(R.id.btnservidor);
            btn_seridor.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CarregarTelaServ();
                }
            });

        }

        public void  CarregarTelaServ(){

        Intent intent =new Intent(MainActivity.this, ServidorActivity.class );
        startActivity(intent);
        finish();
        }

//        btn_aluno=findViewById(R.id.btnaluno);
//        btn_externo=findViewById(R.id.btnexterno);





    }

