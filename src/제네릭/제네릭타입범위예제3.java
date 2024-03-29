package 제네릭;

class AA {
}

class BB extends AA {
}

class CC extends BB {
}

class DD extends CC {
}

class Goodss<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}

class Testt {
	void method1(Goodss<AA> g) {
	} // case1

	void method2(Goodss<?> g) {
	} // case2

	void method3(Goodss<? extends BB> g) {
	} // case3

	void method4(Goodss<? super BB> g) {
	} // case4
}

public class 제네릭타입범위예제3 {
	public static void main(String[] args) {
		Testt t = new Testt();

		// #1. case1
		t.method1(new Goodss<AA>());
//		t.method1(new Goods<B>());
//		t.method1(new Goods<C>());
//		t.method1(new Goods<D>());

		// #2. case2
		t.method2(new Goodss<AA>());
		t.method2(new Goodss<BB>());
		t.method2(new Goodss<CC>());
		t.method2(new Goodss<DD>());

		// #3. case3
//		t.method3(new Goods<A>());
		t.method3(new Goodss<BB>());
		t.method3(new Goodss<CC>());
		t.method3(new Goodss<DD>());

		// #4. case4
		t.method4(new Goodss<AA>());
		t.method4(new Goodss<BB>());
//		t.method4(new Goods<C>());
//		t.method4(new Goods<D>());		
	}
}
