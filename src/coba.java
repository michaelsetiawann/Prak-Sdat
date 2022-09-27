
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class coba {
    public static int cek (int[] data, int _cari){
        
        for (int i = 0; i < data.length; i++) {
            if (data[i] == _cari) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int[] dataA = {4, 9, 4, 2, 3, 1, 3, 2, 6};
        int[] dataB = {1, 3, 7, 8, 5, 3, 1, 4, 6};
        System.out.println("Pilih mau A/B");
        String pilih = masuk.next().toUpperCase();
        System.out.print("masukan angka yang dicari: ");
        int cari = masuk.nextInt();
        int indexData;
        if (pilih.equals("A")) {
            indexData = cek(dataA, cari);
        } else {
            indexData = cek(dataB, cari);
        }
        System.out.println("Data ditemukan di Array " + pilih + " di index " + indexData);
    }
}
