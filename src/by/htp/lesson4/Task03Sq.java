package by.htp.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task03Sq {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {

		int[] arrayA = initializeArray(20);

		int[] arrayB = resultArray(arrayA);

		for (int x : arrayB) {
			System.out.print(x + ", ");
		}

		int sqSum = sq(arrayB);

		System.out.println();
		System.out.println("Sum of squares is " + sqSum);
	}

	public static int[] initializeArray(int arraySize) throws Exception {

		int[] array = new int[arraySize];
		System.out.println("Enter " + arraySize + " positive or negative numbers");

		for (int i = 0; i < arraySize; i++) {
			array[i] = Integer.parseInt(in.readLine());
		}

		return array;
	}

	public static int[] resultArray(int arrayA[]) {
		int count = 0;
		int[] arrayB = new int[19];
		for (int i = 2; i < arrayA.length; i += 2) {
			if (arrayA[i] > 0) {
				arrayB[count] = arrayA[i];
				count++;
			}
		}
		return arrayB;
	}

	public static int sq(int[] array) {
		int sum = 0;
		for (int x : array) {
			sum += x * x;
		}
		return sum;
	}

}
