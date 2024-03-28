package 인터페이스;

/*인터페이스와 클래스의 상속 키워드 */

interface A2 {
}

interface B2 {
}

//#1. 단일인터페이스 상속
class C2 implements A2 {
}

//#2. 다중인터페이스 상속
class D2 implements A2, B2 {
}

//#3. 클래스와 인터페이스를 한번에 상속 (extends와 implements의 순서는 변경 불가)
class E2 extends C2 implements A2, B2 {

}

public class 인터페이스예제2 {
	public static void main(String[] args) {

	}
}