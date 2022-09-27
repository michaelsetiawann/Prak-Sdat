/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakweek5;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class RekursifNo3 {

    public static int cariData(int cari, int[] data, int panjang) {
        if (panjang != 0) {
            if (data[panjang - 1] != cari) {
                cariData(cari, data, panjang - 1);
            } else {
                System.out.println("data berhasil ditemukan");
            }
        } else {
            System.out.println("data tidak berhasil ditemukan");
        }
        return panjang;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] data = {1, 2, 3, 4, 5};
        int panjang = data.length;
        System.out.println("masukan data yang ingin di cari");
        int cari = scan.nextInt();
        cariData(cari, data, panjang);
    }
}

