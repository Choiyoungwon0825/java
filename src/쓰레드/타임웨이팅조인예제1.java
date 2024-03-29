package 쓰레드;

class MyThread01 extends Thread {
	@Override
	public void run() {
		for (long i = 0; i < 1000000000L; i++) {
		} // 시간지연
	}
}

class MyThread02 extends Thread {
	MyThread01 myThread1;

	public MyThread02(MyThread01 myThread1) {
		this.myThread1 = myThread1;
	}

	@Override
	public void run() {
		try {
			myThread1.join(3000);
		} catch (InterruptedException e) {
			System.out.println(" -- join(...) 진행중 interrupt() 발생");
			for (long i = 0; i < 1000000000L; i++) {
			} // 시간지연
		}
	}
}

public class 타임웨이팅조인예제1 {
	public static void main(String[] args) {

		// #1. 객체 생성
		MyThread01 myThread1 = new MyThread01();
		MyThread02 myThread2 = new MyThread02(myThread1);
		myThread1.start();
		myThread2.start();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		} // 쓰레드 시작 준비 시간
		System.out.println("MyThread01 State = " + myThread1.getState()); // RUNNABLE
		System.out.println("MyThread02 State = " + myThread2.getState()); // TIMED_WAITING

		myThread2.interrupt();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		} // 인터럽트 준비 시간
		System.out.println("MyThread01 State = " + myThread1.getState()); // RUNNABLE
		System.out.println("MyThread02 State = " + myThread2.getState()); // RUNNABLE

	}
}