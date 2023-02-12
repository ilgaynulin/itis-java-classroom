import java.util.Scanner;

public class MultiplierTable {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.format("%d\tx\t%d\t=\t%d\n", number, i, number * i);
		}
	}
}