import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String inputString = sc.nextLine();
		if(inputString == null || inputString.isEmpty()) {
			System.out.println("Number of words in the string: 0");
		}
		else{
			String[] countWord = inputString.split("\\s+");
			System.out.println("Number of words in the string: " + countWord.length);
		}
		
	}

}
