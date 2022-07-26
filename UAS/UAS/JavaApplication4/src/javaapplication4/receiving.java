/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author antonsumartono
 */
public class receiving {
    String kode_receiving;
    String supplier;
    String tanggal;
    String pembayaran;
    String penerima;

    public receiving(String kode_receiving, String supplier, String tanggal, String pembayaran, String penerima) {
        this.kode_receiving = kode_receiving;
        this.supplier = supplier;
        this.tanggal = tanggal;
        this.pembayaran = pembayaran;
        this.penerima = penerima;
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
    public void cetakBuktiTerimaBarang(){
        
    }
    public void tampilkanDetailTerimaBarang(){
        
    }
    public void cetakBuktiTerimaBarangBerdasarkanHargaDesc(){
        
    }
}
