package by.htp.lesson4;

public class Task01SwitchMaxMin {

	public static void main(String[] args) {
		int[] array = { 5, 15, 25, 6, 0, 1, 9, 3 };
		
		System.out.println("Before:");
		for (int x : array) {
			System.out.print(x + ", ");
		}
		
		int tmp = 0;
		int min = array[0];
		int minIndex = 0;
		int max = array[0];
		int maxIndex = 0;
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				minIndex = i;
			}
			if (array[i] > max) {
				max = array[i];
				maxIndex = i;
			}
		}
		
		tmp = array[maxIndex];
		array[maxIndex] = array[minIndex];
		array[minIndex] = tmp;
		
		System.out.println();
		System.out.println("After:");
		for (int x : array) {
			System.out.print(x + ", ");
		}

	}

}
