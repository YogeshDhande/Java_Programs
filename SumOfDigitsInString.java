import java.util.Scanner;

public class SumOfDigitsInString {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string with numbers: ");
	        String str = sc.nextLine();  // Taking input as a string

	        int sum = 0;

	        // Loop through each character in the input string
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // Check if the character is a digit
	            if (Character.isDigit(ch)) {
	                sum += Character.getNumericValue(ch);  // Convert char to int and add to sum
	            }
	        }

	        System.out.println("Sum of digits in the string: " + sum);
	    }
	}

