
public class FindThirdLargestNumber {

	public static void main(String[] args) {
        int[] arr = {1,5,8,6,4,3,7,8,7,5,34,3};
		
		int firstLarge = Integer.MIN_VALUE;
		int secondLarge = Integer.MIN_VALUE;
		int thirdLarge = Integer.MIN_VALUE;
		
		for(int i = 0; i <arr.length -1; i++){
			if(arr[i] > firstLarge) {
				thirdLarge = secondLarge;
				secondLarge = firstLarge;
				firstLarge = arr[i];
			}else if(arr[i] > secondLarge && arr[i] != firstLarge) {
				thirdLarge = secondLarge;
				secondLarge = arr[i];
			}else if(arr[i] > thirdLarge && arr[i] != secondLarge) {
				thirdLarge = arr[i];
			}
			}
		
		if(thirdLarge == Integer.MIN_VALUE) {
			System.out.println("no third large");
		}else {
			System.out.println("Third Large"+ thirdLarge);
		}
		}
}
