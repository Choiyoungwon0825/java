package sec01_basicsyntax.Ex02_JavaBasicStructure;

import java.awt.print.Printable;
import java.lang.invoke.StringConcatFactory;

public class Q8내이름은홍길동 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "내 이름은 [홍길동] 입니다. 나이는 [15]살 입니다";
		String name;
		int age;
		// indexOf()
		// lastIndexOf()
		// subString()
		int start = str.indexOf("[");
		int end = str.indexOf("]");
		
		name = str.substring(start+1, end);
	
		start = str.lastIndexOf("[");
		end = str.lastIndexOf("]");
			
		age = Integer.parseInt(str.substring(start + 1 , end));
		
		System.out.println(name);
		System.out.println(age);

	}

}
