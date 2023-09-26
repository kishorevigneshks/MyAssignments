package Assignments;

public class FindOddNumbers {

	public static void main(String[] args) {
		// odd numbers from 1 to 10
		System.out.println("Odd numbers between 1 to 10 are:");
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		// Even numbers from 1 to 10
		System.out.println("Even numbers between 1 to 10 are:");
		for (int j = 1; j < 10; j++) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
		}

	}
}
