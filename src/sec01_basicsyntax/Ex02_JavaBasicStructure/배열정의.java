package sec01_basicsyntax.Ex02_JavaBasicStructure;

public class 배열정의 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 선언 방법 1
		int[] array1 = new int[3];
		int[] array2;
		array2 = new int[3];
		
		// 배열의 선언 방법2
		int array3[] = new int[3];
		int array4[];
		array4 = new int[3];
		
		// 다양한 배열 선언(기본 자료형 배열, 참조 자료형 배열)
		boolean[] array5 = new boolean[3];
		int[] array6 = new int[5];
		double[] array7 = new double[7];
		String[] array8 = new String[9];
		
		int a[] = new int[3];
		a[0] = 3;
		a[1] = 4;
		a[2] = 5;
				
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
	}

}
