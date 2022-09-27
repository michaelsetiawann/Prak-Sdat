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
 * @author Michael
 */
public class no1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        ArrayList<Integer> arrUmur = new ArrayList<Integer>();
        for (int i = 0; i < input; i++) {
            int umur = scan.nextInt();
            arrUmur.add(umur);
        }
        System.out.println("========================");
        
        Collections.sort(arrUmur);

        int median = arrUmur.size() / 2;
        if (arrUmur.size() % 2 == 0) {
            median = (arrUmur.get(arrUmur.size() / 2) + arrUmur.get(arrUmur.size() / 2 - 1)) / 2;
        } else {
            arrUmur.set(arrUmur.size() / 2, arrUmur.get(arrUmur.size() / 2));
        }

        int count = 0;
        for (int i = 0; i < arrUmur.size(); i++) {
            int banyakUmur = (int) arrUmur.get(i);

            if (banyakUmur == median) {
                count++;
            }
        }
        System.out.println(median);
        System.out.println(count);

    }
}

