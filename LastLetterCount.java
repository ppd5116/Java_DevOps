
import java.util.Scanner;

public class LastLetterCount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String inputString = sc.nextLine();
		int count_s = 0, count_y = 0;
		String words[] = inputString.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith("s")) {
                count_s++;
                words[i] = words[i].substring(0, words[i].length()-1) + "y";
            }
            else if(words[i].endsWith("y")) {
            	count_y++;
            	words[i] = words[i].substring(0, words[i].length()-1) + "s";
            }
            else continue;
        }
        System.out.println("Number of words ending in s: " + (count_s));
		System.out.println("Number of words ending in y: " + (count_y));
		for(int i=0; i<words.length; i++) {
			System.out.print(words[i] + " ");
		}
	}
}
