package li.jesse.code.util;

import org.junit.Test;

public class Matrix2DUtilTest {

    int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    @Test
    public void testPrintMatrix2D() {
        Matrix2DUtil.printMatrix2D(matrix);
    }

    @Test
    public void testMatrix2DUtil() {
        Matrix2DUtil.printMatrix2D(Matrix2DUtil.rotateMatrix2D(matrix));
    }
}
