package 상속;

import java.util.concurrent.TimeUnit;

/*클래스의 상속과 사용가능한 멤버*/

class Human {
	String name;
	int age;

	void eat() {
		System.out.println(name + "이(가) 먹는다");
	}

	void sleep() {
		System.out.println(name + "이(가) 잔다");
	}
}

class Student extends Human {
	int studentID;

	void goToSchool() {
		System.out.println(studentID + " 학교가기");
	}
}

class Worker extends Human {
	int workerID;

	void goToWork() {
		System.out.println(workerID + " 출근하기");
	}
}

public class Inheritance_상속 {
	public static void main(String[] args) {
		// #1. Human 객체 생성
		
		
		Human h = new Human();
		h.name = "김현지";
		h.age = 11;
		h.eat();
		h.sleep();

		// #2. Student 객체 생성
		Student s = new Student();
		s.name = "김민성";
		s.age = 16;
		s.studentID = 128;
		s.eat();
		s.sleep();
		s.goToSchool();

		// #3. Worker 객체 생성
		Worker w = new Worker();
		w.name = "봉윤정";
		w.age = 45;
		w.workerID = 128;
		w.eat();
		w.sleep();
		w.goToWork();

	}
}
