/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
class Mobil {

    String merk;
    int tipe;
    int jumlah;
    double harga;

    public Mobil(String merk, int tipe, int jumlah, float harga) {
        this.merk = merk;
        this.tipe = tipe;
        this.jumlah = jumlah;
        this.harga = harga;
    }
}

class Pelanggan {

    String nama;
    int usia;
    String domisili;
}

class Asuransi {

    String nama;
    Double biayaPertahun;
    int minAsuransi;
    int jumlahLamaProteksi;
}

class Penjualan {

    Pelanggan pelanggan;
    Mobil[] mobil = new Mobil[3];
    double ongkir;
    Asuransi[] asuransi = new Asuransi[2];
}

public class no1 {

    static Scanner scan = new Scanner(System.in);
    static int[] persediaan = new int[6];
    static Penjualan[] dealer = new Penjualan[10];
    static Pelanggan[] pelanggan = new Pelanggan[10];
    
    

    public static void pencatatan() {
        System.out.println("Input data mobil yang baru datang : \n"
                + "1. Avanza\n"
                + "2. Alphard\n"
                + "3. Fortuner\n");

        System.out.print("Pilih Merk: ");
        String merk = scan.next();
        System.out.print("1. Basic\n"
                + "2. Premium\n"
                + "Pilih Tipe : ");
        String tipe = scan.next();
        System.out.print("Masukan Jumlah: ");
        String jumlah = scan.next();
        if (dealer[merk + tipe] < 10) {
            dealer[merk + tipe] += jumlah;
        } else {
            System.out.println("Dealer sudah memenuhi kapasitas!");
        }
    }

   public static void penjualan() {
        for (int i = 0; i < pelanggan.length; i++) {
            System.out.println((i + 1) + ". " + pelanggan[i].nama);
        }

        System.out.print("Masukan id pelanggan: ");
        String idPelanggan = scan.next();

        for (int i = 0; i < mobil.length; i++) {
            System.out.println((i + 1) + ". " + mobil[i].merk);
        }

        System.out.print("Masukan id mobil: ");
        String idMobil = scan.next();

        System.out.print("Masukan Ongkir: ");
        System.out.println("1. Jabodetabek\n"
                        + "2. Pulau Jawa Luar Jabodetabek\n"
                        + "3. Pulau Bali\n"
                        + "4. Luar Jawa dan Bali\n"
                        + "Masukan Ongkir : ");
        String ongkir = scan.next();
        int temp = 0;
        switch(ongkir) {
            case 1:
                temp = ongkir*0.1;
                break;
            case 2:
                temp = ongkir*0.3;
                break;
            case 3:
                temp = ongkir+ ongkir*0.5;
            case 3:
                temp = ongkir+ ongkir*0.10;
            default:
                ongkir = 0;                
        }
           
    }

    public static void main(String[] args) {
        int menu = 0;
        while (menu != 4) {
            System.out.print("pilih menu :\n"
                    + "1. pencatatan\n"
                    + "2. penjualan\n"
                    + "3. hitung keuntungan\n"
                    + "4. exit\n");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    pencatatan();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("program selesai!");
                    break;
                default:
                    System.out.println("Salah input data!");
            }
        }
    }
}

