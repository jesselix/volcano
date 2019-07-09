package org.junyingli.code.util;

import org.junit.Test;

public class Matrix2DUtilTest {

    @Test
    public void testPrintMatrix2D() {

    }

    @Test
    public void testMatrix2DUtil() {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        Matrix2DUtil.rotateMatrix2D(matrix);
    }
}
