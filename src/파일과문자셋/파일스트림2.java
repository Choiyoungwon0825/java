package 파일과문자셋;

import java.io.*;
import java.nio.charset.Charset;

public class 파일스트림2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// #2-2. n-byte 단위 읽기 (byte[]의 처음 위치에서 부터 읽은 데이터 저장)
		byte[] byteArray1 = new byte[9];
		File inFile = new File("src\\파일과문자셋\\sample.txt");
		InputStream is2 = new FileInputStream(inFile);
		int count1;
		while ((count1 = is2.read(byteArray1)) != -1) {
			String str = new String(byteArray1, 0, count1, Charset.forName("UTF-8"));
			System.out.print(str);
			System.out.println(" : count = " + count1);
		}
		System.out.println();
		System.out.println();
	}

}
