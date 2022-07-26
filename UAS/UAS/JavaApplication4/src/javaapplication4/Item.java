/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

public class Item {

    String kode_item;
    String nama_item;
    String kategori;
    int stok;

    public Item(String kode_item, String nama_item, String kategori, int stok) {
        this.kode_item = kode_item;
        this.nama_item = nama_item;
        this.kategori = kategori;
        this.stok = stok;
    }

    public String getKode_item() {
        return kode_item;
    }

    public void setKode_item(String kode_item) {
        this.kode_item = kode_item;
    }

    public String getNama_item() {
        return nama_item;
    }

    public void setNama_item(String nama_item) {
        this.nama_item = nama_item;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
