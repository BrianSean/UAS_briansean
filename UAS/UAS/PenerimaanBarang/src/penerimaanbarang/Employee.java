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
public class Employee {
    String kode_pegawai;
    String nama_pegawai;
    String alamat;

    public Employee(String kode_pegawai, String nama_pegawai, String alamat) {
        this.kode_pegawai = kode_pegawai;
        this.nama_pegawai = nama_pegawai;
        this.alamat = alamat;
    }

    public String getKode_pegawai() {
        return kode_pegawai;
    }

    public void setKode_pegawai(String kode_pegawai) {
        this.kode_pegawai = kode_pegawai;
    }

    public String getNama_pegawai() {
        return nama_pegawai;
    }

    public void setNama_pegawai(String nama_pegawai) {
        this.nama_pegawai = nama_pegawai;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getHistoryPenerimaan() {
        return alamat;
    }
}
