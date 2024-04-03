package 큐스택;

import java.util.LinkedList;
import java.util.Queue;

public class 큐q10 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("땡큐");// 땡큐
		queue.offer("베리");// 베리
		queue.offer("감사");// 감사
		queue.poll();// 베리빠짐
		queue.offer("방가");// 감사

		System.out.println(queue.peek());// 베리
		System.out.println(queue.poll());// 베리
		System.out.println(queue.poll());// 감사
		System.out.println(queue.poll());// 방가

	}

}