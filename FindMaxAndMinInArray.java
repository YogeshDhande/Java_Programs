
public class FindMaxAndMinInArray {

	public static void main(String[] args) {
		int[] arr = {1,5,8,6,4,3,7,8,7,5,34,3};
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i < arr.length -1 ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}

}
