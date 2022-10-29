public class StepArray {
	public static void main(String[] args) {
		int[][] stepArray = {
			{ 1, 3, 5 },
			{ 2 },
			{ 6, 4, 2, 3, 4}
		};

		for(int row = 0; row < stepArray.length; row++) {
			for(int column = 0; column < stepArray[row].length; column++) {
				System.out.print(stepArray[row][column] + "\t");
			}
			System.out.println();
		}
	}
}