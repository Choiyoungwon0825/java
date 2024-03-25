package sec01_basicsyntax.Ex02_JavaBasicStructure;

import java.util.Arrays;

class A3 {
	void abc(int m) {
		m = 8;
	}

	void bcd(int[] n) {
		n[0] = 4;
		n[1] = 5;
		n[2] = 6;
	}
}

public class classQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 a = new A3();

		int m = 5;
		int[] n = { 1, 2, 3 };

		a.abc(m);
		a.bcd(n);

		System.out.println(m);
		System.out.println(Arrays.toString(n));
		System.out.println();

	}

}