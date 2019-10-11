
public class Main {
	
	public static void main(String args[]) {
		System.out.println("dcp60");
		
		int[] testSet1 = {15,5,20,10,35,15,10};
		SplitAndSumMaskedArray(20, testSet1);
		
		int loops = (int) Math.pow(2, testSet1.length);
		
		for (int i = 0; i < loops; i++) {		
			if (SplitAndSumMaskedArray(i, testSet1)) {
				System.out.printf("GOT ONE AT BITMASK: %d\n\n", i);
			}
						
		}
	}
	
	
	/** given an integer representation of a bitmask and an array of integers
	 *  calculate the sum of the integers in the 0's position and the sum
	 * of the integers in the 1's position and place that in the return array.
	 */
	 public static boolean SplitAndSumMaskedArray(int bitMask, int[] ia) {

		int sum0 = 0;			// running sum of values represented by 0's in the bitmask
		int sum1 = 0;			// running sum of values represented by 1's in the bitmask
		String a0 = "";
		String a1 = "";
		
		for (int j = 0; j < ia.length; j++) { //loop thru digits and calculate sums
			if ((((int) Math.pow(2,  j)) & bitMask) > 0) {
				a0 = a0 + " " + Integer.toString(ia[j]);
				sum0 = sum0 + ia[j];
			} else {
				a1 = a1 + " " + Integer.toString(ia[j]);
				sum1 = sum1 + ia[j];
			}
			
		}
		
		if (sum0 == sum1) {
			System.out.printf("a0=%s\t",a0);
			System.out.printf("a1=%s\n",a1);
			System.out.printf("sum0=%d  sum1=%d\n", sum0, sum1);
		}
		
		if (sum0 == sum1) return true;
		return false;	
	}

}
