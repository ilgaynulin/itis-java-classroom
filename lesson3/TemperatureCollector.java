import java.util.Scanner;

public class TemperatureCollector {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		double measurements[];
		
		System.out.print("Введите сколько значений вы хотите добавить: ");
		int arrayDimmention = in.nextInt();

		measurements = new double[arrayDimmention];

		System.out.println("Вводите значения температуры!");

		for(int i = 0; i < measurements.length; i++) {
			System.out.print("Введите элемент номер " + i + ":");
			measurements[i] = in.nextDouble();
		}

		System.out.println("Выводим на консоль записанные значения");
		// Выводим на консоль
		for(int i = 0; i < measurements.length; i++) {
			System.out.println(measurements[i]);
		}

		
	}
}