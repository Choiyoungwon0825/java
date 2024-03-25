package sec01_basicsyntax.Ex02_JavaBasicStructure;

import java.awt.print.Printable;
import java.util.Arrays;

public class 기본자료형입력매개변숫값의변화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int result1 = twice(3);
		System.out.println(result1);
		int result2 = twice(a);
		System.out.println(result2);
		System.out.println(a);

		// ----------------------

		int[] array = new int[] { 1, 2, 3, 99, 100 };
		modifyData(array);
		printArray(array);

	}

	public static int twice(int a) {
		a = a * 2;
		return a;
	}

	public static void modifyData(int[] a) {
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;

	}

	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));

	}
}
