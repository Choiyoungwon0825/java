package sec01_basicsyntax.Ex02_JavaBasicStructure;

public class 클래스예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
		C c = new C();
		//메서드호출
		c.print();
		int k = c.data();
		c.data();
		System.out.println(k);
		double result =c.sum(3, 5.2);
		System.out.println(result);
		c.printMonth(5);
		c.printMonth(15);
		

	}

}

// 클래스 정의
class C{
	// 리턴타입 void, 입력매개변수 없음
	void print() {
		System.out.println("안녕");
	}
	// 리턴타입 int, 임력매개변수 없음.
	int data() {
		return 3;
	}
	// 리턴타입 double, 입력매개변수 2개
	double sum(int a, double b) {
		return a + b;
		
	}
	void printMonth(int m) {
		if(m<0||m>12) {
			System.out.println("잘못된입력");
			return;
		}
		System.out.println(m+"월입니다.");
	}
}