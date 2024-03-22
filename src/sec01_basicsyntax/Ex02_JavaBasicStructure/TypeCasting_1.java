package sec01_basicsyntax.Ex02_JavaBasicStructure;

import java.security.PublicKey;

public class TypeCasting_1 {
	public static void main(String[] args) {
		
		// 캐스팅방법  1: 자료형
		int value1 = (int)5.3; //  5.3에서 5로 변경
		long value2 = (long)10;
		float value3 = (float)5.8;
		double value4 = (double)16;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println();
		
		long value5 =10L;
		long value6 =10l;
		float value7 =5.8F;
		float value8 =5.8f;
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println();
		
		
		int a = 3;
		int b = ++a;
		System.out.println(a);
		System.out.println(b);
	
		
		int a1 = 3;
		int b1 = a1++;
		System.out.println(a1);
		System.out.println(b1);
	
		
	}

}
