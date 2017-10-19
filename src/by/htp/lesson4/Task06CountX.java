package by.htp.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task06CountX {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int[][] matrix = { { 24, 1, 2, 3, 4 }, { 5, 6, 1, 18, 9 }, { 10, 11, 1, 23, 14 }, { 15, 1, 17, 8, 19 },
				{ 20, 21, 1, 3, 0 } };
		print(matrix);
		System.out.println();
		System.out.println();

		System.out.println("Which number to search?");
		int x = Integer.parseInt(in.readLine());

		int count = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[j][i] == x) {
					count++;
				}
			}
		}

		System.out.println(count);
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
