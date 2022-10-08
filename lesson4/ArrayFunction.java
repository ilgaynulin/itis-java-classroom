public class ArrayFunction {
	public static void main(String[] args) {

		int array[] = { 3, 2, 4, 2, 1 };

		showArray(array);

		// Преобразование

		setElementsZero(array);

		showArray(array);
	}

	// Процедура
	static void showArray(int[] a) {
		System.out.println("Выводим массив:");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println('\n');
	}

	// Передача в аргумент по ссылке
	static void setElementsZero(int[] a) {
		System.out.println("Зануляем элементы...");
		for(int i = 0; i < a.length; i++) {
			a[i] = 0;
		}
	}
}