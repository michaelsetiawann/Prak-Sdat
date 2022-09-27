/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakweek8;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class kuis2 {

    public static void pembelahan(int bakteri, int i) {
        if (bakteri >= 1000) {
            pengurangan(bakteri, i, 0, 1, i);
        } else {
            System.out.print(i + "\t");
            ++i;
            if (i % 2 != 0) {
                System.out.print("-");
            } else {
                System.out.print(bakteri + " * 2");
                bakteri *= 2;
            }
            System.out.println("\t" + bakteri);
            pembelahan(bakteri, i);
        }
    }

    public static void pengurangan(int bakteri, int i, int a, int b, int start) {
        if (i == start) {
            pengurangan(bakteri, i + 1, a, b, start);
        } else {
            int temp = b;
            b = a + b;
            a = temp;
            if (bakteri < b) {
                System.out.println("return value: " + bakteri);
            } else {
                bakteri -= b;
                System.out.println(i + "\t" + bakteri + " - " + b + "\t" + b + "\t" + bakteri);
                ++i;
                pengurangan(bakteri, i, a, b, start);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukan jumlah awal bakteri: ");
        int input = in.nextInt();
        pembelahan(input, 1);
    }
}
