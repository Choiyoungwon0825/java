package 타입캐스팅;

/*캐스팅의 가능여부를 확인할 수 있는 instanceof*/

class A3 {
}

class B3 extends A3 {
}

public class 타입캐스팅_3 {
	public static void main(String[] args) {
		// #1. instanceof
		A3 aa = new A3();
		A3 ab = new B3();

		System.out.println(aa instanceof A3); // true
		System.out.println(ab instanceof A3); // true

		System.out.println(aa instanceof B3); // false
		System.out.println(ab instanceof B3); // true

		if (aa instanceof B3) {
			B3 b = (B3) aa;
			System.out.println("aa를 B로 캐스팅하였습니다.");
		} else {
			System.out.println("aa는 B 타입으로 캐스팅이 불가!!!");
		}
		if (ab instanceof B3) {
			B3 b = (B3) ab;
			System.out.println("ab를 B로 캐스팅하였습니다.");
		} else {
			System.out.println("ab는 B 타입으로 캐스팅이 불가!!!");
		}
		if ("안녕" instanceof String) {
			System.out.println("\"안녕\"은 String 클래스입니다");
		}
	}
}
