
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class M7_1121047_MichaelSetiawan_No4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arrMatrix = {
            {3, -4, 6, -5, 1},
            {1, -2, 8, -4, -2},
            {3, -8, 9, 3, 1},
            {-7, 3, 4, 2, 7},
            {-3, 7, -5, 7, -6}
        };
        int sumMax = 0;
        int rowMax = 0;
        int colMax = 0;
        System.out.print("masukan K: ");
        int k = in.nextInt();
        int row = arrMatrix.length;
        int cols = arrMatrix[0].length;
        for (int i = 0; i <= (row - k); i++) {
            for (int j = 0; j <= (cols - k); j++) {
                int sum = 0;
                for (int l = i; l < i + k; l++) {
                    System.out.println("i+k:" + (i + k));
                    for (int m = j; m < j + k; m++) {
                        System.out.println("\tj+k:" + (j + k));
                        sum += arrMatrix[l][m];
                    }
                }
                if (sum > sumMax) {
                    sumMax = sum;
                    rowMax = i;
                    colMax = j;
                }
            }
        }
        for (int i = rowMax; i < rowMax + k; i++) {
            for (int j = colMax; j < colMax + k; j++) {
                System.out.print(arrMatrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

