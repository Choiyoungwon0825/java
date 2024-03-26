package sec01_basicsyntax.Ex02_JavaBasicStructure;

class Q7 {
	int m = 3;
	int n = 5;

	void abc(int a, int b) {
		m = this.m; // 3    
		n = n; // 5
	}
}

public class classQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q7 q1 = new Q7();
		q1.abc(7, 8);
		System.out.println(q1.m);
		System.out.println(q1.n);

	}

}
