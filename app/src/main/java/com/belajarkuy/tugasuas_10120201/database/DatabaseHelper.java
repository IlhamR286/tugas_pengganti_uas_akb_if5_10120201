//10120201 - Ilham Ramdhan Putra Lesmana - IF5

package com.belajarkuy.tugasuas_10120201.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.belajarkuy.tugasuas_10120201.ListInterface;
import com.belajarkuy.tugasuas_10120201.model.list;

public class DatabaseHelper extends SQLiteOpenHelper implements ListInterface {

    public DatabaseHelper(@Nullable Context context) {
        super(context, "db_tulis", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE tabel_tulis (id TEXT, judul TEXT, kategori TEXT, catatan TEXT, date TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE tabel_tulis");
    }

    public Cursor read(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        return sqLiteDatabase.rawQuery("SELECT * FROM tabel_tulis", null);
    }

    public boolean create (list list){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.execSQL("INSERT INTO tabel_tulis VALUES ('"+list.getId()+"','"+list.getJudul()+"','"+list.getKategori()+"' ,'"+list.getCatatan()+"','"+list.getTanggal()+"')");
        return true;
    }

    public boolean update (list list){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.execSQL("UPDATE tabel_tulis SET title='"+list.getJudul()+"', kategori='"+list.getKategori()+"', kategori='"+list.getCatatan()+"', date='"+list.getTanggal()+"' WHERE id='"+list.getId()+"'");
        return true;
    }

    public boolean delete(String id){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.execSQL("DELETE FROM tabel_tulis WHERE id='"+id+"'");
        return true;
    }

}
