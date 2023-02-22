
import java.util.Scanner;

public class Main { // This is main
	public static void main(String[] args) {
		int[] arr = new int[4];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter four numbers");
		for(int i = 0; i < arr.length; ++i) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		int total = sumOfArray.arraySum(arr);
		int product = productOfArray.arrayProduct(arr);
		
		System.out.print("total: " + total + System.lineSeparator() + 
				"product: " + product + System.lineSeparator());
		reverseArray.reverse(arr);
		System.out.print("reversed array: ");
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
	}
}
