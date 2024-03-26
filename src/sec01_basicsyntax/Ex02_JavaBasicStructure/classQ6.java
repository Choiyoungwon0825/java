package sec01_basicsyntax.Ex02_JavaBasicStructure;

class Q6 {
	Q6(int k) {
		System.out.println("첫번째생성자");
	}

	Q6(double a, double b) {
		System.out.println("두번째생성자");
	}
}

public class classQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q6 q1 = new Q6(1);
		Q6 q2 = new Q6(2.2, 2.2);
	}

}
