package sec01_basicsyntax.Ex01_JavaBasicStructure;

public class 변수의생존기간 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value =3;
		{
			int value2 =5;
			System.out.println(value);
			System.out.println(value2);
		}
		System.out.println(value);
//		System.out.println(value2); // 오류

	}

}