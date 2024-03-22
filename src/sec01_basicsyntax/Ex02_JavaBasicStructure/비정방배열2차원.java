package sec01_basicsyntax.Ex02_JavaBasicStructure;

public class 비정방배열2차원 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비정방 행렬의 선언 및 값 대입방법1
		int[][] array1 = new int[2][];

//		array1[0][0] = 1;
//		array1[0][1] = 2;
//		array1[1] = new int[3];
//		array1[1][0] = 3;
//		array1[1][1] = 4;
//		array1[1][2] = 5;
//
//		System.out.println(array1[0][0] + " " + array1[0][1]);
//		System.out.println(array1[1][0] + " " + array1[1][1] + " " + array1[1][2]);
//		System.out.println();

		int[][] array2 = new int[2][];
		array2[0] = new int[] { 1, 2 };
		array2[1] = new int[] { 3, 4, 5 };
		System.out.println(array2[0][0] + " " + array2[0][1]);
		System.out.println(array2[1][0] + " " + array2[1][1] + " " + array2[1][2]);
		System.out.println();

		int[][] array4;
		array4 = new int[][] { { 1, 2 }, { 3, 4, 5 } };
		System.out.println(array4[0][0] + "" + array4[0][1]);
		System.out.println(array4[1][0] + "" + array4[1][1] + "" + array4[1][2]);
		System.out.println();

	}

}
