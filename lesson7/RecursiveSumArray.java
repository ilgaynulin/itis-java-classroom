public class RecursiveSumArray {
	public static void main(String args[]) {
		int[] a = { 2, 3, 6, 1, 0, 2};
		System.out.println(sum(a, a.length - 1));

	}

	static int sum(int a[], int n) {
		// Базовый случай
		if(n == 0) {
			return a[0];
		}
		// Рекурсивный шаг
		return a[n] + sum(a, n-1);
	} 
}