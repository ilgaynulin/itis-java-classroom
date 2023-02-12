public class TwoDimArray {
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

    
  }
}