package sec01_basicsyntax.Ex02_JavaBasicStructure;

import org.w3c.dom.ranges.DocumentRange;

public class for랑이중for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break; // break을 만나면 for문 탈출
		}

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break; // i가 5가되면 탈출
			}
			System.out.println(i);
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 3)
					break;
			System.out.println(i + " , " + j);
		}

	}


		out: for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (j == 3)
						break out;
				System.out.println(i + " , " + j);
			}

		}
		
		for(int i =0;i<10;i++) {
			if(i==5) {
				continue; // 5일때 컨티뉴 만나서 5는 출력안함
			}
			System.out.println(i);
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3)
					continue;
			System.out.println(i + " , " + j);
		}// <- continue 가 대치하는 중괄호
			System.out.println("-----------");

			
	POS1: for (int k = 0; k < 5; k++) {
			for (int l = 0; l < 5; l++) {
				if (l == 3) {
					continue POS1;
				}
			System.out.println(k + " , " + l);
		}// < continue가 대치하는 중괄호
	}
			
			

	}


	}
}
