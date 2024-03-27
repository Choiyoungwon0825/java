package 오브젝트메소드;

class Turtle {
	int age;

	public Turtle(int a) {
		this.age = a;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "거북";
	}

	@Override
	public boolean equals(Object obj) {
		if (this.age == ((Turtle) obj).age) {
			return true;

		} else {
			return false;
		}
	}

}

public class toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Turtle t1 = new Turtle(0);
		Turtle t2 = new Turtle(3);

		System.out.println(t1);
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));
	}

}
