/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanUTS;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
class Barang {

    String nama;
    double harga[] = new double[3];
    double hargaRata;

    public Barang(String nama, double h1, double h2, double h3) {
        this.nama = nama;
        this.harga[0] = h1;
        this.harga[1] = h2;
        this.harga[2] = h3;
    }
}

public class coba {
    static Barang[] barang = new Barang[7];

    public static double average(double[] harga) {
        int result = 0;
        for (int i = 0; i < harga.length; i++) {
            result += (harga[i] / harga.length);
        }
        return result;
    }

    public static void searchRange(double x, double y, int i) {
        if (barang[i].hargaRata >= x && barang[i].hargaRata <= y) {
            System.out.println(barang[i].nama + " dengan harga rata-rata " + barang[i].hargaRata);
            searchRange(x, y, i + 1);
        } else if(i == barang.length) {
            //menghentikan rekursif
        } else {
            searchRange(x, y, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        barang[0] = new Barang("A", 90.871, 7.090, 6.303);
        barang[1] = new Barang("B", 26.212, 75.438, 51.086);
        barang[2] = new Barang("C", 63.846, 10.926, 48.241);
        barang[3] = new Barang("D", 88.821, 73.407, 73.890);
        barang[4] = new Barang("E", 57.043, 95.811, 8.165);
        barang[5] = new Barang("F", 73.368, 49.169, 74.037);
        barang[6] = new Barang("G", 3.141, 33.832, 79.579);

        for (int i = 0; i < barang.length; i++) {
            barang[i].hargaRata = average(barang[i].harga);
        }
        
        System.out.println("==== mencari item ====");
        System.out.print("harga batas bawah: ");
        int bawah = in.nextInt();
        System.out.print("harga batas atas: ");
        int atas = in.nextInt();
        System.out.println("barang dengan rata-rata "+bawah+" - "+atas+":");
        searchRange(bawah, atas, 0);
    }
}
