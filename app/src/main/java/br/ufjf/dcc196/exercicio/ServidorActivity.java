package br.ufjf.dcc196.exercicio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ServidorActivity extends AppCompatActivity {

    TextView txt_mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servidor);

        Toast.makeText(getApplicationContext(),"Serv onCreate()", Toast.LENGTH_SHORT).show();

        txt_mensagem=findViewById(R.id.txt_serv_mensagem);
        Bundle bundleExtras=getIntent().getExtras();
        if(bundleExtras!=null){

            String nome=bundleExtras.getString("nome");
            txt_mensagem.setText("Olá Servidor" +nome+"!");
        }
    }
}
