package sec01_basicsyntax;

public class 지역변수와필드초기와안할때 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a.m);
		System.out.println(a.n);
		a.work1();
		System.out.println("-------------");
		//클래스를 활용해 객체 생성
		AA aa = new AA();
		// 객체 활용
		aa.printFieldValue();

	}

}
class A{
	int m;
	int n;
	void work1() {
		int k;
	}
}

class AA{
	boolean m1;
	int m2;
	double m3;
	String m4;
	void printFieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	void printLocalVariable() {
		int k;
	}
}