//subclass ditambah di payment
//method overloading pada subclass ditambah di payment
//nomor 3 sudah dibuat di class payment
//validasi data ditambah di stock bagian Item atau di barang
package model;

import java.util.ArrayList;

public class Supplier {
    private String kodeSupplier;
    private String nama;
    private String asal;
    private String namaperusahaan;


    public Supplier() {
    }

    public Supplier(String kodeSupplier, String nama, String asal, String namaperusahaan) {
        this.kodeSupplier = kodeSupplier;
        this.nama = nama;
        this.asal = asal;
        this.namaperusahaan = namaperusahaan;
    }

    public String getKodeSupplier() {
        return this.kodeSupplier;
    }

    public void setKodeSupplier(String kodeSupplier) {
        this.kodeSupplier = kodeSupplier;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getasal() {
        return this.asal;
    }

    public void setasal(String asal) {
        this.asal = asal;
    }

    public String getnamaperusahaan() {
        return this.namaperusahaan;
    }

    public void setnamaperusahaan(String namaperusahaan) {
        this.namaperusahaan = namaperusahaan;
    }
    @Override
    public String toString() {
        return "\n" +
            "Kode Supplier\t = " + getKodeSupplier() + "\n" +
            "Nama pemilik\t\t = " + getNama() + "\n" +
            "asal\t\t = " + getasal() + "\n" +
            "nama perusahaan\t\t = " + getnamaperusahaan();
    }
}