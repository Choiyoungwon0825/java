package sec01_basicsyntax.Ex02_JavaBasicStructure;

public class 배열2차원예제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1 = new int[2][3];
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[0][2] = 3;
		array1[1][0] = 4;
		array1[1][1] = 5;
		array1[1][2] = 6;

		System.out.println(array1[0][0] + " " + array1[0][1] + " " + array1[0][2]);
		System.out.println(array1[0][0] + " " + array1[0][1] + " " + array1[0][2]);
		System.out.println();

		int[][] array2 = new int[2][3];
		array2[0][0] = 1;
		array2[0][1] = 2;
		array2[0][2] = 3;
		array2[1][0] = 4;
		array2[1][1] = 5;
		array2[1][2] = 6;

		System.out.println(array2[0][0] + " " + array2[0][1] + " " + array2[0][2]);
		System.out.println(array2[0][0] + " " + array2[0][1] + " " + array2[0][2]);
		System.out.println();

	}

}
