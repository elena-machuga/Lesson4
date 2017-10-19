package by.htp.lesson4;

public class Task05Matrix {

	public static void main(String[] args) {

		int[][] matrix = { { 24, 1, 2, 3, 4 }, { 5, 6, 7, 18, 9 }, { 10, 11, 12, 23, 14 }, { 15, 16, 17, 8, 19 },
				{ 20, 21, 22, 3, 0 } };
		print(matrix);
		System.out.println();
		System.out.println();

		int[] max = new int[5];

		for (int i = 0; i < 5; i++) {
			int tmax = matrix[0][i];
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[j][i] > tmax) {
					tmax = matrix[j][i];
				}
			}
			max[i] = tmax;
		}

		for (int x : max) {
			System.out.print(x + ", ");
		}

	}

	public static void print(int[][] matrix) {
		for (int x : matrix[0]) {
			System.out.print(x + ", ");
		}
		System.out.println();
		for (int x : matrix[1]) {
			System.out.print(x + ", ");
		}
		System.out.println();
		for (int x : matrix[2]) {
			System.out.print(x + ", ");
		}
		System.out.println();
		for (int x : matrix[3]) {
			System.out.print(x + ", ");
		}
		System.out.println();
		for (int x : matrix[4]) {
			System.out.print(x + ", ");
		}
	}

}
