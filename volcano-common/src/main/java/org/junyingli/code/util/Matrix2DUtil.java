package org.junyingli.code.util;

public class Matrix2DUtil {

    public static void printMatrix2D(int[][] matrix) {

    }

    public static int[][] rotateMatrix2D(int[][] matrix) {
        int length = matrix[0].length;
        int width = matrix.length;
        int [][] matrix2 = new int[width][length];

        for (int i = 0; i < length; i++) {
            for (int j = width - 1; j >= 0; j--) {
                System.out.println(matrix[j][i]);
                for (int k = 0; k < width; k++) {
                    matrix2[i][k] = matrix[j][i];
                }

            }
        }

        return matrix2;
    }
}
