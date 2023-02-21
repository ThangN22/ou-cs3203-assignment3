
public class productOfArray { // product
	public static int arrayProduct (int[] inputArray) {
		int total = 1;
		for (int i = 0; i < inputArray.length; ++i) {
			total = total * inputArray[i];
		}
		return total;
	}
}
