package pkgEX;

import sec01_basicsyntax.Ex02_JavaBasicStructure.this키워드예시;

//은행 계좌 클래스 : BankAccount 클래스 
class BankAccount {
	// 필드(멤버 변수)
	// checkBalance() 함수 : 잔액조회함수
	// deposit() 함수 : 입금 함수
	// withdraw() 함수 : 출금 함수
	String name;
	double balance;

	BankAccount(String a, double b) {
		this.name = a;
		this.balance = b;
	}

	void checkBalance() {
		System.out.println("잔액은 " + this.balance + "원입니다.");
	}

	void deposit(double c) { // 입금
		balance += c;
		System.out.println(c + "원이 입금되었습니다.");

	}

	void withdraw(double d) {
		if (balance > d) {
			balance -= d;
			System.out.println(d + "원을 출금하였습니다.");
		} else if (balance < d) {
			System.out.println(d + "원은 잔액보다 많은 금액입니다.");
			System.out.println("다시 입력하세요.");
		}

	}

}

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount("홍길동", 10000);
		account1.checkBalance(); // 잔액 조회
		account1.deposit(6000); // 입금
		account1.checkBalance();// 잔액 조회
		account1.withdraw(115000); // 출금
		account1.withdraw(2300);
		account1.checkBalance();// 잔액 조회

	}

}
