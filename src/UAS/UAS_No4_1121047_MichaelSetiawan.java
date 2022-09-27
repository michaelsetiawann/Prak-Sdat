/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Lenovo
 */
public class UAS_No4_1121047_MichaelSetiawan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {

            List<String> kata = new ArrayList<>();
             
            List<String> kataToLower = kata.stream() 
                .map(String::toLowerCase) 
                .collect(Collectors.toList());

            String inputKata = in.next();
            String password = "";

            for (int j = 0; j < inputKata.length(); j++) {
                kata.add(inputKata.charAt(j));
            }
            for (int k = 1; k < kata.size(); k++) {
                password += kata.get(k);
            }

            if (kataToLower.get(0).equals('a') || kataToLower.get(0).equals('i') || kataToLower.get(0).equals('u') || kataToLower.get(0).equals('e')|| kataToLower.get(0).equals('o')) {
                password += "kuy";
            } else {
                password += inputKata.charAt(0) + "uy";
            }

            for (int l = 0; l < word.size(); l++) {
                if (kataToLower.get(l).equals('a') || kataToLower.get(l).equals('i') || kataToLower.get(l).equals('u')|| kataToLower.get(l).equals('e')|| kataToLower.get(l).equals('0')) {
                    count += 1;
                }
            }

            password += count;

            System.out.println(password);
        }
    }
}
