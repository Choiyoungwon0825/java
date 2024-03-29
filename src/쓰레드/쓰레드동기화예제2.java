package 쓰레드;

//# 공유객체
class MyData1 {
	int data = 3;

	public synchronized void plusData() {
		int mydata = data; // 데이터를 가져오기
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		data = mydata + 1;
	}
}

//#공유객체를 사용하는 쓰레드 
class PlusThread1 extends Thread {
	MyData1 myData;

	public PlusThread1(MyData1 myData) {
		this.myData = myData;
	}

	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "실행결과 : " + myData.data);
	}
}

public class 쓰레드동기화예제2 { // SynchronizedMethod
	public static void main(String[] args) {
		// #공유객체 생성
		MyData1 myData = new MyData1();

		// #1. plusThread 1
		Thread plusThread1 = new PlusThread1(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		// #2. plusThread 2
		Thread plusThread2 = new PlusThread1(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}
}