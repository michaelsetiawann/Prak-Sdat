/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class M7_1121047_MichaelSetiawan_No2 {

    static int N = 3;

    public static void print(int arrMatrix[][]) {
        for (int i = 0; i < arrMatrix.length; i++) {
            for (int j = 0; j < arrMatrix[i].length; j++) {
                System.out.print(arrMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void transpose(int A[][], int B[][]) {
        int i, j;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                B[i][j] = A[j][i];
            }
        }
    }

    public static void main(String[] args) {
        int arrMatrik1[][] = {
            {1, 1, 1},
            {2, 2, 2},
            {3, 3, 3},
            {4, 4, 4}
        };

        int arrMatrik2[][] = new int[N][N], i, j;

        transpose(arrMatrik1, arrMatrik2);

        System.out.println("before transpose : ");
        print(arrMatrik1);
        System.out.println("after transpose : ");
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.print(arrMatrik2[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
