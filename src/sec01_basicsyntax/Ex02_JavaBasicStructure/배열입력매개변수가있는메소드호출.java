package sec01_basicsyntax.Ex02_JavaBasicStructure;

import java.util.Arrays;

public class 배열입력매개변수가있는메소드호출 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 1, 2, 3 };
		printArray(a);
		printArray(new int[] { 4, 5, 6 });

	}

	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));

	}

}
