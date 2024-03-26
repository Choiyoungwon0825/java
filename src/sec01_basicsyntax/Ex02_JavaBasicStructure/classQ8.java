package sec01_basicsyntax.Ex02_JavaBasicStructure;

class Q8 {
	int a, b, c, d;

	Q8() {
		this(5);
	}

	Q8(int k) {
		a = k;
		b = k;
		c = k;
		d = k;

	}
}

public class classQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q8 q1 = new Q8();
		System.out.println(q1.a);
		System.out.println(q1.b);
		System.out.println(q1.c);
		System.out.println(q1.d);
	}

}
