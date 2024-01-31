package AssignmentArray21;

public class SumOfArrayElement {

	public static void main(String[] args) {
		int[] numbers = { 2, 9, 0, 5, 12, 25, 22, 9, 8, 12 };
		int sum=0;
		for (int number : numbers) {
			sum = sum + number;
		}
		System.out.println("Sum = " + sum);
	}

}
