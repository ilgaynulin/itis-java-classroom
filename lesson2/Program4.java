import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		int dayOfWeek;

		Scanner in = new Scanner(System.in);

		System.out.print("Введите день недели: ");
		dayOfWeek = in.nextInt();

		switch(dayOfWeek) {
			case 1:
				System.out.println("Понедельник");
			case 2:
				System.out.println("Вторник");
			default:
				System.out.println("Я не знаю что это за день!");
		}
	}
}