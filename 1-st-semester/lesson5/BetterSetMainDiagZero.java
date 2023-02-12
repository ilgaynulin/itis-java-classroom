public class BetterSetMainDiagZero {
  public static void main(String[] args) {
    int array[][] = {
      { 1, 3, 5 },
      { 5, 8, -1},
      { 4, 2, -4}
    };

    // рисует весь массив
    for(int row = 0; row < array.length; row++) {
      // рисует текущую строку
      for(int column = 0; column < array[0].length; column++) {
        System.out.print(array[row][column] + "\t");
      }
      System.out.println();
    }
    System.out.println();
    setZeroMainDiag(array);

    // рисует весь массив
    for(int row = 0; row < array.length; row++) {
      // рисует текущую строку
      for(int column = 0; column < array[0].length; column++) {
        System.out.print(array[row][column] + "\t");
      }
      System.out.println();
    }

    // 7 8 2    0 8 2
    // 1 3 2    1 0 2
    // 2 4 1    2 4 0
    // N - количество элементов
    // O(N)
    // a - квадратная матрица
  }

  // N - элементов
  // N = MATRIX_SIZE * MATRIX_SIZE
  // O(N^1/2)
  static void setZeroMainDiag(int[][] a) {
      final int MATRIX_SIZE = a.length;

      for(int i = 0; i < MATRIX_SIZE; i++) {
        a[i][i] = 0;
      }

      /*
      for(int row = 0; row < a.length; row++) {
        for(int column = 0; column < a[row].length; column++) {
          if(row == column) {
            a[row][column] = 0;
          }
        }
      }
      */
  }
}