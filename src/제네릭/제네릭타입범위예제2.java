package 제네릭;

class A1 {
	public <T extends Number> void method1(T t) {
		System.out.println(t.intValue());
	}
}

interface MyInterface {
	public abstract void print();
}

class B1 {
	public <T extends MyInterface> void method1(T t) {
		t.print();
	}
}

public class 제네릭타입범위예제2 {
	public static void main(String[] args) {
		A1 a = new A1();
		a.method1(5.8); // = a.<Double>method1(5.8);

		B1 b = new B1();
		b.method1(new MyInterface() {
			@Override
			public void print() {
				System.out.println("print() 구현");
			}
		});
	}
}