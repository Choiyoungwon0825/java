package 파일과문자셋;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class 콘솔스트림 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream iStream = System.in;

		byte[] ba = new byte[9];

		int count = iStream.read(ba);

		int offset = 0;
		String str = new String(ba, offset, count, Charset.forName("MS949"));
		System.out.println);
		System.out.println(count);

	}

}
