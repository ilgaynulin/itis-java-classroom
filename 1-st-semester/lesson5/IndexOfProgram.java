import java.util.Scanner;

public class IndexOfProgram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String userInput = in.nextLine();
		System.out.print(userInput);
		
		// + 
		System.out.print("Символ + встречается в индексе: " + userInput.indexOf("+"));
	}

}