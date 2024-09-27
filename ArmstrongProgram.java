import java.util.Scanner;

public class ArmstrongProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		sc.close();
		int originalNum, remainder, result = 0;

		originalNum = num;
		while(originalNum != 0) {
			remainder = originalNum % 10;
			result += Math.pow(remainder, 3);
			originalNum /= 10;
		}
		if(result == num) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
	}

}
