package javaapplication4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antonsumartono
 */
public class Supplier {
    String kode_supplier;
    String nama;
    String alamat;
    String no_tlp;

    public Supplier(String kode_supplier, String nama, String alamat, String no_tlp) {
        this.kode_supplier = kode_supplier;
        this.nama = nama;
        this.alamat = alamat;
        this.no_tlp = no_tlp;
    }

    public String getKode_supplier() {
        return kode_supplier;
    }

    public void setKode_supplier(String kode_supplier) {
        this.kode_supplier = kode_supplier;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_tlp() {
        return no_tlp;
    }

    public void setNo_tlp(String no_tlp) {
        this.no_tlp = no_tlp;
    }
    
}
