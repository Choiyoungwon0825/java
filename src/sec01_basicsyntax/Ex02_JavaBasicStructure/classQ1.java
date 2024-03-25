package sec01_basicsyntax.Ex02_JavaBasicStructure;

class Ao {
	boolean a;
	int b;
	double c;
	String d;

	void abc() {
		System.out.println(b + c);
		System.out.println(c + d);
		System.out.println(d + a);
	}
}

public class classQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ao ao = new Ao();
		System.out.println(ao.a);
		System.out.println(ao.b);
		System.out.println(ao.c);
		System.out.println(ao.d);
		System.out.println("------------");

		ao.abc();

	}

}
