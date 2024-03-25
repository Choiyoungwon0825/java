package sec01_basicsyntax.Ex02_JavaBasicStructure;

public class 스트링오브젝트생성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string 객체 생성1
		String str1 = new String("안녕");
		System.out.println(str1);

		// string 객체 생성2
		String str2 = new String("안녕하세여");
		System.out.println(str2);

		str2 = str1;
		str1 = "안녕하세요";
		System.out.println(str1);
		System.out.println(str2);

	}

}
