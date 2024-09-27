import java.util.Scanner;

public class VowelsProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		sc.close();
		
		int vowelCount = 0;
		str = str.toLowerCase();
		
		for(int i =0; i <= str.length() -1; i++ ) {
			char ch = str.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch== 'u') {
				vowelCount++;
			}
		}
		System.out.println("vowels Count :" +vowelCount);
	}

}
