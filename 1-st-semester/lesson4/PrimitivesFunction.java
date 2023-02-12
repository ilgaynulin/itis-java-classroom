//import java.lang.Math;
import java.util.Scanner;

public class PrimitivesFunction {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number;
		System.out.print("Введите число: ");
		number = in.nextInt();

		// с использованием библиотечной функции
		//System.out.println(Math.pow(number, 2));
		System.out.println("С использованием собственной функции возведения в квадрат..");
		System.out.println(squared(number));

		System.out.println("Выводим нашу переменную number: ");
		System.out.println(number);

		setZero(number);
		System.out.println("Выводим нашу переменную number после вызова setZero: ");
		System.out.println(number);
	}

	// Передача аргумента по значению
	static int squared(int number) {
		number = number * number;
		return number;
	}

	// Бесмысленная функция, т.к. она не поменяет переменную которая пришла в аргумент. Т.к. передалась по значению
	static void setZero(int i) {
		i = 0;
	}
}