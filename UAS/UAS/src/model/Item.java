//subclass ditambah di payment
//method overloading pada subclass ditambah di payment
//nomor 3 sudah dibuat di class payment
//validasi data ditambah di stock bagian Item atau di barang
package model;

import java.util.ArrayList;

import javax.swing.InputMap;
import javax.swing.UIDefaults.LazyValue;

public class Item {
    private String kodeItem;
    private String namaItem;
    private String Kategori;
    private int stock;
    private String expired;
    private String layakpake;

    public Item(String kodeItem, String namaItem, String Kategori, int stock, String expired, String layakpake) {
        this.kodeItem = kodeItem;
        this.namaItem = namaItem;
        this.Kategori = Kategori;
        this.stock = stock;
        this.expired = expired;
        this.layakpake = layakpake;
    }

    public String getKodeItem() {
        return this.kodeItem;
    }

    public void setKodeItem(String kodeItem) {
        this.kodeItem = kodeItem;
    }

    public String getNamaItem() {
        return this.namaItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }

    public String getKategori() {
        return this.Kategori;
    }

    public void setKategori(String Kategori) {
        this.Kategori = Kategori;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public String getexpired() {
        return this.expired;
    }

    public void setexpired(String expired) {
        this.expired = expired;
    }
    public String getlayakpake() {
        return this.layakpake;
    }

    public void setlayakpake(String layakpake) {
        this.layakpake = layakpake;
    }
    @Override
    public String toString() {
        return "\n" +
            "Kode Item\t= " + getKodeItem() + "\n" +
            "Nama Item\t= " + getNamaItem() + "\n" +
            "Kategori\t= " + getKategori() + "\n" +
            "Stock\t\t= " + getStock()+"\n"+
            "Expired\t\t= "+ getexpired()+"\n"+
            "Layak pakai\t= "+ getlayakpake();
    }

    public static InputMap get(int i) {
        return null;
    }

    public char charAt(int i) {
        return 0;
    }

}
