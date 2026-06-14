package Activities;

public class Activity2 {
	public static void main (String[] args) {
		int[]	arr= {10, 77, 10, 44, -11, 10};
		//System.out.println("Original Array: " + arr);
		System.out.println("Result: " + isSumOfTensThirty(arr));
    
	}
		
		public static boolean isSumOfTensThirty(int[] arr) {
		int sum=0;

		for(int num	:	arr) {
			if (num==10) {
				sum+=num;
			}
		}
		return sum	== 30;
	}
}

