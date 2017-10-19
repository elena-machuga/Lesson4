package by.htp.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task04Matrix {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int[][] matrix = { { 0, 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14 }, { 15, 16, 17, 18, 19 } };
		print(matrix);
		System.out.println();
		System.out.println();

		System.out.println("Which of four lines do you want to switch?");
		int first = Integer.parseInt(in.readLine());
		int second = Integer.parseInt(in.readLine());

		int temp;
		for (int i = 0; i < matrix[first - 1].length; i++) {
			temp = matrix[first - 1][i];
			matrix[first - 1][i] = matrix[second - 1][i];
			matrix[second - 1][i] = temp;
		}

		print(matrix);

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
	}

}
