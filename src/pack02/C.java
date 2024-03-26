package pack02;

import pack01.*;

public class C {
	public void print() {
		A a = new A();
		B b = new B();

		System.out.print(a.a);
//		System.out.println(a.b); 다른 패키지에선 public만 접근가능
//		System.out.println(a.c);
//		System.out.println(a.d);
//		System.out.println("---------");
		b.print();

	}

}
