import java.lang.Integer;
// Рекурсивно вывести на экран числа от 1 до N

public class RecursiveFromOneToN {
	public static void main(String[] args) {
		if(args.length != 1 || Integer.parseInt(args[0]) < 0) {
			System.out.println("Введите одно положительное число!");
			return;
		}

		int number = Integer.parseInt(args[0]);
		
		printFromOneToN(number);
	}

	static void printFromOneToN(int n) {
		// базовый случай
		if(n == 1) {
			System.out.println(1);
			return;
		}
		// Рекурсивный шаг
		printFromOneToN(n-1); // 1 ... (n-1)
		System.out.println(n);
	}
}