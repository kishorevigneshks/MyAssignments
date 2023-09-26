package Assignments;

public class fibonacciSeries {

	public static void main(String[] args) {
		// input range=8(i.e., count 8)
		// Output: 0,1,1,2,3,5,8 and 13
		// count=8
		int n1 = 0, n2 = 1, n3, count = 5;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 0; i <= count; i++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
	}

}
