package sec01_basicsyntax.Ex02_JavaBasicStructure;

public class 문자열객체공유 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("안녕");
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String("안녕");

		// 스택 메모리값 비교(==)
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str1);

	}

}
