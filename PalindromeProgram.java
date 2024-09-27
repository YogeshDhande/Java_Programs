import java.util.Scanner;

public class PalindromeProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		String str = sc.nextLine();
		sc.close();
		
		String reversedString = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			reversedString += str.charAt(i);
		}

		if(str.equalsIgnoreCase(reversedString)) {
			System.out.println("Is Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
