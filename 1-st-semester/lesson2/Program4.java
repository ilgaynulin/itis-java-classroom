import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		int dayOfWeek;

		Scanner in = new Scanner(System.in);

		System.out.print("Введите день недели: ");
		dayOfWeek = in.nextInt();

		switch(dayOfWeek) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Будни");
				break;
			case 6:
			case 7:
				System.out.println("Выходной");
			default:
				System.out.println("Вы ввели неверное число!");
		}
	}
}