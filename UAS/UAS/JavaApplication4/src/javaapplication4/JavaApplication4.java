/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP PAVILION GAMING
 */
public class JavaApplication4 {

    private final static ArrayList<Employee> employee = new ArrayList<>();
    private final static ArrayList<Supplier> suppliers = new ArrayList<>();
    private final static ArrayList<Item> items = new ArrayList<>();
    private final static ArrayList<receiving> receivings = new ArrayList<>();
    private final static ArrayList<receiving_item> receivingItems = new ArrayList<>();

    private static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n\n============");
            System.out.println("1. Masukan Employee");
            System.out.println("2. Tampilkan Employee");
            System.out.println("3. Masukan Supplier");
            System.out.println("4. Tampilkan Supplier");
            System.out.println("5. Masukan Item");
            System.out.println("6. Tampilkan Item");
            System.out.println("7. Masukan Penerima");
            System.out.println("8. Tampilkan Penerima");
            System.out.println("9. Masukan Penerimaan Barang");
            System.out.println("10. Tampilkan Penerima Barang");
            System.out.print("Masukan pilihan: ");
            String pilihan = sc.nextLine();

            switch (pilihan) {
                case "1":
                    addEmployee();
                    break;
                case "2":
                    showEmployee();
                    break;
                case "3":
                    addSupplier();
                    break;
                case "4":
                    showSupplier();
                    break;
                case "5":
                    addItem();
                    break;
                case "6":
                    showItem();
                    break;
                case "7":
                    addReceiving();
                    break;
                case "8":
                    showReceiving();
                    break;
                case "9":
                    addReceivingItem();
                    break;
                case "10":
                    showReceivingItem();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    public static void addEmployee() {
        System.out.println("\nMasukan Employee: ");
        System.out.print("Kode: ");
        String kode = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Alamat: ");
        String alamat = sc.nextLine();
        Employee e = new Employee(kode, nama, alamat);
        employee.add(e);
    }

    public static void showEmployee() {
        for (Employee e : employee) {
            System.out.println("\nKode" + e.kode_pegawai);
            System.out.println("Nama: " + e.nama_pegawai);
            System.out.println("alamat" + e.alamat);
        }
    }

    public static void addSupplier() {
        System.out.println("\nMasukan Supplier: ");
        System.out.print("Kode: ");
        String kode = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Alamat: ");
        String alamat = sc.nextLine();
        System.out.print("Nomor telp: ");
        String telp = sc.nextLine();
        Supplier e = new Supplier(kode, nama, alamat, telp);
        suppliers.add(e);
    }

    public static void showSupplier() {
        for (Supplier e : suppliers) {
            System.out.println("\nKode" + e.kode_supplier);
            System.out.println("Nama: " + e.nama);
            System.out.println("alamat" + e.alamat);
            System.out.println("Telp" + e.no_tlp);
        }
    }

    public static void addItem() {
        System.out.println("\nMasukan Item: ");
        System.out.print("Kode: ");
        String kode = sc.nextLine();
        System.out.print("Nama item: ");
        String nama = sc.nextLine();
        System.out.print("kategori: ");
        String kategori = sc.nextLine();
        System.out.print("stok: ");
        int stok = sc.nextInt();
        sc.nextLine();
        Item e = new Item(kode, nama, kategori, stok);
        items.add(e);
    }

    public static void showItem() {
        for (Item e : items) {
            System.out.println("\nKode" + e.kode_item);
            System.out.println("Nama: " + e.nama_item);
            System.out.println("kateogori: " + e.kategori);
            System.out.println("stok: " + e.stok);
        }
    }

    public static void addReceivingItem() {
        System.out.println("\nMasukan Penerimaan Barang: ");
        System.out.print("Kode: ");
        String kode = sc.nextLine();
        System.out.print("barang: ");
        String barang = sc.nextLine();
        System.out.print("kuantiti: ");
        int qty = sc.nextInt();
        sc.nextLine();
        System.out.print("harga satuan: ");
        long harga = sc.nextLong();
        sc.nextLine();
        System.out.print("total: ");
        long total = sc.nextLong();
        sc.nextLine();
        receiving_item e = new receiving_item(kode, barang, qty, harga, total);
        receivingItems.add(e);
    }

    public static void showReceivingItem() {
        for (receiving_item e : receivingItems) {
            System.out.println("\nKode" + e.kode_receiving_item);
            System.out.println("barang: " + e.barang);
            System.out.println("kuantiti : " + e.kuantiti_terima);
            System.out.println("haga_satuan: " + e.harga_satuan);
            System.out.println("total: " + e.total);
        }
    }

    public static void addReceiving() {
        System.out.println("\nMasukan Penerimaan: ");
        System.out.print("kode: ");
        String kode = sc.nextLine();
        System.out.print("Nama Supplier: ");
        String nama = sc.nextLine();
        System.out.print("tanggal: ");
        String tanggal = sc.nextLine();
        System.out.print("pembayaran: ");
        String pembayaran = sc.nextLine();
        System.out.print("penerimaan: ");
        String penerimaan = sc.nextLine();
        receiving e = new receiving(kode, nama, tanggal, pembayaran, penerimaan);
        receivings.add(e);
    }

    public static void showReceiving() {
        for (receiving e : receivings) {
            System.out.println("\nKode" + e.kode_receiving);
            System.out.println("Nama supplier: " + e.supplier);
            System.out.println("tanggal: " + e.tanggal);
            System.out.println("pembayaran: " + e.pembayaran);
            System.out.println("penerima: " + e.penerima);
        }
    }

}
