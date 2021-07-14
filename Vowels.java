import java.util.Scanner; 
public class Vowels {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String inputString = sc.nextLine();
		int countVowel = 0;
		for(int i = 0; i< inputString.length(); i++) {
			if(inputString.charAt(i) == 'a' || inputString.charAt(i) == 'e' || inputString.charAt(i) == 'i' || inputString.charAt(i) == 'o' || inputString.charAt(i)== 'u' 
					|| inputString.charAt(i) == 'A' || inputString.charAt(i) == 'E' || inputString.charAt(i) == 'I' || inputString.charAt(i) == 'O' || inputString.charAt(i)== 'U') {
				countVowel += 1;
			}
			else continue;
		}
		System.out.println("Number of vowels in the string: " + countVowel);
	}

}
