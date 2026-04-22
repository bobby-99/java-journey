package gfg.Arrays;

public class AddMatrices {
    public void Addition(int[][] matrixA, int[][] matrixB) {
        // code here
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] += matrixB[i][j];
            }
        }
    }
}
