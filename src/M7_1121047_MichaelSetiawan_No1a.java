/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class M7_1121047_MichaelSetiawan_No1a {

    public static void print(int arrMatrix[][]) {
        for (int i = 0; i < arrMatrix.length; i++) {
            for (int j = 0; j < arrMatrix[i].length; j++) {
                System.out.print(arrMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row, col, size, count = 0;

        int arrMatrix[][] = {
            {4, 0, 0},
            {0, 5, 0},
            {0, 0, 6}
        };

        row = arrMatrix.length;
        col = arrMatrix[0].length;

        size = row * col;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arrMatrix[i][j] == 0) {
                    count++;
                }
            }
        }

        if (count > (size / 2)) {
            print(arrMatrix);
            System.out.println("Sparse Matrix");
        } else {
            System.out.println("Is not sparse matrix");
        }
    }
}
