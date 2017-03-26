package clone;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] temp={1,2,3,6,3,9,15,73,9,36};
		Arrays.sort(temp);
		System.out.println(temp);
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.binarySearch(temp, 9));
	}
}
