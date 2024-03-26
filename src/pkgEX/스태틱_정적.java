package pkgEX;

public class 스태틱_정적 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		System.out.println(a1.m);
		
		// 정적 필드 활용 방법
		// 1. 객체 생성 없이 클래스명으로 바로 활용
		System.out.println(A.n);
		// 2. 객체를 생성한 후 활용 ( 권장 X )
		A a2 = new A();
		System.out.println(a2.n);
		

	}

}
