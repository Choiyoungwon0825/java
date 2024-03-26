package pkgEX;

import sec01_basicsyntax.Ex02_JavaBasicStructure.this키워드예시;

// 클래스 정의: Person 클래스
class Person {
	String name;
	int age;

	Person(String a, int b) {
		this.name = a;
		this.age = b;
	}

	void introduce() {
		System.out.println("안녕하세요 제 이름은 " + this.name + "이고" + " 나이는 " + this.age + "살 입니다");
		System.out.println(String.format("안녕하세요. 제 이름은 %s이고, 나이는 %d입니다.", this.name, this.age 	));
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("영희", 15);
		Person person2 = new Person("철수", 17);

		person1.introduce();
		person2.introduce();

	}

}
