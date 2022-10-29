public class ForEachArray {
	public static void main(String[] args) {
		int oneDimArray[] = {1, 4, 6, 2};

		for(int el : oneDimArray) {
			System.out.print(el + "\t");
		}

		System.out.println();

		int[][] stepArray = {
			{ 1, 3, 5 },
			{ 2 },
			{ 6, 4, 2, 3, 4}
		};

		for(int[] row : stepArray) {
			for(int el : row) {
				System.out.print(el + "\t");
			}
			System.out.println();
		}
	}
}