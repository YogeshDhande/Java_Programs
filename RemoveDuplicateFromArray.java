import java.util.Arrays;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] arr = {1,5,8,6,4,3,7,8,7,5,34,3};
		Arrays.sort(arr);
		int[] temp = new int[arr.length];
		int j = 0;
		
		for(int i = 0; i < arr.length -1; i++) {
			if(arr[i] != arr[i +1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[arr.length - 1];
		
		for(int i= 0; i < j; i++ ) {
System.out.println(temp[i]);		}

	}

}
