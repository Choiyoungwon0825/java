package sec01_basicsyntax.Ex02_JavaBasicStructure;

import java.util.Arrays;

public class 배열예제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[3];
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
		
		int[] array2;
		array2 = new int[3];
		array2[0] =5;
		array2[1] =6;
		array2[2] =7;
		System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);
		
		// 배열 값 대입 방법
		int[] array3 = new int[] {3,4,5};
		System.out.println(array3[0] + " " + array3[1] + " " + array3[2]);
		
		
		//@ 참조 자료형 배열
		String[] array4 = new String[3];
		for(int i = 0; i<3; i++) {
			System.out.println(array4[i]+", "+i);
		}
		System.out.println();
		System.out.println();
		
		// 배열을 한 번에 출력
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}

}
