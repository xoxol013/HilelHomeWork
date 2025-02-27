package HM_7;

public class MatrixOperation {

    // Filling a matrix with random numbers
    public static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 50) + 1;
            }
        }
    }

    // Display the matrix on the screen in the form of a table
    public static void printMatrix(int[][] matrix) {
        System.out.println("Матриця 4x4:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Calculating the sum of elements in even rows
    public static int sumEvenRows(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    // Calculating the sum of elements in odd rows
    public static int sumOddRows(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    // Calculating the product of elements in even columns
    public static long productEvenColumns(int[][] matrix) {
        long product = 1;
        for (int j = 0; j < matrix[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    product *= matrix[i][j];
                }
            }
        }
        return product;
    }

    // Calculating the product of elements in odd columns
    public static long productOddColumns(int[][] matrix) {
        long product = 1;
        for (int j = 0; j < matrix[0].length; j++) {
            if (j % 2 != 0) {
                for (int i = 0; i < matrix.length; i++) {
                    product *= matrix[i][j];
                }
            }
        }
        return product;
    }

    // Checking of a matrix is a magic square
    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;
        int targetSum = 0;

        // We calculate the sum of the first row as the target
        for (int j = 0; j < n; j++) {
            targetSum += matrix[0][j];
        }

        // Checking rows
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != targetSum) {
                return false;
            }
        }

        // Checking columns
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != targetSum) {
                return false;
            }
        }

        // Checking the diagonals
        for (int i = 0; i < n; i++) {
            sumDiagonal1 += matrix[i][i];
            sumDiagonal2 += matrix[i][n - i - 1];
        }

        return sumDiagonal1 == targetSum && sumDiagonal2 == targetSum;
    }
}

