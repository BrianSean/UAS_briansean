//subclass ditambah di payment
//method overloading pada subclass ditambah di payment
//nomor 3 sudah dibuat di class payment
//validasi data ditambah di stock bagian Item atau di barang
package model;

import java.util.ArrayList;

public class pembelian {
    private String barangyangdibeli;
    private String harga;

    public pembelian(){
    }

    public pembelian(String barangyangdibeli, String harga) {
        this.barangyangdibeli = barangyangdibeli;
        this.harga = harga;
    }
    
    public String getbarangyangdibeli() {
        return this.barangyangdibeli;
    }

    public void setbarangyangdibeli(String barangyangdibeli) {
        this.barangyangdibeli = barangyangdibeli;
    }

    public String getharga() {
        return this.harga;
    }

    public void setharga(String harga) {
        this.harga = harga;
    }
    @Override
    public String toString() {
        return "\n" +
            "Kode Pembayaran\t= " + getbarangyangdibeli() + "\n" +
            "Harga\t\t= " + getharga();
    }

    public static void add(pembelian pembelian) {
    }
}
