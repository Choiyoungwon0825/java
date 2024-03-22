package sec01_basicsyntax.bcd;

import java.text.BreakIterator;

public class A {
	// 1개의 소스파일(.java) 에는 최대 한개의 public class만 선언할 수 있다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(7 << 2);
//		System.out.println(7 >> 2);
//		System.out.println(-7 << 2);
//		System.out.println(-7 >> 2);
//		System.out.println(-1 >>> 30);
//
//		int a = 3;
//		int b = 5;
//		int c = 7;
//		System.out.println((a > b) ? (b < c) ? "타입A" : "타입B" : (b > c) ? "타입C" : "타입D");
//		int score =72;
//		
//		if(score >= 80) {
//			System.out.println("B학점입니다.");
//		}else if (score >= 90){ 
//			System.out.println("A학점");			
//		}else if (score >= 70){
//			System.out.println("C학점");
//		}else{
//			System.out.println("F학점");
//		}           
		for (int i = 0;; i++) {
			if (i > 10 ) {
				break;
			} else if (i % 2 == 1) {
				continue;
			}
			// break과 continue를 이용해 for문 코드 완성

			System.out.println(i); // 0,2,4,6,8,10
		}
	}

}

class B {

}

class C {
	class D {

	}

}
