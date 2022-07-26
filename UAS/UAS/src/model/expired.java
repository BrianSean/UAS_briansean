//subclass ditambah di payment
//method overloading pada subclass ditambah di payment
//nomor 3 sudah dibuat di class payment
//validasi data ditambah di stock bagian Item atau di barang
package model;

import java.util.ArrayList;

public class expired {
    private String barangyangexpired;
    private String apakahmasihbisadipakai;

    public expired() {
    }

    public void expired(String barangyangexpired, String apakahmasihbisadipakai){
        this.apakahmasihbisadipakai = apakahmasihbisadipakai;
        this.barangyangexpired = barangyangexpired;
    }
    public String getbarangyangexpired() {
        return this.barangyangexpired;
    }

    public void setbarangyangexpired(String barangyangexpired) {
        this.barangyangexpired = barangyangexpired;
    }

    public String getapakahmasihbisadipakai() {
        return this.apakahmasihbisadipakai;
    }

    public void setapakahmasihbisadipakai(String apakahmasihbisadipakai) {
        this.apakahmasihbisadipakai = apakahmasihbisadipakai;
    }
    @Override
    public String toString() {
        return "\n" +
            "Kode Pembayaran\t= " + getbarangyangexpired() + "\n" +
            "Harga\t\t= " + getapakahmasihbisadipakai();
}
}


