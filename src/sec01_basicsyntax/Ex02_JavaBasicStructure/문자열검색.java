package sec01_basicsyntax.Ex02_JavaBasicStructure;

import java.util.Arrays;

public class 문자열검색 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println();

		// 문자열 검색
		// @charAt()
		System.out.println(str1.charAt(1));
		System.out.println(str2.charAt(1));
		System.out.println();

		// @indexOf(), lastIndexOf()
		System.out.println(str1.indexOf('a')); // 앞에서부터 첫번째 a가 위치한 인덱스
		System.out.println(str1.lastIndexOf('a'));// 뒤에서부터 첫번째 a가 위치한 인덱스
		System.out.println(str1.indexOf('a', 8));
		System.out.println(str1.lastIndexOf('a', 8));
		System.out.println(str1.indexOf("Java"));
		System.out.println(str1.lastIndexOf("Java"));
		System.out.println(str2.indexOf("하세요"));
		System.out.println(str2.lastIndexOf("하세요"));
		System.out.println(str1.indexOf("Bye")); // 해당하는 문자열이 없는 경우 -1 리턴
		System.out.println(str2.lastIndexOf("고맙습니다."));

		// 문자열 변환 및 연결
		// @String.valueOf(기본 자료형): 기본자료형 -> 문자열 반환
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);

		// @concat():문자열 연결
		String str5 = str3.concat(str4);
		System.out.println(str5);

		// String.valueOf() + concat()
		String str6 = "안녕" + 3;
		String str7 = "안녕".concat(String.valueOf(3));

		// 문자열을 byte[]또는 char[]로 변환
		String str8 = "Hello Java!";
		String str9 = "안녕하세요";

		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

		// @toCharArray(): 문자열 -> char[] 변환
		char[] array3 = str8.toCharArray();
		char[] array4 = str9.toCharArray();
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));

	}

}
