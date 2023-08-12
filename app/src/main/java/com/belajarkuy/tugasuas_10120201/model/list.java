//10120201 - Ilham Ramdhan Putra Lesmana - IF5
package com.belajarkuy.tugasuas_10120201.model;

import java.io.Serializable;

public class list implements Serializable {

    String id;
    String judul;
    String kategori;
    String catatan;

    String tanggal;

    public list(String id, String judul, String kategori, String catatan, String tanggal){
        this.id = id;
        this.judul = judul;
        this.kategori = kategori;
        this.catatan = catatan;
        this.tanggal = tanggal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String title) {
        this.judul = judul;
    }


    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
