


public class reverseArray { // reverse
	public static void reverse(int[] inputArray) {
	    int left = 0;
	    int right = inputArray.length - 1;

	    while( left < right ) {

	        int temp = inputArray[left];
	        inputArray[left] = inputArray[right];
	        inputArray[right] = temp;

	        
	        left++;
	        right--;
	    }
	}
}
