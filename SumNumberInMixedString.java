
import java.util.Scanner;

public class SumNumberInMixedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with numbers: ");
        String str = sc.nextLine();  // Taking input as a string

        int sum = 0;
        String temp = "";

        // Loop through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the character is a digit, accumulate it in the temp string
            if (Character.isDigit(ch)) {
                temp += ch;
            } else {
                // If the temp string has numbers, convert to integer and add to sum
                if (!temp.equals("")) {
                    sum += Integer.parseInt(temp);
                    temp = "";  // Reset temp for the next number
                }
            }
        }
        // If the string ends with a number, add it to the sum
        if (!temp.equals("")) {
            sum += Integer.parseInt(temp);
        }

        System.out.println("Sum of numbers in the string: " + sum);
    }
}

