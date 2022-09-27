/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakweek5;

/**
 *
 * @author Michael
 */
public class RekursiNo1 {

    public static int reverseAngka(int[] arrAngka, int awal, int akhir) {
        int reverse = 0;
        if (awal < akhir) {
            int temp = arrAngka[awal];
            arrAngka[awal] = arrAngka[akhir];
            arrAngka[akhir] = temp;

            reverse = reverseAngka(arrAngka, awal + 1, akhir - 1);
        } 
        return reverse;
    }

    public static void main(String[] args) {

        int[] arrAngka = {4, 5, 6, 7};
        System.out.println("Before");
        for (int i = 0; i < arrAngka.length; i++) {
            System.out.print(arrAngka[i] + ", ");
        }
        reverseAngka(arrAngka, 0, arrAngka.length - 1);
        System.out.println("\nAfter");
        for (int i = 0; i < arrAngka.length; i++) {
            System.out.print(arrAngka[i] + ", ");
        }

    }
}
