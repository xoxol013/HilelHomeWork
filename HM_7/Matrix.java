package HM_7;

public class Matrix {

        public static void main(String[] args) {

            // Creating a matrix
            int[][] matrix = new int[4][4];

            // Fill the matrix with random numbers
            MatrixOperation.fillMatrix(matrix);

            // Output a matrix
            MatrixOperation.printMatrix(matrix);

            // Calculate the sum of even and odd rows
            int evenRowSum = MatrixOperation.sumEvenRows(matrix);
            int oddRowSum = MatrixOperation.sumOddRows(matrix);

            // Calculate the product of even odd columns
            long evenColumnProduct = MatrixOperation.productEvenColumns(matrix);
            long oddColumnProduct = MatrixOperation.productOddColumns(matrix);

            System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + evenRowSum);
            System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + oddRowSum);
            System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + evenColumnProduct);
            System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + oddColumnProduct);

            // Checking if a matrix is a magic square
            if (MatrixOperation.isMagicSquare(matrix)) {
                System.out.println("Матриця є магічним квадратом.");
            } else {
                System.out.println("Матриця не є магічним квадратом.");
            }

        }
    }


