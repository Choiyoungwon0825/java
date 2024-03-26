package sec01_basicsyntax.Ex02_JavaBasicStructure;

import java.awt.print.Printable;
import java.util.function.Function;

import javax.print.attribute.IntegerSyntax;

public class classQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for문 for문 = new for문();

		System.out.println("for문");
		for문.averageScore(1, 2, 3, 4);

		forEach문 forEach문 = new forEach문();

		System.out.println();
		System.out.println("forEach문");
		forEach문.averageScore(1, 2, 3, 4);

	}

}

class for문 {
	void averageScore(int... a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];

		}
		System.out.println("--------------------");
		System.out.println("점수 총 값 : " + sum);
		System.out.println("점수 총 갯수 : " + a.length);
		double avg = sum / a.length;
		System.out.println(avg);

	}
}

class forEach문 {
	void averageScore(int... b) {
		double sum = 0;
		for (int i : b) {
			sum += i;
		}
		System.out.println("--------------------");
		System.out.println("점수 총 값 : " + sum);
		System.out.println("점수 총 갯수 : " + b.length);
		double avg = sum / b.length;
		System.out.println(avg);

	}

}
