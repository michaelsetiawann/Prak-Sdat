/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanUas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class no2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pilih = scan.nextInt();
        int n = scan.nextInt();

        if (pilih == 1) {
            if (n > 0) {
                ArrayList<Integer> integer = new ArrayList<Integer>();
                for (int i = 0; i < n; i++) {
                    int a = scan.nextInt();
                    integer.add(a);
                }
                System.out.println("===================================");
                Collections.sort(integer, Collections.reverseOrder());
                integer.forEach((num) -> {
                    System.out.print(num + " ");
                });
                System.out.print("\n");
                Collections.sort(integer);
                integer.forEach((num) -> {
                    System.out.print(num + " ");
                });
            } else if (n == 0) {
                System.out.print("Array Kosong");
            }

        } else if (pilih == 2) {
            if (n > 0) {
                ArrayList<Character> Character = new ArrayList<Character>();
                for (int i = 0; i < n; i++) {
                    char c = scan.next().charAt(0);
                    Character.add(c);
                }
                System.out.println("===================================");
                Collections.reverse(Character);
                System.out.println(Character + " ");
                Collections.sort(Character);
                System.out.print(Character + " ");

            } else if (n == 0) {
                System.out.println("Array Kosong");
            }
        } else if (pilih == 3) {
            if (n > 0) {
                ArrayList<String> string = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    String a = scan.next();
                    string.add(a);
                }

                System.out.println("===================================");
                Collections.reverse(string);
                System.out.print(string + " ");
                System.out.print("\n");
                Collections.sort(string);
                System.out.print(string + " ");
            } else if (n == 0) {
                System.out.println("Array Kosong");
            }

        }

    }
}
