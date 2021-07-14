import java.util.Scanner;

public class Palindrome {
	static void stringReverse(String str) {
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String inputString = sc.nextLine();
		stringReverse(inputString);
		boolean isPalindrome = true;
		for(int i=0, j=inputString.length()-1; i<=j; i++, j--) {
			if(inputString.charAt(i) != inputString.charAt(j)) {
				isPalindrome = false;
				System.out.println("\nString is not a Palindrome.");
				break;
			}
			else continue;
		}
		if(isPalindrome) {
			System.out.println("\nString is a Palindrome.");
		}
	}

}
