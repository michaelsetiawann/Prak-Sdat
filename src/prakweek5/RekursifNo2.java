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
public class RekursifNo2 {

    public static String reverseString(String word) {
        if (word == null || word.length() < 1) {
            return word;
        } else {
            return reverseString(word.substring(1)) + word.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Kata : ");
        String word = scan.next();
        System.out.println("Before :" + word);
        String newWord = reverseString(word);
        System.out.println("After :" + newWord);

    }
}
