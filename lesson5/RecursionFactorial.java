import java.util.Scanner;

public class RecursionFactorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("Результат: " + fact(n));
	}

	// 5
	static int fact(int n) {
		// n = 1
		// Терминальное условие, Базовый случай
		System.out.print("N =: " + n + "\n");
		if(n == 0 || n == 1) {
			return 1;
		}
		int result = fact(n - 1) * n; // fact(1) * 2
		return result;
	}
}