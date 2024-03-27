package pack01;

/*멤버 및 생성자에 적용되는 네 가지 접근 지정자*/

public class A {
	public int a = 1;
	protected int b = 2;
	int c = 3;
	private int d = 4;

	public void print() { // a, b, c, d
		System.out.print(a + " "); // 가능
		System.out.print(b + " "); // 가능
		System.out.print(c + " "); // 가능
		System.out.print(d); // 가능
		System.out.println();
	}
}