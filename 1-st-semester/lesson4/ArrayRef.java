public class ArrayRef {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4 };
		int[] b;

		System.out.println("Массив а:");
		showArray(a);
		
		System.out.println("Присваиваемв b ссылку а ");
		b = a;
		// b = cloned(a);

		System.out.println("Массив b:");
		showArray(b);

		System.out.println("Зануляем первый элемент в b");
		b[0] = 0;

		System.out.println("Массив а:");
		showArray(a);
		System.out.println("Массив b:");
		showArray(b);
	}

	// Процедура
	static void showArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println('\n');
	}

	static int[] cloneArray(int[] array) {
		int[] cloned = new int[array.length];

		for(int i = 0; i < array.length; i++) {
			cloned[i] = array[i];
		}

		return cloned;
	} 
}