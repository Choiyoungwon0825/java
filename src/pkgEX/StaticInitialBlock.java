package pkgEX;

class C {
	int a;
	static int b;
	static {
		b = 5; // 정적 필드의 초기화는 static{} 내에서 수행
		System.out.println("클래스 C가 로딩됐습니다!!");

	}

	C() {
		a = 3; // 인스턴스 필드 초기화는 일반적으로 생성자에서 수행
	}
}

public class StaticInitialBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(C.b);

		Food f1 = new Food();
		new Food();

	}

}

class Food {
	Food() {
		System.out.println("김치찌개");
	}

}