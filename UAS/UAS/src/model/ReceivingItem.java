//subclass ditambah di payment
//method overloading pada subclass ditambah di payment
//nomor 3 sudah dibuat di class payment
//validasi data ditambah di stock bagian Item atau di barang
package model;

import java.util.ArrayList;

public class ReceivingItem 
{
    private String kodeReceiving;
    private String kuantitiTerima;
    private String hargaSatuan;
    private String total;
    private String jenisbarang;
    private String waktuterima;
    private String asaltoko;
    private String namapengirim;

    public ReceivingItem() {
    }

    public ReceivingItem(String kodeReceiving, String kuantitiTerima, String hargaSatuan, String total, String jenisbarang, String waktuterima, String asaltoko, String namapengirim) {
        this.kodeReceiving = kodeReceiving;
        this.kuantitiTerima = kuantitiTerima;
        this.hargaSatuan = hargaSatuan;
        this.total = total;
        this.jenisbarang = jenisbarang;
        this.waktuterima = waktuterima;
        this.asaltoko = asaltoko;
        this.namapengirim = namapengirim;
    }

    public String getKodeReceiving() {
        return this.kodeReceiving;
    }

    public void setKodeReceiving(String kodeReceiving) {
        this.kodeReceiving = kodeReceiving;
    }

    public String getKuantitiTerima() {
        return this.kuantitiTerima;
    }

    public void setKuantitiTerima(String kuantitiTerima) {
        this.kuantitiTerima = kuantitiTerima;
    }

    public String getHargaSatuan() {
        return this.hargaSatuan;
    }

    public void setHargaSatuan(String hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public String getTotal() {
        return this.total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    public String getjenisbarang() {
        return this.jenisbarang;
    }

    public void setjenisbarang(String jenisbarang) {
        this.jenisbarang = jenisbarang;
    }
    public String getwaktuterima() {
        return this.waktuterima;
    }

    public void setwaktuterima(String waktuterima) {
        this.waktuterima = waktuterima;
    }
    public String getasaltoko() {
        return this.asaltoko;
    }

    public void setasaltoko(String asaltoko) {
        this.asaltoko = asaltoko;
    }
    public String getnamapengirim() {
        return this.namapengirim;
    }

    public void setnamapengirim(String namapengirim) {
        this.namapengirim = namapengirim;
    }

     @Override
    public String toString() {
        return "\n" +
            "Kode Receiving\t= " + getKodeReceiving() + "\n" +
            "Kuantiti Terima\t= " + getKuantitiTerima() + "\n" +
            "Harga Satuan\t= " + getHargaSatuan() + "\n" +
            "Jenis Barang\t=" + getjenisbarang() + "\n"+
            "Waktu barang diterima\t=" + getwaktuterima() + "\n"+
            "Asal toko\t=" + getasaltoko() + "\n"+
            "Nama pengirim\t=" + getnamapengirim() + "\n"+
            "Total\t\t= " + getTotal();
    }
    
}