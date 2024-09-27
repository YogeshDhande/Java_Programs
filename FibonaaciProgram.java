import java.util.Scanner;

public class FibonaaciProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		sc.close();
		int num1 = 0, num2 = 1;
		System.out.print("Fibonaaci : "+ num1 + ", " + num2);
		
		for(int i = 2; i< num; i++) {
			int nextNum = num1 + num2;
			System.out.print(", " + nextNum);
			num1 = num2;
			num2 = nextNum;
		}
	}

}
