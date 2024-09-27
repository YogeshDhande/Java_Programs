
public class ArrayContainsElement {

	public static void main(String[] args) {
		int[] arr = {1,5,8,6,4,3,7,8,7,5,34,3};
		int findelem = 7;
		boolean contains = false;
		
		for(int i = 0; i < arr.length -1; i++) {
			if(findelem == arr[i]) {
				contains = true;
				break;
			}
		}
		if(contains) {
			System.out.println("Present");
		}else {
			System.out.println("Not Present");
		}

	}

}
