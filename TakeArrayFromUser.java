import java.util.Scanner;

public class TakeArrayFromUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size For Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0; i< size; i ++) {
			System.out.println("Element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i <= arr.length -1; i++) {
			System.out.print(arr[i]);
		}
	}

}
