package sec01_basicsyntax.Ex02_JavaBasicStructure;

public class 클래스내부에서메소드호출 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		
		int a = twice(3);
		System.out.println(a);
		
		double b = sum(a, 5.8);
		System.out.println(b);

	}

	public static void print() { 
		System.out.println("안녕");
		
	}
	public static int twice(int k) {
		return k * 2;
		
	}
	public static double sum(int m, double n) {
		return m + n;
		
	}
}
