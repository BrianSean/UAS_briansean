package model;

//subclass ditambah di payment
//method overloading pada subclass ditambah di payment
//nomor 3 sudah dibuat di class payment
//validasi data ditambah di stock bagian Item atau di barangpackage model;

import java.util.ArrayList;


public class Employee 
{
    private String kodePegawai, namaPegawai;
    private String department;


    public Employee() {
    }

    public Employee(String kodePegawai, String namaPegawai, String department) {
        this.kodePegawai = kodePegawai;
        this.namaPegawai = namaPegawai;
        this.department = department;
    }

    public String getKodePegawai() {
        return this.kodePegawai;
    }

    public void setKodePegawai(String kodePegawai) {
        this.kodePegawai = kodePegawai;
    }

    public String getNamaPegawai() {
        return this.namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getdepartment() {
        return this.department;
    }

    public void setdepartment(String department) {
        this.department = department;
    }
    public void cetakDataPegawi ()
    {
        
    }
    @Override
    public String toString() {
        return "\n" +
            " Kode Pegawai\t= " + getKodePegawai() +"\n" +
            " Nama Pegawai\t= " + getNamaPegawai() +"\n" +
            " department\t=" + getdepartment();
    }
    

}
