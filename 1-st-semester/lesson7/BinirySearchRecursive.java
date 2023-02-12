public class BinirySearchRecursive {
	public static void main(String[] args) {
		int sortedArray[] = { -1, 0, 1, 3, 6};

		System.out.println(binarySearch(sortedArray, 3, 0, sortedArray.length - 1));
	}

	static int binarySearch(int[] a, int el, int begin, int end) {
		System.out.println("begin = " + begin + ", " + "end = " + end);
		// Базовый случай
		if(begin == end) {
			if(a[begin] == el) {
				return begin;
			} else {
				return -1;
			}
		}

		int middle = (end + begin) / 2; // (4 - 3) / 2 = 1/2 = 0

		int leftResult = binarySearch(a, el, begin, middle);
		if(leftResult != -1) {
			return leftResult;
		} 

		int rightResult = binarySearch(a, el, middle + 1, end);
		if(rightResult != -1) {
			return rightResult;
		} else {
			return -1;
		}
	}
}