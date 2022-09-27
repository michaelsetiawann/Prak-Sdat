/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class UAS_No3_1121047_MichaelSetiawan {

    public static void cekBarang(HashMap barang_check, int key_check) {
        if (barang_check.get(key_check) != null) {
            System.out.println(barang_check.get(key_check));
        } else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, String> noBarang = new HashMap<>();

        int panjang = scan.nextInt();
        for (int i = 0; i < panjang; i++) {
            String barang = scan.nextLine();

            String[] arrBarang = barang.split(" ");
            int nomerBarang = Integer.parseInt(arrBarang[0]);
            
            noBarang.put(nomerBarang, arrBarang[1]);
        }

        int nomerBarang = scan.nextInt();
        cekBarang(noBarang, nomerBarang);

        System.out.println(noBarang.size());
    }
}
