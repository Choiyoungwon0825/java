package sec01_basicsyntax.Ex02_JavaBasicStructure;

import java.util.Scanner;

public class 문자열과문자열합연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "안녕" + "하세요" + "!";
		System.out.println(str1);
		String str2 = "반갑";
		str2 += "습니다";
		str2 += "!";
		System.out.println(str2);
		System.out.println("----------");
		System.out.println(1 + "안녕");
		System.out.println(1 + "안녕" + 2);
		System.out.println("안녕" + 1 + 2);
		System.out.println(1 + 2 + "안녕");
		
	}

}
