package arrays;

public class Multiplication_2D {

	public static void main(String[] args) {

		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] matrix2 = { { 7, 8 }, { 9, 10 }, { 11, 12 } };

		int[][] product = multiplyMatrices(matrix1, matrix2);

		printMatrix(product);
	}

	public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
		int rows1 = matrix1.length;
		int cols1 = matrix1[0].length;
		int rows2 = matrix2.length;
		int cols2 = matrix2[0].length;

		if (cols1 != rows2) {
			throw new IllegalArgumentException(
					"Matrix1 columns: " + cols1 + " did not match Matrix2 rows: " + rows2 + ".");
		}

		int[][] result = new int[rows1][cols2];

		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols2; j++) {
				for (int k = 0; k < cols1; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		return result;
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
}