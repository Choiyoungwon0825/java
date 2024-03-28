package 이너클래스;

/*지역이너클래스의 컴파일 이후 생성 클래스 파일*/

class A5 {
	void abc() {
		class B5 {
		}
		class C5 {
		}
	}

	void bcd() {
		class C5 {
		}
		class D5 {
		}
	}
}

public class 지역이너클래스예제2 {
	public static void main(String[] args) {

	}
}