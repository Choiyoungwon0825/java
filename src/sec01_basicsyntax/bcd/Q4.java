package sec01_basicsyntax.bcd;

import java.awt.print.Printable;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 10; i > 0; i -= 2) {
//			System.out.println(i);
//		} // 10
//		System.out.println("---for 문을 while 문으로---");
//		int i = 10;
//		while (i > 0) {
//			System.out.println(i);
//			i -= 2;
//
//		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				if(i==2) {
					continue; // i = 2일때만 중단 0, 1 , continue , 3 , 4
				}
			//	System.out.println("A"); 
			//	j = 0, i = 0 1 3 4 
			//	j = 1, 1 = 0 1 3 4
			//  두번 돌았을 때 j == 1이기 때문에 break
				if(j==1) {
					break; // j = 1일때 멈춤
				}  
			//	j = 1, 1 = 0 1 3 4
			//  두번째 돌때 j == 1이기 때문에 break
				System.out.println("A");
			}
		}

	}

}
