//subclass ditambah di payment
//method overloading pada subclass ditambah di payment
//nomor 3 sudah dibuat di class payment
//validasi data ditambah di stock bagian Item atau di barang
package model;

import java.util.ArrayList;


public class receiving {
    String kode_receiving;
    String supplier;
    String tanggal;
    String pembayaran;
    String penerima;
    String kondisi;
    String kualitas;
    String bentuk;

    public receiving(String kode_receiving, String supplier, String tanggal, String pembayaran, String penerima) {
        this.kode_receiving = kode_receiving;
        this.supplier = supplier;
        this.tanggal = tanggal;
        this.pembayaran = pembayaran;
        this.penerima = penerima;
        this.kondisi = kondisi;
        this.kualitas = kualitas;
        this.bentuk = bentuk;
    }

    public String getKode_receiving() {
        return kode_receiving;
    }

    public void setKode_receiving(String kode_receiving) {
        this.kode_receiving = kode_receiving;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    public String getPenerima() {
        return penerima;
    }

    public void setPenerima(String penerima) {
        this.penerima = penerima;
    }
    public String getkondisi() {
        return kondisi;
    }

    public void setkondisi(String kondisi) {
        this.kondisi = kondisi;
    }
    public String getkualitas() {
        return kualitas;
    }

    public void setkualitas(String kualitas) {
        this.kualitas = kualitas;
    }
    public String getbentuk() {
        return bentuk;
    }

    public void setbentuk(String bentuk) {
        this.bentuk = bentuk;
    }
    public void cetakBuktiTerimaBarang(){
        
    }
    public void tampilkanDetailTerimaBarang(){
        
    }
    public void cetakBuktiTerimaBarangBerdasarkanHargaDesc(){
        
    }
}
