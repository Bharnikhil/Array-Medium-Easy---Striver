package StriverArrays;

public class SetMatrixZeroBrute {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        traverse(matrix);
        setZero(matrix);

        System.out.println("Matrix after setting zeros:");
        printMatrix(matrix);
        
    }
    public static void traverse(int[][] matrix){
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                if(matrix[i][j]==0){
                    setRowNeg(matrix,i);
                    setColNeg(matrix,j);
                    
                }
                
            }
            
        }
    }
    public static void setRowNeg(int[][] matrix, int row){
        for (int i = 0; i < matrix[row].length; i++) {
            if(matrix[row][i]!=0){
                matrix[row][i]=-1;

            }
            
        }
    }

    public static void setColNeg(int[][] matrix, int col){
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][col]!=0){
                matrix[i][col]=-1;

            }

        }
    }
    public static void setZero(int[][] matrix){
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
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
