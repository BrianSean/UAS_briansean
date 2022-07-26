package model;

public class barang {
    private String namabarang;
    private int stok;
    
    
    
    public barang(){
    }
    public barang(String namabarang, int stok){
        this.namabarang = namabarang;
        this.stok = stok;
    }

    public String getnamabarang() {
        return this.namabarang ;
    }

    public void setnamabarang (String namabarang ) {
        this.namabarang = namabarang ;
    }
    public int getstok() {
        return this.stok;
    }

    public void setstok(int stok) {
        this.stok = stok  ;
    }
    @Override
    public String toString() {
        return "\n"  + getnamabarang() + "\n" + getstok() + "\n";
    }
}