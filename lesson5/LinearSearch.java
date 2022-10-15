import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int[] randNumbers = new int[10];
		Random rand = new Random();

		for(int i = 0; i < randNumbers.length; i++) {
			randNumbers[i] = rand.nextInt(100);
		}
		showArray(randNumbers);

		Scanner in = new Scanner(System.in);

		System.out.print("Введите искомый элемент: ");
		int userNum = in.nextInt();

		int result = search(randNumbers, userNum);

		if(result != -1) {
			System.out.println("Элемент найден под индексом: " + result);
		} else {
			System.out.println("Элемент не найден!");
		}

	}


	// Процедура
	static void showArray(int[] a) {
		System.out.println("Выводим массив:");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println('\n');


	}

	static int search(int[] a, int element) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == element) {
				return i;
			}
		}
		return -1;
	}
}