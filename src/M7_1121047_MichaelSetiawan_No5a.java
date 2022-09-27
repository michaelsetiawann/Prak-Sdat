/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class M7_1121047_MichaelSetiawan_No5a {

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 5, 4, 4},
            {2, 4, 7, 8, 5},
            {6, 5, 5, 9, 2},
            {12, 8, 3, 6,14},
            {3, 12, 5, 10, 15}
        };
        int panjang = 5;
        int lebar = 5;
        int x = 15;
        int count = 0;
        while (count != x + 1) {
            int result = 0;
            for (int i = 0; i < panjang; i++) {
                for (int j = 0; j < lebar; j++) {
                    if (count == matrix[i][j]) {
                        ++result;
                    }
                }
            }
            System.out.println("derajat keabuan " + count + " muncul " + result + " kali");
            count++;
        }

    }
}

