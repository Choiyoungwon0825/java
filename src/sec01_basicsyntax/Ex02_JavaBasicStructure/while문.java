package sec01_basicsyntax.Ex02_JavaBasicStructure;

import java.util.Iterator;

import javax.swing.plaf.nimbus.AbstractRegionPainter;

public class while문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while의 기본 문법구조
		int a = 0;
		while (a < 10) {
			System.out.println(a + "");
			a++;
		}
		// for 문으로 변환

		for (int i = 0; i < 10; i++) {
			System.out.println(i + "");

		}

		int b = 10;
		while (b > 0) {
			System.out.println(b + "");
			b--;
		}
		// for 문으로 변환
		for (int j = 10; j > 0; j--) {
			System.out.println(j + "");
		}

		// while 문으로 만든 무한루프
//		while (true) {
//			System.out.println("무한루프");
//		}

		int c = 0;

		while (true) {
			if (c > 10) {
				break;
			}
			System.out.println(c + "");
			c++;
		}

	}

}
