import java.util.Scanner;

public class ReversedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size For Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int start = 0;
		int end = arr.length -1;
		
		for(int i = 0; i< size; i ++) {
			System.out.println("Element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for(int originalarr : arr) {
			System.out.println(originalarr);
		}

		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start ++;
			end --;
		}
		
		for(int newArray : arr) {
			System.out.println(newArray);
		}
	}

}
