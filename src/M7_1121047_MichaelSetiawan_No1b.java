/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class M7_1121047_MichaelSetiawan_No1b {

    public static void print(int arrMatrix[][]) {
        for (int i = 0; i < arrMatrix.length; i++) {
            for (int j = 0; j < arrMatrix[i].length; j++) {
                System.out.print(arrMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row, col;
        boolean count = true;

        int arrMatrix[][] = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 6}
        };

        row = arrMatrix.length;
        col = arrMatrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j && arrMatrix[i][j] != 1) {
                    count = false;
                    break;
                }
                if (i != j && arrMatrix[i][j] != 0) {
                    count = false;
                    break;
                }
            }
        }

        if (count) {
            print(arrMatrix);
            System.out.println("Matrix identitas");
        } else {
            print(arrMatrix);
            System.out.println("Is not Matrix identitas");
        }
    }
}

