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
 * @author Michael
 */
public class UAS_No2_1121047_MichaelSetiawan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> telepon = new HashMap<>();
        
        int panjang = scan.nextInt();
        for (int i = 0; i < panjang; i++) {
            String nama = scan.next();
            String nomer = scan.next();

            if (nama.length() <= 15 && nomer.length() > 8 || nomer.length() < 8) {
                System.out.println();
            } else {
                telepon.put(nama, nomer);
            }
        }
        for (int i = 0; i < telepon.size(); i++) {
            String nama = scan.next();
            if (telepon.get(nama) != null) {
                System.out.println(nama + "= " + telepon.get(nama));
            } else {
                System.out.println("");
            }
        }
    }
}
