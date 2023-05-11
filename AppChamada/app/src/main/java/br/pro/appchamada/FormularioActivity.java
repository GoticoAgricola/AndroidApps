package br.pro.appchamada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {

    private EditText etNome, etRA;
    private Button btnSalvar;
    private Aluno aluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        etNome = findViewById(R.id.etNome);
        etRA = findViewById(R.id.etRA);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salvar();
            }
        });

    }

    private void salvar(){

        String nome = etNome.getText().toString();
        if ( nome.isEmpty() ){
            Toast.makeText(this,
                    "O campo nome deve ser preenchido!" ,
                    Toast.LENGTH_LONG
                    ).show();
        }else {
            aluno = new Aluno();
            aluno.setNome( nome );
            aluno.setRa( etRA.getText().toString() );
            AlunoDAO.inserir(this, aluno);
            etNome.setText( "" );
            etRA.setText( "" );
            aluno = null;
        }
    }

}










