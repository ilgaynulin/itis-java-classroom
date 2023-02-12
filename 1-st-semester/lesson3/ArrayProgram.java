public class ArrayProgram {
	public static void main(String [] args) {
		int numbers[] = new int[10];

		// Заполняем массив элементами
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
		}

		// Выводим на консоль
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}