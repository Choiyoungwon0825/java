package sec01_basicsyntax.Ex02_JavaBasicStructure;

public class for_each문이용한2차원배열 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2 }, { 3, 4, 5 } };

		for (int[] m : a)
			for (int n : m) {
				System.out.println(n);

			}
	}
}
