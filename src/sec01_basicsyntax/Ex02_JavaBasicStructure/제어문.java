package sec01_basicsyntax.Ex02_JavaBasicStructure;

import java.util.Iterator;

import javax.security.auth.callback.ConfirmationCallback;

public class 제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 유형 1 : if
		int value1 = 5;
		if (value1 > 3) {
			System.out.println("실행1");
		}
		if (value1 < 5) {
			System.out.println("실행2");
		}

		boolean bool1 = true;
		boolean bool2 = false;
		if (bool1) {
			System.out.println("실행3");
		}
		if (bool2) {
			System.out.println("실행3");
		}
		// 유형 2 : if - else
		int value2 = 5;
		if (value2 > 3) {
			System.out.println("실행5");
		} else {
			System.out.println("실행6");
		}

		// cf. 삼항 연산자와 변환 가능
		System.out.print((value2 > 3 ? "실행5" : "실행6"));
		System.out.println();

		// 유형 3 : if - else if-else if...else
		int value3 = 85;
		if (value3 >= 90) {
			System.out.print("A학점");
		} else if (value3 >= 80) {
			System.out.println("B학점");
		} else if (value3 >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}

		// switch 문을 이용한 점프의 예
		int a = 2;
		switch (a) {
		case 1: {
			System.out.println("A");
		}
		case 2: {
			System.out.println("B");
		}
		case 3: {
			System.out.println("C");
		}

		default:
			System.out.println("D");
		}

		int a1 = 8;
		switch (a1) {
		case 10: 
			System.out.println("10Pass");
		case 9: 
			System.out.println("9Pass");
		case 8:
			System.out.println("8Pass");
		case 7: 
			System.out.println("7Pass");
			break;
		default:
			System.out.println("Fail");
		}
		
		int i;
		for(i=0; i<3; i++) {
			System.out.println(i);
		}
		for(i=0; i<3; i++) {
			System.out.println(i);
		}
		for(i=0; i<100; i++) {
			System.out.println(i);
		}
		for(i=10; i>0; i--) {
			System.out.println(i);
		}
		for(i=0; i<10; i+=2) {
			System.out.println(i);
		}
		for(int j=0, k=0; j<10; j++,k++) {
			System.out.println(j+k);
		}
		
	}

}
