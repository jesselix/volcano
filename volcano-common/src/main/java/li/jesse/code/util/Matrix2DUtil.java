package li.jesse.code.util;

public class Matrix2DUtil {

    public static void printMatrix2D(int[][] matrix) {
        int length = matrix[0].length;
        int width = matrix.length;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix2D(int[][] matrix) {
        int length = matrix[0].length;
        int width = matrix.length;
        int [][] matrix2 = new int[length][width];

        for (int i = 0; i < length; i++) {
            int k = 0;
            for (int j = width - 1; j >= 0; j--) {
                matrix2[i][k] = matrix[j][i];
                k++;
            }
        }

        return matrix2;
    }
}
