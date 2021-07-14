import java.util.Scanner;

public class Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String inputString = sc.nextLine();
		char ch[] = inputString.toCharArray();
		int countConsonant = 0;
		for(int i = 0; i< ch.length; i++) {
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				ch[i] = inputString.charAt(i);
			}
			else if(ch[i] != ' '){
				countConsonant += 1;
				ch[i] = '*';
			}
		}
		System.out.println("Number of consonants in the string: " + countConsonant);
		System.out.println(new String(ch));
	}

}
