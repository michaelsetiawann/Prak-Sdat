/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakweek1;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Soal1 {
    static Scanner scan = new Scanner(System.in);
    static String cek = "";
    static double panjang, lebar, alas, tinggi, diagonal1, diagonal2, jariJari;
    static double[] sisi =  new double[3];
  
    public static void Persegi(){
        System.out.println("Masukan sisi:");
        sisi[0] = scan.nextDouble();
        System.out.println("Keliling:  " + (sisi[0]*4)+ "cm");
        System.out.println("Luas: " + (sisi[0]*sisi[0]) + "cm");
        cek();
    }
    public static void PersegiPanjang(){
        System.out.println("Masukan Panjang:");
        panjang = scan.nextDouble();
        System.out.println("Masukan Lebar:");
        lebar = scan.nextDouble();
        System.out.println("Keliling: " + (2*panjang + 2*lebar) + "cm");
        System.out.println("Luas: " + (panjang * lebar) + "cm");
        cek();
    }
    public static void JajaranGenjang(){
        System.out.println("Masukan Panjang:");
        panjang = scan.nextDouble();
        System.out.println("Masukan Lebar:");
        lebar = scan.nextDouble();
        System.out.println("Masukan Alas:");
        alas = scan.nextDouble();
        System.out.println("Masukan Tinggi:");
        tinggi = scan.nextDouble();
        System.out.println("Keliling: " + (2*panjang + 2*lebar)+ "cm");
        System.out.println("Luas: " + alas*tinggi + "cm");
        cek();
    }
    public static void Trapesium(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukan sisi " + (i+1) + ":" );
            sisi[i] = scan.nextDouble();
        }
        System.out.println("Masukan Tinggi : ");
        tinggi = scan.nextDouble();
        
        System.out.println("Keliling : " + (sisi[0]+sisi[1]+sisi[2]+tinggi) + "cm");
        System.out.println("Luas : " + ((sisi[0]+sisi[1])*tinggi/2) + "cm");
        cek();
    }
    public static void BelahKetupat(){
        System.out.println("Masukan Sisi: ");
        sisi[0] = scan.nextDouble();
        System.out.println("Masukan Diagonal 1:");
        diagonal1 = scan.nextDouble();
        System.out.println("Masukan Diagonal 2:");
        diagonal1 = scan.nextDouble();
        System.out.println("Keliling : " + (4*sisi[0]) + "cm");
        System.out.println("Luas : " + (diagonal1*diagonal2/2) + "cm");
        cek();
    }
    public static void LayangLayang(){
        System.out.println("Masukan Panjang:");
        panjang = scan.nextDouble();
        System.out.println("Masukan Lebar:");
        lebar = scan.nextDouble();
        System.out.println("Masukan Diagonal 1:");
        diagonal1 = scan.nextDouble();
        System.out.println("Masukan Diagonal 2:");
        diagonal1 = scan.nextDouble();
        System.out.println("Keliling : " + (2*panjang + 2*lebar)+ "cm");
        System.out.println("Luas : " + (diagonal1*diagonal2/2) + "cm");
        cek();
    }
     public static void Segitiga(){
         for (int i = 0; i < 2; i++) {
             System.out.println("Masukan sisi " + (i+1) + ":" );
             sisi[i] = scan.nextDouble();
         }
        System.out.println("Masukan Alas:");
        alas = scan.nextDouble();
        System.out.println("Masukan Tinggi:");
        tinggi = scan.nextDouble();
        System.out.println("Keliling : " + (sisi[0]+sisi[1]+alas) + "cm");
        System.out.println("Luas : " + (alas*tinggi/2) + "cm");
        cek();
    }
    public static void Lingkaran(){
        System.out.println("Masukan Jari-jari : ");
        jariJari = scan.nextDouble();
        System.out.println("Keliling : " + (2*Math.PI*jariJari) + "cm");
        System.out.println("Luas : " + (Math.PI * jariJari * jariJari) + "cm");
        
        cek();
    } 
    public static void cek(){
        scan.nextLine();
        System.out.println("Mau lanjut apa tidak ?(ya/tidak)");
        cek = scan.nextLine().toLowerCase();
    }
    
    public static void main(String[] args) {
        String bangunDatar;
         System.out.println("1.Persegi\n"
                    +"2.Persegi Panjang\n" 
                    +"3.Jajaran Genjang\n"
                    +"4.Trapesium\n"
                    +"5.Belah Ketupat\n"
                    +"6.Layang-layang\n"
                    +"7.Segitiga\n"
                    +"8.Lingkaran");
        do {
            System.out.println("Nama bangun datar : ");
            bangunDatar = scan.nextLine().toLowerCase();
            switch (bangunDatar) {
                case "persegi":
                    Persegi();
                    break;
                case "persegi panjang":
                    PersegiPanjang();
                    break;
                case "jajaran genjang":
                    JajaranGenjang();
                    break;
                case "trapesium":
                    Trapesium();
                    break;
                case "belah ketupat":
                    BelahKetupat();
                    break;
                case "layang layang":
                    LayangLayang();
                    break;
                case "segitiga":
                    Segitiga();
                    break;
                case "lingkaran":
                    Lingkaran();
                    break;
                default:
                   bangunDatar = "";
                   System.out.println("Nama Bangun datar tidak ada");
                   break;
            }
            
        } while (bangunDatar!= "" && cek.equals("ya"));
        
    }
    
}
