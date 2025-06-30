package StriverArrays;

public class SetMatrixZerosBetter {
    public static void main(String[] args) {
        int[][] matrix={
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        setZeros(matrix);
        printMatrix(matrix);
    }
    public static void setZeros(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] rowZero = new int[rows];
        int[] colZero = new int[cols];

        // Step 1: Record rows and columns to be zeroed
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j]==0){
                    rowZero[i]=1;
                    colZero[j]=1;

                }
            }
        }

        // Step 2: Apply the zeros
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowZero[i]==1 || colZero[j]==1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
