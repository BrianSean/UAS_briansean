/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penerimaanbarang;

/**
 *
 * @author antonsumartono
 */
public class receiving_item {
    String kode_receiving_item;
    String barang ;
    int kuantiti_terima;
    int harga_satuan;
    int total;

    public receiving_item(String kode_receiving_item, String barang, int kuantiti_terima, int harga_satuan, int total) {
        this.kode_receiving_item = kode_receiving_item;
        this.barang = barang;
        this.kuantiti_terima = kuantiti_terima;
        this.harga_satuan = harga_satuan;
        this.total = total;
    }

    public String getKode_receiving_item() {
        return kode_receiving_item;
    }

    public void setKode_receiving_item(String kode_receiving_item) {
        this.kode_receiving_item = kode_receiving_item;
    }

    public String getBarang() {
        return barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    public int getKuantiti_terima() {
        return kuantiti_terima;
    }

    public void setKuantiti_terima(int kuantiti_terima) {
        this.kuantiti_terima = kuantiti_terima;
    }

    public int getHarga_satuan() {
        return harga_satuan;
    }

    public void setHarga_satuan(int harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public int getDetailItem() {
        return total;
    }
    
    public void updateStok(){
        
    }
}
