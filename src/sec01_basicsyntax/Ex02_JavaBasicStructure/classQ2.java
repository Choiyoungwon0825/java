package sec01_basicsyntax.Ex02_JavaBasicStructure;

class 문제 {
	int arraySum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
}

public class classQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		문제 문제 = new 문제();
		int[] data1 = new int[] { 1, 2, 3 };
		int[] data2 = { 1, 2, 3 };
		System.out.println(문제.arraySum(data1));
		System.out.println(문제.arraySum(data2));
		System.out.println(문제.arraySum(new int[] { 1, 2, 3 }));
		System.out.println(문제.arraySum({ 1, 2, 3 }));// 배열 선언을 해주지 않아서 ㅎㅎ 오류가 발생한다

	}

}
