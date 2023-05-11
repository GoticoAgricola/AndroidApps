package br.pro.appchamada;

import android.content.ContentValues;
import android.content.Context;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    public static void inserir(Context context, Aluno aluno){
        Conexao conn = new Conexao(context);
        SQLiteDatabase db = conn.getWritableDatabase();
//        db.execSQL("INSERT INTO aluno ( nome, ra) VALUES (" +
//                    " '"+aluno.getNome()+"'  ," +
//                    " '"+aluno.getRa()+"' )");

        ContentValues valores = new ContentValues();
        valores.put("nome", aluno.getNome() );
        valores.put("ra", aluno.getRa() );

        db.insert("alunos", null, valores);
    }

    public static void editar(Context context, Aluno aluno){
        Conexao conn = new Conexao(context);
        SQLiteDatabase db = conn.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put("nome", aluno.getNome() );
        valores.put("ra", aluno.getRa() );

        db.update("alunos", valores ,
          " id = " + aluno.getId(), null  );
    }

    public static void excluir(Context context, int idAluno){
        SQLiteDatabase db = new Conexao(context).getWritableDatabase();

        db.delete("alunos",
          " id = " + idAluno, null  );
    }

    public static List<Aluno> getAlunos(Context context){
        Conexao conn = new Conexao(context);
        SQLiteDatabase db = conn.getReadableDatabase();
        List<Aluno> lista = new ArrayList<>();

        Cursor cursor = db.rawQuery("SELECT id, nome, ra FROM alunos ORDER BY nome",
                null);
        if( cursor != null && cursor.getCount() > 0 ){
            cursor.moveToFirst();
             do{
                 Aluno aluno = new Aluno();
                 aluno.setId( cursor.getInt( 0 )  );
                 aluno.setNome( cursor.getString( 1 )  );
                 aluno.setRa( cursor.getString( 2 )  );
                 lista.add( aluno );
             }while ( cursor.moveToNext() );
        }
        return lista;
    }

    public static Aluno getAlunoById(Context context, int idAluno){
        SQLiteDatabase db = new Conexao(context).getReadableDatabase();
        Aluno aluno = null;
        Cursor cursor = db.rawQuery("SELECT id, nome, ra FROM alunos " +
                " WHERE id = " + idAluno, null);
        if( cursor != null && cursor.getCount() > 0 ){
            cursor.moveToFirst();
                aluno = new Aluno();
                aluno.setId( cursor.getInt( 0 )  );
                aluno.setNome( cursor.getString( 1 )  );
                aluno.setRa( cursor.getString( 2 )  );
        }
        return aluno;
    }

}








