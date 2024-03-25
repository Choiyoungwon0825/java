package sec01_basicsyntax.Ex02_JavaBasicStructure;

import java.awt.print.Printable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ForkJoinTask;

public class 메소드String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 수정
		// toLowerCase(), toUpperCase()
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());

		// @replace()
		System.out.println(str1.replace("Study", "공부"));

		// subString()
		System.out.println(str1.substring(0, 5));

		// spilt()
		String[] strArray = "abc/def-ghi jkl".split("/|-| ");
		System.out.println(Arrays.toString(strArray));

		// @trim()
		System.out.println("   abc   ".trim());

		System.out.println();

		// 문자열의 내용 비교
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("Java");

		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str2);

		// @equals(), equalsIgnoreCase(): 내용비교
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));

		int[] a = { 1, 2, 3, 4, 5 };

		for (int m : a) {
			System.out.println(m);

		}
		System.out.println("-------------------------");

		// int[][] b = { { 1, 3, 5 }, { 7, 9 } };
		int[][] b = new int[2][];
		b[0] = new int[] { 1, 3, 5 };
		b[1] = new int[] { 7, 9 };
		System.out.println(b[0][0] + " " + b[0][1] + " " + b[0][2]);
		System.out.println(b[1][0] + " " + b[1][1]);
		System.out.println("-----------------------------------");

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.println(b[i][j]);
			}
		}

	}

}
