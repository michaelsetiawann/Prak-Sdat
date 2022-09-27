/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class M7_1121047_MichaelSetiawan_No3 {

    public static void print(int arrMatrix[][]) {
        for (int i = 0; i < arrMatrix.length; i++) {
            for (int j = 0; j < arrMatrix[i].length; j++) {
                System.out.print(arrMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean isToeplitz(int[][] matrix) {
        boolean count = true;
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < m; i++) {
            int x = 0, y = i;
            int curr = matrix[x][y];
            x++;
            y++;
            while (x < n && y < m) {
                if (matrix[x][y] != curr) {
                    count = false;
                    break;
                }
                x++;
                y++;
            }

        }
        for (int i = 1; i < n; i++) {
            int x = i, y = 0;
            int curr = matrix[x][y];
            x++;
            y++;
            while (x < n && y < m) {
                if (matrix[x][y] != curr) {
                    count = false;
                    break;
                }
                x++;
                y++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[][] arrMatrix = new int[][]{
            {2, 1, 3, 4},
            {5, 2, 1, 3},
            {9, 5, 2, 1}
        };
        if (isToeplitz(arrMatrix)) {
            print(arrMatrix);
            System.out.println("Matrix Toepliz ");
        } else {
            print(arrMatrix);
            System.out.println("Is not matrix Toepliz ");

        }

    }
}

