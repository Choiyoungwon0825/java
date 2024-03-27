import pack01.*;
import pack02.*;
import sec01_basicsyntax.Ex02_JavaBasicStructure.this키워드예시;

public class AccessModifierOfMember {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();

		a.print();
		b.print();
		c.print();
		d.print();
	}

}

class Person {
	String name;
	int cm;
	int kg;

	public Person(String name, int cm, int kg) {
		this.name = name;
		this.cm = cm;
		this.kg = kg;
	}
}