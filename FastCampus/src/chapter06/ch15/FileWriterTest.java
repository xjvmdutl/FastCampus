package chapter06.ch15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write('A');//문자 하나 쓰기
			char[] buf = {'B','C','D','E','F','G'};
			fw.write(buf);//buf만큼 쓴다.
			fw.write("안녕하세요, 잘 써지네요");//문자열을 파일에 쓰기
			fw.write(buf,1,2);//CD를 쓴다 buf을 1~2까지 쓴다.
			fw.write("65");//숫자를 출력할떄 문자열에 감싸서 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
