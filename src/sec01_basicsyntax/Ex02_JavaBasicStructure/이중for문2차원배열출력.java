package sec01_basicsyntax.Ex02_JavaBasicStructure;

public class 이중for문2차원배열출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2 }, { 3, 4, 5 } };
		
		for(int i = 0; i<a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
				
			}
		}
		
		
	}

}
