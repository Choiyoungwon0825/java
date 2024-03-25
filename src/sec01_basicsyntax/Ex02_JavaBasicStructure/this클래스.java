package sec01_basicsyntax.Ex02_JavaBasicStructure;

// 클래스 정의
class Aㅎ {
	Aㅎ() {
		System.out.println("첫 번째 생성자");
	}

	Aㅎ(int a) {
		this(); // 반드시 생성자 첫줄에 잇어야함
		System.out.println("두 번째 생성자");
	}
}

public class this클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성
		Aㅎ aㅎ = new Aㅎ();
		System.out.println();
		Aㅎ aㅎ2 = new Aㅎ();

	}

}
