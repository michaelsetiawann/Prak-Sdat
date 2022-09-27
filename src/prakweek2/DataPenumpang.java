/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakweek2;

import java.util.Scanner;

/**
 *
 * @author Michael
 */

//soal no 1
class DataPenumpang {
    String namaPenumpang;
    String tujuanPenumpang;
    Double hargaTiketPenumpang, hargaBagasiPenumpang, totalHarga;
    int usiaPenumpang;
    
    public DataPenumpang(String _nama, int i, String _tujuan, int _usia, double _hargaTiket, double _hargaBagasi, double _total){
        
        this.namaPenumpang = _nama;
        this.tujuanPenumpang = _tujuan;
        this.usiaPenumpang = _usia;
        this.hargaTiketPenumpang = _hargaTiket;
        this.hargaBagasiPenumpang = _hargaBagasi;
        this.totalHarga = _total;   
    }
    public static double HargaTiket(String tujuan, String kelas, int usia) {
        double hargaTiket = 0;
        switch (tujuan) {
            case "a":
                switch (kelas) {
                    case "Promo":
                        hargaTiket = 310000;
                        break;
                    case "Ekonomi":
                        hargaTiket = 400000;
                        break;
                    case "Bisnis":
                        hargaTiket = 500000;
                        break;
                    default:
                        hargaTiket = 0;
                        break;
                }
            case "b":
                switch (kelas) {
                    case "promo":
                        hargaTiket = 500000;
                        break;
                    case "Ekonomi":
                        hargaTiket = 550000;
                        break;
                    case "Bisnis":
                        hargaTiket = 620000;
                    default:
                        hargaTiket = 0;
                        break;
                }
            case "c":
                switch (kelas) {
                    case "promo":
                        hargaTiket = 500000;
                        break;
                    case "Ekonomi":
                        hargaTiket = 550000;
                        break;
                    case "Bisnis":
                        hargaTiket = 620000;
                    default:
                        hargaTiket = 0;
                        break;
                }
            case "d":
                switch (kelas) {
                    case "promo":
                        hargaTiket = 620000;
                        break;
                    case "Ekonomi":
                        hargaTiket = 700000;
                        break;
                    case "Bisnis":
                        hargaTiket = 750000;
                    default:
                        hargaTiket = 0;
                        break;
                }
            case "e":
                switch (kelas) {
                    case "promo":
                        hargaTiket = 620000;
                        break;
                    case "Ekonomi":
                        hargaTiket = 700000;
                        break;
                    case "Bisnis":
                        hargaTiket = 750000;
                    default:
                        hargaTiket = 0;
                        break;
                }
                break;
            default:
                hargaTiket = 0;
                break;
        }
        if (usia < 1 || usia > 60) {
            hargaTiket = hargaTiket/2; 
        }
        return hargaTiket;
    }
    public static double BiayaBagasi(String bagasi) {
        double hargaBagasi;
        switch (bagasi) {
            case "k":
                hargaBagasi = 45000;
                break;
            case "l":
                hargaBagasi = 90000;
                break;
            case "m":
                hargaBagasi = 120000;
            default:
                hargaBagasi = 0;
        }
        return hargaBagasi;
    }
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DataPenumpang[] arrDataPenumpang = new DataPenumpang[100];
        String check; 
        double totalHarga,biayaBagasi, total = 0;
        int i = 0;
        do {
            System.out.println("Masukkan nama : ");
            String nama = scan.next();
            System.out.println("Masukan Tujuan : ");
            String tujuan = scan.next().toLowerCase();
            System.out.println("Masukan Usia :");
            int usia = scan.nextInt();
            System.out.println("Masukan Kelas maskapai (promo, ekonomi, bisnis): ");
            String kelas = scan.next().toLowerCase();
            System.out.println("Masukan Tipe Bagasi : ");
            String tipeBagasi = scan.next().toLowerCase();
            System.out.println("Mau masukkan lagi ?(y/n)");
            check = scan.next();
            totalHarga = HargaTiket(tujuan, kelas, usia);
            biayaBagasi = BiayaBagasi(tipeBagasi);
            total = totalHarga + biayaBagasi;
            arrDataPenumpang[i]= new DataPenumpang(nama, i, tujuan, usia, totalHarga, biayaBagasi, total);
            
            i++;
        } while (check.equals("y"));
        double totalTiket = 0;
        double totalBagasi = 0;
        double totalBayar = 0;
        for (int j = 0; j < i; j++) {
            totalTiket += arrDataPenumpang[j].hargaTiketPenumpang;
            totalBagasi += arrDataPenumpang[j].hargaBagasiPenumpang;
            totalBayar += arrDataPenumpang[j].totalHarga;
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\tDAFTAR PENUMPANG ELANG AIR\t\t\t\t\t\t\t");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.print("No\t\t");
            System.out.print("Nama\t\t");
            System.out.print("Tujuan\t");
            System.out.print("Usia\t");
            System.out.print("Harga Tiket\t");
            System.out.print("Biaya Bagasi\t");
            System.out.println("Bayar\t");
            System.out.print(i+"\t\t");
            System.out.print(arrDataPenumpang[j].namaPenumpang + "\t\t");
            System.out.print(arrDataPenumpang[j].tujuanPenumpang+ "\t");
            System.out.print(arrDataPenumpang[j].usiaPenumpang + "\t");
            System.out.print(arrDataPenumpang[j].hargaTiketPenumpang + "\t");
            System.out.print(arrDataPenumpang[j].hargaBagasiPenumpang + "\t\t");
            System.out.println(arrDataPenumpang[j].totalHarga+ "\t");
            
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\tTotal\t\t"
                + totalTiket + "\t"
                + totalBagasi + "\t"
                + totalBayar);
    
        }
    }
}
