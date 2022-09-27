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
public class kuisGlen2 {
        public static void pembelahanBakteri(int jmlh, int i) {
        if (jmlh >= 1000) {// saat jumlah bakteri lebih dari 1000
            penguranganFibonacci(jmlh, i, i, 0, 1);
        } else {
            i++;
            if (i % 2 == 0) {// menghitung saat iterasi genap
                jmlh = jmlh * 2;
            }
            pembelahanBakteri(jmlh, i);
        }
    }

    public static void penguranganFibonacci(int jmlh, int indexAwal, int i, int num1, int num2) {// indexAwal digunakan untuk mendetaksi rekursif pertama
        if (i == indexAwal) {// saat rekursif pertama fibonacci
            jmlh = jmlh - 1;
            penguranganFibonacci(jmlh, indexAwal, i + 1, num1, num2);
        } else {
            int temp = num2;
            num2 = num1 + num2;
            num1 = temp;
            if (jmlh > num2) {
                jmlh = jmlh - num2;
                i++;
                penguranganFibonacci(jmlh, indexAwal, i, num1, num2);
            } else {
                System.out.println("return value: "+jmlh);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("jumlah awal: ");
        int jmlh = in.nextInt();
        pembelahanBakteri(jmlh, 1);
    }
}
