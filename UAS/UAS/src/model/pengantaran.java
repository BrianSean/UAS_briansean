//subclass ditambah di payment
//method overloading pada subclass ditambah di payment
//nomor 3 sudah dibuat di class payment
//validasi data ditambah di stock bagian Item atau di barang
package model;

import java.util.ArrayList;

public class pengantaran {
    private String pengantaranjamberapa;
    private String siapapengirim;
    private String jamberapasampai;

    public pengantaran(){
    }
    public pengantaran(String pengantaranjamberapa, String siapapengirim, String jamberapasampai){
        this.pengantaranjamberapa = pengantaranjamberapa;
        this.siapapengirim = siapapengirim;
        this.jamberapasampai = jamberapasampai;
    }
    public String getpengantaranjamberapa() {
        return this.pengantaranjamberapa;
    }

    public void setpengantaranjamberapa(String pengantaranjamberapa) {
        this.pengantaranjamberapa = pengantaranjamberapa;
    }
    public String getsiapapengirim() {
        return this.siapapengirim;
    }

    public void setsiapapengirim(String siapapengirim) {
        this.siapapengirim = siapapengirim;
    }
    public String getjamberapasampai() {
        return this.jamberapasampai;
    }

    public void setjamberapasampai(String jamberapasampai) {
        this.jamberapasampai = jamberapasampai;
    } 
    @Override
    public String toString() {
        return "\n" +
            "Jam berapa diantar\t = " + getpengantaranjamberapa() + "\n" +
            "Nama Pengirim\t\t = " + getsiapapengirim() + "\n" +
            "Sampai tujuan jam berapa\t\t = " + getjamberapasampai();
    }

}
