//subclass ditambah di payment
//method overloading pada subclass ditambah di payment
//nomor 3 sudah dibuat di class payment
//validasi data ada di public static void main 
//bubblesort sudah ditambahkan di stok barang nomor 9





import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.IOException;
import java.util.*; 

import javax.naming.InitialContext;
import javax.swing.InputMap;

import model.Employee;
import model.Item;
import model.Payment;
import model.ReceivingItem;
import model.Supplier;
import model.pembelian;
import model.pengantaran;
import model.toko;
import model.barang;

public class Receiving 
{public static ArrayList <Employee> initEmployees(ArrayList <Employee> employees)
    {   Employee emp1 = new Employee("P1", "Brian", " Marketing ");
        employees.add(emp1);
        Employee emp2 = new Employee("P2", "Billy", " Keuangan ");
        employees.add(emp2);
        Employee emp3 = new Employee("P3", "Riandy", " HRD ");
        employees.add(emp3);
        Employee emp4 = new Employee("P4", "Ariq", " Resepsionis ");
        employees.add(emp4);
        Employee emp5 = new Employee("P5", "Angel", " operator ");
        employees.add(emp5);
        Employee emp6 = new Employee("P6", "Angelina", " Marketing ");
        employees.add(emp6);
        Employee emp7 = new Employee("P7", "Itto", " Marketing ");
        employees.add(emp7);
        Employee emp8 = new Employee("P8", "Thomas", " resepsionis ");
        employees.add(emp8);
        Employee emp9 = new Employee("P9", "Yelan", " HRD ");
        employees.add(emp9);
        Employee emp10 = new Employee("P10", "Hutao", " Marketing ");
        employees.add(emp10);
        return employees;}
    public static ArrayList <Item> initItems(ArrayList <Item> item)
    {   Item itm1 = new Item("I1", "rice-cooker", "Alat rumah tangga", 1000,"belum","layak dipakai");
        item.add(itm1);
        Item itm2 = new Item("I2", "panci", "Alat rumah tangga", 2000,"belum","layak dipakai");
        item.add(itm2);
        Item itm3 = new Item("I3", "apel", "makanan", 100,"belum","layak dipakai");
        item.add(itm3);
        Item itm4 = new Item("I4", "coca-cola", "Minuman", 150,"belum","layak dipakai");
        item.add(itm4);
        Item itm5 = new Item("I5", "antangin", "Obat-obatan", 10,"sudah","tidak layak dipakai");
        item.add(itm5);
        Item itm6 = new Item("I6", "susu", "Minuman", 5,"Sudah","tidak layak dipakai");
        item.add(itm6);
        Item itm7 = new Item("I7", "Relaxa", "Makanan", 500,"belum","layak dipakai");
        item.add(itm7);
        Item itm8 = new Item("I8", "Hand Sanitizer", "Kebersihan", 10,"belum","layak dipakai");
        item.add(itm8);
        Item itm9 = new Item("I9", "jeruk", "makanan", 10 ,"sudah","tidak layak dipakai");
        item.add(itm9);
        Item itm10 = new Item("I10", "cheetos", "makanan", 100,"belum","layak dipakai");
        item.add(itm10);
        return item;}
    public static ArrayList <Payment> initPayments(ArrayList <Payment> payment)
    {   Payment pmt1 = new Payment(1, 40000, "Apel fuji", "00100AF"); //
        payment.add(pmt1);
        Payment pmt2 = new Payment(2, 10000, "Permen Kopiko", "00100PK");
        payment.add(pmt2);
        Payment pmt3 = new Payment(3, 5000, "Apel Fuji", "00200AF");
        payment.add(pmt3);
        Payment pmt4 = new Payment(4, 30000, "jeruk Mandarin", "00100JM");
        payment.add(pmt4);
        Payment pmt5 = new Payment(5, 5000, "Susu Ultramilk rasa Coklat", "00100SC");
        payment.add(pmt5);
        Payment pmt6 = new Payment(6, 12000, "Permen Relaxa", "00100PR");
        payment.add(pmt6);
        Payment pmt7 = new Payment(7, 40000, "Apel Fuji", "00300AF");
        payment.add(pmt7);
        Payment pmt8 = new Payment(8, 12000, "Rokok gudang garam", "00100RGG");
        payment.add(pmt8);
        Payment pmt9 = new Payment(9,30000, "Jeruk Mandarin", "00100JM");
        payment.add(pmt9);
        Payment pmt10 = new Payment(10, 5000, "Susu Uktramilk full cream", "00100SFC");
        payment.add(pmt10);
        return payment;}
    public static ArrayList <ReceivingItem> initReceivingItems(ArrayList <ReceivingItem> receivingItems)
    {   ReceivingItem rcv1 = new ReceivingItem("001", "100000", "15000", "101000", "makanan", "09:00 AM", "mitra mulia","brian");
        receivingItems.add(rcv1);
        ReceivingItem rcv2 = new ReceivingItem("002", "150000", "15000", "152000", "makanan", "09:00 AM", "mitra mulia","brian");
        receivingItems.add(rcv2);
        ReceivingItem rcv3 = new ReceivingItem("003", "10000","250000000", "10100", "makanan", "09:00 AM", "mitra mulia","brian");
        receivingItems.add(rcv3);
        ReceivingItem rcv4 = new ReceivingItem("004", "10000", "15000", "10050", "makanan", "09:00 AM", "mitra mulia","brian");
        receivingItems.add(rcv4);
        ReceivingItem rcv5 = new ReceivingItem("005", "5000000", "15000", "5010000", "makanan", "09:00 AM", "mitra mulia","brian");
        receivingItems.add(rcv5);
        ReceivingItem rcv6 = new ReceivingItem("006", "10000", "15000", "10300", "makanan", "09:00 AM", "mitra mulia","brian");
        receivingItems.add(rcv6);
        ReceivingItem rcv7 = new ReceivingItem("007", "10000", "15000", "11000", "makanan", "09:00 AM", "mitra mulia","brian");
        receivingItems.add(rcv7);
        ReceivingItem rcv8 = new ReceivingItem("008", "10000", "15000", "0400", "makanan", "09:00 AM", "mitra mulia","brian");
        receivingItems.add(rcv8);
        ReceivingItem rcv9 = new ReceivingItem("009", "70", "15000", "140", "makanan", "09:00 AM", "mitra mulia","brian");
        receivingItems.add(rcv9);
        ReceivingItem rcv10 = new ReceivingItem("010", "1000", "1500000", "1100", "makanan", "09:00 AM", "mitra mulia","brian");
        receivingItems.add(rcv10);
        
        return receivingItems;}
    public static ArrayList <Supplier> initSuppliers(ArrayList <Supplier> supplier)
    {   Supplier spl1 = new Supplier (" SPL01 ", " Asiong ", " Jalan harimau 001 ", " Mitra mulia ");
        supplier.add(spl1);
        Supplier spl2 = new Supplier(" SPL02 ", " Diana ", " Jalan Tikus 23 ", "Diana Agung");
        supplier.add(spl2);
        Supplier spl3 = new Supplier (" SPL03 ", " Kevin ", " Jalan Hantu 111 ", " toko sanjaya");
        supplier.add(spl3);
        Supplier spl4 = new Supplier (" SPL04 ", " Barbatos ", " Jalan Harimau 45 ", " Mitra jaya");
        supplier.add(spl4);
        Supplier spl5 = new Supplier (" SPL05 ", " Alexander ", " Jalan Pokemon 99 ", " OJ market ");
        supplier.add(spl5);
        Supplier spl6 = new Supplier (" SPL06 ", " surya ", " Jalan Wibu 1112 ", " toko surya");
        supplier.add(spl6);
        Supplier spl7 = new Supplier (" SPL07 ", " solar ", " Jalan Kodok 6 ", " toko bintang makmur ");
        supplier.add(spl7);
        Supplier spl8 = new Supplier (" SPL08 ", " kartini ", " Jalan Jerapah 190 ", " supermarket jenius ");
        supplier.add(spl8);
        Supplier spl9 = new Supplier (" SPL09 ", " Raymond ", " Jalan Jones 75 ", " toko valor ");
        supplier.add(spl9);
        Supplier spl10 = new Supplier (" SPL10 ", " Freddy ", " Jalan Kenyang 61 ", " kesuma jaya ");
        supplier.add(spl10);
        return supplier;} 
    public static ArrayList <pembelian> initpembelian(ArrayList <pembelian> Pembelian)
    {   pembelian unit1 = new pembelian("Apel", "40.000/kg");
        Pembelian.add(unit1);
        pembelian unit2 = new pembelian("cheetos", "60.000/dus");
        Pembelian.add(unit2);
        pembelian unit3 = new pembelian("Jeruk", "30.000/kg");
        Pembelian.add(unit3);
        pembelian unit4 = new pembelian("Apel", "40.000/kg");
        Pembelian.add(unit4);
        pembelian unit5 = new pembelian("Coca-Cola(250mg)", "30.000/lusin");
        Pembelian.add(unit5);
        pembelian unit6 = new pembelian("Susu", "120.000/dus");
        Pembelian.add(unit6);
        pembelian unit7 = new pembelian("cheetos", "60.000/dus");
        Pembelian.add(unit7);
        pembelian unit8 = new pembelian("rokok gudang garam", "322.000/slop");
        Pembelian.add(unit8);
        pembelian unit9 = new pembelian("jeruk", "30.000/kg");
        Pembelian.add(unit9);
        pembelian unit10 = new pembelian("Apel", "40.000/kg");
        Pembelian.add(unit10);
        return Pembelian;}  //belum buat public status untuk main
    public static ArrayList <pengantaran> initpengantaran(ArrayList <pengantaran> Pengantaran)
    {   pengantaran trip1 = new pengantaran("13.00","toko makmur jaya","16.00");
        Pengantaran.add(trip1);
        pengantaran trip2 = new pengantaran("10.00","toko meriam timur","13.46");
        Pengantaran.add(trip2);
        pengantaran trip3 = new pengantaran("12.00","toko jaya indonesia","17.29");
        Pengantaran.add(trip3);
        pengantaran trip4 = new pengantaran("13.30","Diana Agung","16.51");
        Pengantaran.add(trip4);
        pengantaran trip5 = new pengantaran("09.00","PT juishin","10.38");
        Pengantaran.add(trip5);
        pengantaran trip6 = new pengantaran("09.52","toko indah jaya","12.07");
        Pengantaran.add(trip6);
        pengantaran trip7 = new pengantaran("15.00","toko bodyfista","18.11");
        Pengantaran.add(trip7);
        pengantaran trip8 = new pengantaran("13.40","toko cahaya terang","17.52");
        Pengantaran.add(trip8);
        pengantaran trip9 = new pengantaran("14.43","toko matahari","16.58");
        Pengantaran.add(trip9);
        pengantaran trip10 = new pengantaran("12.57","toko material bagus","14.22");
        Pengantaran.add(trip10);
        return Pengantaran;} //belum buat public status untuk main
    public static ArrayList <toko> inittoko(ArrayList <toko> Toko)
    {   toko trip1 = new toko("mitra mulia","mitra agung","buah apel fuji sepuluh dus");
        Toko.add(trip1);
        toko trip2 = new toko("toko meriam jaya","toko jaya indonesia","susu uht ultra milk rasa cokklat 3 dus");
        Toko.add(trip2);
        toko trip3 = new toko("toko bodyfista","toko mitra mulia","100 bungkus permen Kopiko");
        Toko.add(trip3);
        toko trip4 = new toko("toko matahari","toko indah jaya","5 lusin permen relaxa");
        Toko.add(trip4);
        toko trip5 = new toko( "toko indah jaya","mitra agung","100 kotak cheetos rasa jagung bakar");
        Toko.add(trip5);
        toko trip6 = new toko( "mitra agung","toko cahaya terang","100 kotak jeruk mandarin");
        Toko.add(trip6);
        toko trip7 = new toko("PT juishin","toko mitra mulia","Coca-cola 250mg 500 kotak");
        Toko.add(trip7);
        toko trip8 = new toko("toko sundrop","toko jaya indonesia","susu uht ultra milk rasa stroberi 5 dus");
        Toko.add(trip8);
        toko trip9 = new toko( "toko jaya indonesia","toko jaya indonesia","lem UHU 100 kotak");
        Toko.add(trip9);
        toko trip10 = new toko("toko meriam jaya","toko jaya indonesia","susu uht ultra milk rasa cokklat 2 dus" );
        Toko.add(trip10);
        return Toko;}
        
