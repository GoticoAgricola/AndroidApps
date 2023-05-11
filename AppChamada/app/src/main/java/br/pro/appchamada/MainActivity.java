package br.pro.appchamada;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnAdicionar;
    private ListView lvAlunos;
    private List<Aluno> listAlunos;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAlunos = findViewById(R.id.lvAlunos);
        btnAdicionar = findViewById( R.id.btnAdd );

        lvAlunos.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l) {
                deletar( position );
                return true;
            }
        });

        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,
                        FormularioActivity.class);
                i.putExtra("acao", "inserir" );
                startActivity( i );
            }
        });

    }


    @Override
    protected void onStart() {
        super.onStart();
        carregarAlunos();
    }

    private void carregarAlunos(){
        listAlunos = AlunoDAO.getAlunos(this);

        if( listAlunos.isEmpty() ){
            lvAlunos.setEnabled(false);
            String[] listaVazia = {"Lista Vazia!"};
            adapter = new  ArrayAdapter(this, android.R.layout.simple_list_item_1, listaVazia);
        }else {
            lvAlunos.setEnabled(true);
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listAlunos);
        }
        lvAlunos.setAdapter( adapter );
    }


    private void deletar(int posicao){
        Aluno aluno = listAlunos.get( posicao );
        AlertDialog.Builder alerta = new AlertDialog.Builder(this);
        alerta.setTitle("Excluir");
        alerta.setIcon(android.R.drawable.ic_dialog_alert);
        alerta.setMessage("Confirma a exclusão de " + aluno.getNome()+"? ");
        alerta.setNeutralButton("Não", null);
        alerta.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                AlunoDAO.excluir(MainActivity.this, aluno.getId() );
                carregarAlunos();
            }
        });
        alerta.show();

    }



}















