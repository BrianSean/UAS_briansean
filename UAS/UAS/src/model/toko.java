//subclass ditambah di payment
//method overloading pada subclass ditambah di payment
//nomor 3 sudah dibuat di class payment
//validasi data ditambah di stock bagian Item atau di barang
package model;

public class toko {
    private String tokopengirim;
    private String tokopenerima;
    private String barangapayangdikirim;
    
    
    public toko(){
    }
    public toko(String tokopengirim, String tokopenerima, String barangapayangdikirim){
        this.tokopengirim = tokopengirim;
        this.tokopenerima = tokopenerima;
        this.barangapayangdikirim = barangapayangdikirim;
    }

    public String gettokopengirim() {
        return this.tokopengirim ;
    }

    public void settokopengirim (String tokopengirim ) {
        this.tokopengirim = tokopengirim ;
    }
    public String gettokopenerima() {
        return this.tokopenerima;
    }

    public void settokopenerima (String tokopenerima ) {
        this.tokopenerima  = tokopenerima  ;
    }
    public String getbarangapayangdikirim() {
        return this.barangapayangdikirim;
    }

    public void setbarangapayangdikirim (String barangapayangdikirim) {
        this.barangapayangdikirim  = barangapayangdikirim  ;
    }

    

    @Override
    public String toString() {
        return "\n" +
            "nama toko pengririm\t = " + gettokopengirim() + "\n" +
            "nama toko penerima\t\t = " + gettokopenerima() + "\n" +
            "barang apa yang dikirim\t\t = " +getbarangapayangdikirim();
    }
            
    }

