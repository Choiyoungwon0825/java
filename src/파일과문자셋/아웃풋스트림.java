package 파일과문자셋;

import java.io.*;

public class 아웃풋스트림 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 입력파일 생성
		File outFile = new File("src\\파일과문자셋\\sample1.txt");
		if (!outFile.exists())
			outFile.createNewFile(); // 파일을 쓰는 경우에는 생략가능 (자동 생성)
		// #1. 1-byte 단위 쓰기
		OutputStream os1 = new FileOutputStream(outFile); // 덮어쓰기
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r'); // 13
		os1.write('\n'); // 10  코드에서는 \n만으로도 개행 가능
		os1.flush(); // FileOu
	}

}