        public static ArrayList <barang> initbarang(ArrayList <barang> barangs)
        {   barang brg1 = new barang("B1", 12);
            barangs.add(brg1);
            barang brg2 = new barang("B2", 2);
            barangs.add(brg2);
            barang brg3 = new barang("B3", 7);
            barangs.add(brg3);
            return barangs;}

        //disini terdapat jawaban dari soal nomor 4 di bagian throw exception
        public static void main(String[] args) throws Exception 
    {   ArrayList <Employee> employees = new ArrayList <Employee>();
        ArrayList <ReceivingItem> receivingItems = new ArrayList <ReceivingItem>();
        ArrayList <Supplier> supplier = new ArrayList <Supplier>();
        ArrayList <Item> item = new ArrayList <Item>();
        ArrayList <Payment> payment = new ArrayList <Payment>();
        ArrayList <pengantaran> Pengantaran = new ArrayList <pengantaran>();
        ArrayList <pembelian> Pembelian = new ArrayList <pembelian>();
        ArrayList <toko> Toko = new ArrayList <toko>();
        ArrayList <barang> barangs = new ArrayList <barang>();
        initEmployees(employees);
        initItems(item);
        initPayments(payment);
        initReceivingItems(receivingItems);
        initSuppliers(supplier);
        initpembelian(Pembelian);
        initpengantaran(Pengantaran);
        inittoko(Toko);
        initbarang(barangs);
        Scanner input = new Scanner(System.in);
        String yn="y";
        do{menu();
            int pilihan = 0;
            pilihan = input.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.flush();
                if(pilihan==1)
            {    String yn1="y";
                do{
                menuPegawai();
    
                int pilihanpgw = 0;
                pilihanpgw = input.nextInt();
    
                if(pilihanpgw==1)//tambah data pegawai
                 {      String kode_pegawai;
                        String nama_pegawai;
                        String alamat;
                        System.out.print("Kode pegawai \t:\t");
                        kode_pegawai=input.next();
                        System.out.print("Nama pegawai \t:\t");
                        nama_pegawai=input.next();
                        System.out.print("alamat \t\t:\t");
                        alamat=input.next();
                        employees.add(new Employee(kode_pegawai, nama_pegawai, alamat));
                        System.out.println("Data Berhasil Ditambahkan");}
                        else if(pilihanpgw==2)//tampilkan data pegawai
                        {cetakDataPegawai(employees);;}
                    else if(pilihanpgw==3)//keluar
                    {break;}
                    else{continue;}
                    System.out.print("kembali ke menu Data Pegawai? (y/n): ");
                    yn1=input.next();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();}
             while(yn1.equalsIgnoreCase("y"));}
            else if(pilihan==2)
            { String yn2="y";
                do{menuBarangyangDiterima();;
                    int pilihanprm = 0;
                    pilihanprm = input.nextInt();
                    if(pilihanprm==1)
                    {   String kodeReceiving;
                        String kuantitiTerima;
                        String hargaSatuan;
                        String total;
                        String jenisbarang;
                        String waktuterima;
                        String asaltoko;
                        String namapengirim;
                        System.out.print("Kode penerimaan \t:\t");
                        kodeReceiving=input.next();
                        System.out.print("Kuantitas Terima \t:\t");
                        kuantitiTerima=input.next();
                        System.out.print("Harga Satuan\t\t:\t");
                        hargaSatuan=input.next();
                        System.out.print("Total Pembayaran \t:\t");
                        total=input.next();
                        System.out.print("Jenis barang yang diterima \t:\t");
                        jenisbarang=input.next();
                        System.out.print("Waktu barang tersebut diterima \t:\t");
                        waktuterima=input.next();
                        System.out.print("asal barang dikirim darimana \t:\t");
                        asaltoko=input.next();
                        System.out.print("siapa pengirimnya \t:\t");
                        namapengirim=input.next();
                        receivingItems.add(new ReceivingItem(kodeReceiving,kuantitiTerima,hargaSatuan,total, jenisbarang, waktuterima, asaltoko, namapengirim));
                        System.out.println("Data sukses ditambahkan");}
                    else if(pilihanprm==2)
                    {cetakBuktiTerimaBarang(receivingItems);}    
                    else if (pilihanprm==4)
                    {historipenerimaanbrg(receivingItems);}
                    else if(pilihanprm==3)
                    {
                        break;
                    }
                    else{
                        continue;
                    }
                    System.out.print("kembali ke menu Penerimaan? (y/n): ");
                    yn2=input.next();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
                while(yn2.equalsIgnoreCase("y"));
            }
    
            else if(pilihan==3)//barang
            {
                String yn3="y";
                do{
                    menuBarang();
    
                    int pilihanmnbrg = 0;
                    pilihanmnbrg = input.nextInt();
    
                    if(pilihanmnbrg==1)//tambah data barang
                    {
                        String kodeItem;
                        String namaItem;
                        String Kategori;
                        int stock;
                        String expired;
                        String layakpake;

                        System.out.print("Kode barang \t\t:\t");
                        kodeItem=input.next();
                        System.out.print("Nama barang \t\t:\t");
                        namaItem =input.next();
                        System.out.print("kategori barang \t:\t");
                        Kategori=input.next();
                        System.out.print("Stok \t\t\t:\t");
                        stock=input.nextInt();
                        System.out.print("expired \t\t\t:\t");
                        expired=input.next();
                        System.out.print("layakpake \t\t\t:\t");
                        layakpake=input.next();
    
                        item.add(new Item(kodeItem, namaItem, Kategori, stock, expired, layakpake));
                        System.out.println("Data sukses ditambahkan");
                    }
                    else if(pilihanmnbrg==2)//tampilkan data barang
                    {
                        cetakDataBarang(item);
                    }
                   
                    else if(pilihanmnbrg==3)//keluar
                    {
                        break;
                    }
                    else{
                        continue;
                    }
                    System.out.print("kembali ke menu Barang? (y/n): ");
                    yn3=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn3.equalsIgnoreCase("y"));
            }
    
            else if(pilihan==4)//supplier
            {
                String yn5="y";
                do{
                    menuSupplier();
    
                    int pilihanspl = 0;
                    pilihanspl = input.nextInt();
    
                    if(pilihanspl==1)//tambah data supplier
                    {
                        String kodeSupplier;
                        String nama;
                        String Alamat;
                        String namaperusahaan;
    
                        System.out.print("Kode supplier \t\t:\t");
                        kodeSupplier=input.next();
                        System.out.print("Nama supplier \t\t:\t");
                        nama=input.next();
                        System.out.print("Alamat supplier \t:\t");
                        Alamat=input.next();
                        System.out.print("Nama perusahaan supplier \t\t:\t");
                        namaperusahaan=input.next();
    
                        supplier.add(new Supplier(kodeSupplier, nama, Alamat, namaperusahaan));
                        System.out.println("Data Berhasil Ditambahkan");
                    }
                    else if(pilihanspl==2)//tampilkan data supplier
                    {
                        cetakDataSupplier(supplier);
                    }
    
                    else if(pilihanspl==3)//keluar
                    {
                        break;
                    }
    
                    else{
                        continue;
                    }
    
                    System.out.print("kembali ke menu Supplier? (y/n): ");
                    yn5=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn5.equalsIgnoreCase("y"));
            }
    
            else if(pilihan==5)//pembayaran
            {
                String yn6="y";
                do{
                    menuPembayaran();
    
                    int pilihanpby = 0;
                    pilihanpby = input.nextInt();
    
                    if(pilihanpby==1)//tambah data pembayaran
                    {
                        int kodePembayaran;
                        long Harga;
                        String itemName;
                        String kodeTransaksi;
    
                        System.out.print("Kode Pembayaran \t:\t");
                        kodePembayaran=input.nextInt();
                        System.out.print("Harga Barang \t\t:\t");
                        Harga=input.nextLong();
                        System.out.print("Nama Barang \t\t:\t");
                        itemName=input.next();
                        System.out.print("Kode Transaksi \t\t:\t");
                        kodeTransaksi=input.next();
                        payment.add(new Payment(kodePembayaran, Harga, itemName, kodeTransaksi));
                        System.out.println("Data sukses ditambahkan");
                    }
    
                    else if(pilihanpby==2)//tampilkan data pembayaran
                    {
                        cetakDataPembayaran(payment);
                    }    
                    
                    else if(pilihanpby==3)//tampilkan data pembayaran dengan harga barang yang diurutkan
                    {
                        
                    }

                    else if(pilihanpby==4)//keluar
                    {
                        menu();
                    }
    
                    else{
                        continue;
                    }
    
                    System.out.print("kembali ke Menu Pembayaran? (y/n): ");
                    yn6=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn6.equalsIgnoreCase("y"));
            }
            else if(pilihan==6)//pembelian
            {
                String yn7="y";
                do{
                    menuPembelian();
    
                    int pilihanpemb = 0;
                    pilihanpemb = input.nextInt();
    
                    if(pilihanpemb==1)//tambah data pembelian
                    {
                        String barangyangdibeli;
                        String harga;
                       
    
                        System.out.print("Nama Barang \t:\t");
                        barangyangdibeli=input.next();
                        System.out.print("Harga Barang \t:\t");
                        harga=input.next();
                        Pembelian.add(new pembelian(barangyangdibeli, harga));
                        System.out.println("Data sukses ditambahkan");
                    }
    
                    else if(pilihanpemb==2)//tampilkan data pembelian
                    {
                        cetakDataPembelian(Pembelian);
                    }    

                    else if(pilihanpemb==3)//keluar
                    {
                        menu();
                    }
    
                    else{
                        continue;
                    }
    
                    System.out.print("kembali ke Menu Pembelian? (y/n): ");
                    yn7=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn7.equalsIgnoreCase("y"));
            }
            else if(pilihan==7)//pengantaran
            {
                String yn8="y";
                do{
                    menuPengantaran();
    
                    int pilihanpeng = 0;
                    pilihanpeng = input.nextInt();
    
                    if(pilihanpeng==1)//tambah data pengantaran
                    {
                        String pengantaranjamberapa;
                        String siapapengirim;
                        String jamberapasampai;
                       
    
                        System.out.print("Jam berapa barang diantar \t:\t");
                        pengantaranjamberapa=input.next();
                        System.out.print("Siapa pengirimnya \t\t:\t");
                        siapapengirim=input.next();
                        System.out.print("Sampai tujuan jam berapa \t:\t");
                        jamberapasampai=input.next();
                        Pengantaran.add(new pengantaran(pengantaranjamberapa, siapapengirim, jamberapasampai));
                        System.out.println("Data sukses ditambahkan");
                    }
    
                    else if(pilihanpeng==2)//tampilkan data pengantaran
                    {
                        cetakDataPengantaran(Pengantaran);
                    }    

                    else if(pilihanpeng==3)//keluar
                    {
                        menu();
                    }
    
                    else{
                        continue;
                    }
    
                    System.out.print("kembali ke Menu Pengantaran? (y/n): ");
                    yn8=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn8.equalsIgnoreCase("y"));
            }
            else if(pilihan==8)//toko
            {
                String yn9="y";
                do{
                    menuToko();
    
                    int pilihantoko= 0;
                    pilihantoko = input.nextInt();
    
                    if(pilihantoko==1)//tambah data toko
                    {
                        String tokopengirim;
                        String tokopenerima;
                        String barangapayangdikirim;
                       
    
                        System.out.print("Toko pengirim \t\t\t:\t");
                        tokopengirim=input.next();
                        System.out.print("Toko penerima \t\t\t:\t");
                        tokopenerima=input.next();
                        System.out.print("barang apa yang dikirim \t:\t");
                        barangapayangdikirim=input.next();
                        Toko.add(new toko(tokopengirim, tokopenerima, barangapayangdikirim));
                        System.out.println("Data sukses ditambahkan");
                    }
    
                    else if(pilihantoko==2)//tampilkan data toko
                    {
                        cetakDataToko(Toko);
                    }    

                    else if(pilihantoko==3)//keluar
                    {
                        menu();
                    }
    
                    else{
                        continue;
                    }
    
                    System.out.print("kembali ke Menu Toko? (y/n): ");
                    yn9=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn9.equalsIgnoreCase("y"));
            }
            else if(pilihan==9)//Stokbarang
            {
                String yn9="y";
                do{
                    menuStokBarang();
    
                    int pilihanstokbarang= 0;
                    pilihanstokbarang = input.nextInt();
    
                    if(pilihanstokbarang==1)//tambah data stok barang
                    {
                        String namabarang;
                        int stok;
                       
    
                        System.out.print("Nama Barang \t\t\t:\t");
                        namabarang=input.next();
                        System.out.print("Stok \t\t\t:\t");
                        stok=input.nextInt();
                        barangs.add(new barang(namabarang, stok));
                        System.out.println("Data sukses ditambahkan");
                    }
    
                    else if(pilihanstokbarang==2)//tampilkan data stok barang
                    {
                        cetakStokDataBarang(barangs);
                    }    
                    else if (pilihanstokbarang==3)//Nama barang terurut //bubblesort
                    {
                        ArrayList<String> list = new ArrayList<String>();
                        String nbarang[] =  {"Coca-cola", "Apel" , "Jeruk", "Susu", "Permen"};   
                        String temp;
                        for (int i=0; i< nbarang.length; i++){
                            for(int j= i; j< nbarang.length-1; j++){
                                char first = nbarang[i].charAt(0);
                                char sec = nbarang[j +1].charAt(0);
                                 if (first < sec)  {
                                     temp = nbarang[j +1];
                                     nbarang[j +1] = nbarang[i];        
                                     nbarang[i] = temp;
                                 }
                             }
                            list.add(nbarang[i]);
                         }
                           System.out.print(list+"\n");
//berhubung sebelumnya terlalu panjang dan kacau, jadi saya terpaksa membuat bubblesort pada data yang baru, mohon maaf dan terima kasih atas pengertiannya 

                    }
                    else if(pilihanstokbarang==4)//keluar
                    {
                        menu();
                    }
    
                    else{
                        continue;
                    }
    
                    System.out.print("kembali ke Menu Stok Barang? (y/n): ");
                    yn9=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn9.equalsIgnoreCase("y"));
            }
    
            else if(pilihan==10)//keluar
            {
                break;
            }
    
            else{
                continue;
            }
    
            System.out.print("kembali ke Menu Utama? (y/n): ");
            yn=input.next();
    
            System.out.print("\033[H\033[2J");
            System.out.flush();
    
        }
        while(yn.equalsIgnoreCase("y"));
    }
            

    public static void menu()
    {System.out.println("Penerimaan Barang");
    System.out.println("1. Data pegawai");
    System.out.println("2. Data penerimaan");
    System.out.println("3. Data barang");
    System.out.println("4. Data supplier");
    System.out.println("5. Data pembayaran");
    System.out.println("6. Data Pembelian");
    System.out.println("7. Data Pengantaran");
    System.out.println("8. Data Toko");
    System.out.println("9. Data Stok Barang");
    System.out.println("10. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");}
    public static void menuPegawai()
    { System.out.println("Data Pegawai");
    System.out.println("1. Tambah data pegawai");
    System.out.println("2. Tampilkan data pegawai");
    System.out.println("3. Keluar");
    System.out.print("Masukkan Pilihan Anda: "); }
    public static void menuBarang()
    {System.out.println("Data Barang");
    System.out.println("1. Tambah data barang");
    System.out.println("2. Tampilkan data barang");
    System.out.println("3. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");}

    public static void menuBarangyangDiterima()
    {System.out.println("Data Barang yang diterima");
    System.out.println("1. Tambah data barang yang diterima");
    System.out.println("2. Tampilkan data barang yang diterima");
    System.out.println("3. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");}
    public static void menuSupplier()
    {System.out.println("Data supplier");
    System.out.println("1. Tambah data supplier");
    System.out.println("2. Tampilkan data supplier");
    System.out.println("3. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");}

    public static void menuPembayaran()
    {System.out.println("Data pembayaran");
    System.out.println("1. Tambah data pembayaran");
    System.out.println("2. Tampilkan data pembayaran");
    System.out.println("3. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");}

    public static void menuPembelian()
    {System.out.println("Data pembelian");
    System.out.println("1. Tambah data pembelian");
    System.out.println("2. Tampilkan data pembelian");
    System.out.println("3. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");}
    
    public static void menuPengantaran()
    {System.out.println("Data pengantaran");
    System.out.println("1. Tambah data pengantaran");
    System.out.println("2. Tampilkan data pengantaran");
    System.out.println("3. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");}

    public static void menuToko()
    {System.out.println("Data toko");
    System.out.println("1. Tambah data toko");
    System.out.println("2. Tampilkan data toko");
    System.out.println("3. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");}

    public static void menuStokBarang()
    {System.out.println("Data Stok Barang");
    System.out.println("1. Tambah data stok barang");
    System.out.println("2. Tampilkan data stok barang");
    System.out.println("3. Tampilkan nama barang terurut");
    System.out.println("4. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");}

    public static void cetakDataPegawai (ArrayList <Employee> employees){
        System.out.println ("------------------------------------------------");
        for (Employee employee : employees) 
        {
            System.out.println(employee);
        }
        System.out.println("-------------------------------------------------");
    }

    public static void cetakBuktiTerimaBarang (ArrayList <ReceivingItem> receivingItems){
        System.out.println ("------------------------------------------------");
        for (ReceivingItem receivingItem : receivingItems) 
        {
            System.out.println(receivingItem);
        }
        System.out.println("-------------------------------------------------");
    }

    public static void cetakDataBarang (ArrayList <Item> items){
        System.out.println ("------------------------------------------------");
        for (Item item : items) 
        {
            System.out.println(item);
        }
        System.out.println("-------------------------------------------------");
    }
    public static void cetakDataSupplier (ArrayList <Supplier> supplier){
        System.out.println ("------------------------------------------------");
        for (Supplier supplier2 : supplier) 
        {
            System.out.println(supplier2);    
        }     
        System.out.println("-------------------------------------------------");
    }
    public static void cetakDataPembayaran (ArrayList <Payment> payment){
        System.out.println ("------------------------------------------------");
        for (Payment payment2 : payment)
        {
            System.out.println(payment2);  
        }
        System.out.println("-------------------------------------------------");
    }
    public static void cetakDataPengantaran (ArrayList <pengantaran> Pengantaran){
        System.out.println ("------------------------------------------------");
        for (pengantaran Pengantaran2 : Pengantaran)
        {
            System.out.println(Pengantaran2);  
        }
        System.out.println("-------------------------------------------------");
    }
    public static void cetakDataPembelian (ArrayList <pembelian> Pembelian){
        System.out.println ("------------------------------------------------");
        for (pembelian Pembelian2 : Pembelian)
        {
            System.out.println(Pembelian2);  
        }
        System.out.println("-------------------------------------------------");
    }
    public static void cetakDataToko(ArrayList <toko> Toko){
        System.out.println ("------------------------------------------------");
        for (toko Toko2 : Toko)
        {
            System.out.println(Toko2);  
        }
        System.out.println("-------------------------------------------------");
    }
    public static void cetakStokDataBarang(ArrayList <barang> barangs){
        System.out.println ("------------------------------------------------");
        for (barang barangs2 : barangs)
        {
            System.out.println(barangs2);  
        }
        System.out.println("-------------------------------------------------");
    }
    public static void historipenerimaanbrg (ArrayList <ReceivingItem> receivingItems)
    {
        System.out.print("Masukkan Kode Penerimaan Barang : ");
        Scanner input = new Scanner(System.in);
        String Kdrcv;
        Kdrcv = input.next();
        for (ReceivingItem rcv : receivingItems) {
            if (rcv.getKodeReceiving().equals(Kdrcv))
            System.out.println("Histori Berdasarkan Inputan : \n" + "Kode Receiving\t\t: \t" + rcv.getKodeReceiving() + "\nKuantitas \t\t:\t" + rcv.getKuantitiTerima() + "\nHarga Satuan \t\t:\t" + rcv.getHargaSatuan() + "\nTotal Pembelanjaan\t:\t" + rcv.getTotal());
        }
    }


    public static void penerimaanbarangterbanyak (ArrayList <Item> item)
    {
        int terbanyak=0;
        for (Item rcv1 : item) {
            if(rcv1.getStock() > terbanyak)
            {
                terbanyak = rcv1.getStock();
            }
        }
        String nilai = Integer.toString(terbanyak);
        //System.out.println(nilai);
        for (Item rcv : item) 
        {
            if(rcv.getStock()==terbanyak){
                System.out.println("Barang paling banyak diterima : \n" + "Kode Item\t\t: \t" + rcv.getKodeItem() + "\nNama Item \t\t:\t" + rcv.getNamaItem() + "\nKategori \t\t:\t" + rcv.getKategori() + "\nStock\t\t\t:\t" + rcv.getStock());
            }
        }
        
    }
}