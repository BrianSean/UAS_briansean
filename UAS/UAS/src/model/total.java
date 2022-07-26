//subclass ditambah di payment
//method overloading pada subclass ditambah di payment
//nomor 3 sudah dibuat di class payment
//validasi data ditambah di stock bagian Item atau di barang
package model;

import java.util.ArrayList;

public class total {
    private String totalpenghasilan;
    private String berapaunitterjual;
    private String sudahberapaterkirim;

    public total(){
    }
    public total( String totalpenghasilan, String berapunitterjual, String sudahberapaterkirim){
        this.totalpenghasilan = totalpenghasilan;
        this.berapaunitterjual = berapaunitterjual;
        this.sudahberapaterkirim = sudahberapaterkirim;
    }

        public String gettotalpenghasilan() {
            return this.totalpenghasilan;
        }
    
        public void settotalpenghasilan(String totalpenghasilan) {
            this.totalpenghasilan = totalpenghasilan;
        }

        public String getberapaunitterjual() {
            return this.berapaunitterjual;
        }
    
        public void setberapaunitterjual(String berapaunitterjual) {
            this.berapaunitterjual = berapaunitterjual;
        }

        public String getsudahberapaterkirim() {
            return this.sudahberapaterkirim;
        }
    
        public void setsudahberapaterkirim(String sudahberapaterkirim) {
            this.sudahberapaterkirim = sudahberapaterkirim;
        }
        @Override
        public String toString() {
            return "\n" +
                "total penghasilan\t = " + gettotalpenghasilan() + "\n" +
                "sudah terjual berapa unit\t\t = " + getberapaunitterjual() + "\n" +
                "berapa banyak barang yang terkirim\t\t = " + getsudahberapaterkirim();
        }
    
}
