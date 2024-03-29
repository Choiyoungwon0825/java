package 쓰레드;

class Q1 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(i + "초");
			if (i == 5) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println("기무링");
				}
				System.out.println("종료");
			}
		}
	}
}

public class 쓰레드문제1 {
	public static void main(String[] args) {
		Q1 q1 = new Q1();
		q1.run();

	}

}
