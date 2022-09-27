/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class M7_1121047_MichaelSetiawan_No5b {

    public static void main(String[] args) {
        int[][] arrMatrix = {
            {7, 8, 10, 12, 14},
            {2, 0, 1, 8, 15},
            {6, 9, 5, 10, 9},
            {12, 8, 3, 6, 11},
            {1, 10, 11, 14, 13}
        };
        double[][] gaussian = {
            {(0.0625), (0.125), (0.0625)},
            {(0.125), (0.25), (0.125)},
            {(0.0625), (0.125), (0.0625)}
        };
        int rows = arrMatrix.length;
        int cols = arrMatrix[0].length;
        int gRows = gaussian.length;
        int gCols = gaussian[0].length;
        double[][] result = new double[gRows][gCols];
        for (int i = 0; i <= rows - gRows; i++) {
            for (int j = 0; j <= cols - gCols; j++) {
                int row = 0;
                double total = 0;
                for (int k = i; k < gRows + i; k++) {
                    int col = 0;
                    for (int l = j; l < gCols + j; l++) {
                        double[][] temp = new double[gRows][gCols];
                        total += arrMatrix[k][l] * gaussian[row][col];
                        col++;
                    }
                    row++;
                }
                result[i][j] = total;
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}

