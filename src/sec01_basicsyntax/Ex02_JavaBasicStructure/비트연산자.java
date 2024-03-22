package sec01_basicsyntax.Ex02_JavaBasicStructure;

public class 비트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// @AND 비트 연산자
		System.out.println(3 & 10);
		System.out.println(0b0011 & 0b1010);
		System.out.println(0x03 & 0x0A);
		System.out.println();
		
		// @OR 비트 연산자
		System.out.println(3 | 10);
		System.out.println(0b0011 | 0b1010);
		System.out.println(0x03 | 0x0A);
		System.out.println();
		
		// @XOR 비트 연산자
		System.out.println(3 ^ 10);
		System.out.println(0b0011 ^ 0b1010);
		System.out.println(0x03 ^ 0x0A);
		System.out.println();
		
		// @NOT 비트 연산자
		System.out.println(~3);
		System.out.println(~0b0011);
		System.out.println(~0x03);
		System.out.println();

	}

}
