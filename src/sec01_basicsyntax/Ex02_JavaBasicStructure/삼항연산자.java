package sec01_basicsyntax.Ex02_JavaBasicStructure;

public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 삼항연산자
		int value1 = (3 > 5) ? 6 : 9;
		System.out.println(value1);

		int value2 = (5 > 3) ? 10 : 20;
		System.out.println(value2);

		int value3 = 3;
		System.out.println((value3 % 2 == 0) ? "짝수" : "홀수");

		// cf. if-else 구문으로 변환
		if (value3 % 2 == 0) {
			System.out.println("짝수");

		} else {
			System.out.println("홀수");
		}

	}

}
//
// AND
// 양쪽이 참이여야 트루
// OR
// 한쪽만 참이여도 트루
// XOR
// 다를때에만 트루, 같으면 폴스
// NOT 
//반대로 바꾸기 
