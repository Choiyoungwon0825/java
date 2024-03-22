package sec01_basicsyntax.bcd;

import java.awt.print.Printable;
import java.util.Iterator;

public class Q6Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q6 레이블을 사용하지 않고 i =3, j =2일때 이중 for문을 탈출하는 코드
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 3 && j == 2) {
					i = 100;
					System.out.println("i : " + i + ", j : " + j + "탈 출");
					break;
				}
				System.out.println(i + "," + j);
			}

		}
		System.out.println("--------------------");
		// 레이블을 사용하여 i =3, j =2일때 이중 for문을 탈출하는 코드
		out: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 3 && j == 2) {
					System.out.println("i : " + i + ", j : " + j + "탈 출");
					break out;
				}
				System.out.println(i + "," + j);

			}

		}
	}

}
