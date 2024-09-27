import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		sc.close();
		int fact = 1;
		
		for(int i = 1; i <= num; i++) {
		   fact =fact * i;
		}
		System.out.println(fact);
	}

}
