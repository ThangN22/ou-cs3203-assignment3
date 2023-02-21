
public class sumOfArray { // sum
	public static int arraySum (int[] inputArray) {
		int total = 0;
		for (int i = 0; i < inputArray.length; ++i) {
			total = total + inputArray[i];
		}
		return total;
	}
	
}
