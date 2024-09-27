
public class SumOfArray {

	public static void main(String[] args) {
		int[] arr = {1,5,8,6,4,3,7,8,7,5,34,3};
		int sum = 0;
		
		for(int i = 0;i <= arr.length -1; i++ ) {
			sum += arr[i];
		}
		System.out.println("sum of array: " + sum);

	}

}
