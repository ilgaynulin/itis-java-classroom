import java.util.Scanner;

public class SquareStar {

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите сторону квадрата: ");
		int squareSide = in.nextInt();
		for(int i = 0; i < squareSide; i++) {
			for(int j = 0; j < squareSide; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}

}