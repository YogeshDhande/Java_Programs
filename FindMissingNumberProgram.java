
public class FindMissingNumberProgram {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6};
		int n = arr.length +1;
		int totalsum = n * (n + 1) / 2;
		
		int arraySum = 0;
		for(int i = 0; i < arr.length; i++) {
			arraySum += arr[i];
		}
		int missingNum = totalsum - arraySum;
		
		System.out.println("Missing Number : " + missingNum);

	}

}
