package 파일과문자셋;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class 아웃풋스트림2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File outFile = new File("src\\파일과문자셋\\sample2.txt");

		OutputStream oStream = new FileOutputStream(outFile, true);

		byte[] byteArray = "널 지우려 해".getBytes();

		oStream.write(byteArray,0,17); // byte

		oStream.flush();

		System.out.println("파일작성완료");

		if (oStream != null) {
			oStream.close();
		}

	}

}
