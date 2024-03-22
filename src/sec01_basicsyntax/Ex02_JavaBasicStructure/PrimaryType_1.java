package sec01_basicsyntax.Ex02_JavaBasicStructure;

public class PrimaryType_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool1 =true;
		boolean bool2 =false;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println();
		
		byte value1 =10;
		short value2 =-10;
		int value3 = 100;
		long value4 = -100L; // <- long 자료형으로 인식
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		// 실수 (float), double(): 음의 실수 / 0 양의실수
		float value5 =1.2F; // float 자료형으로 인식
		double value6 = 1.5;
		double value7 = 5;
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		

	}

}
