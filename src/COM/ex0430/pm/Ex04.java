package COM.ex0430.pm;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Ex04 {
	// FileChannel
	/* - Channel : 채널은 데이터가 이동할 수 있는 통로
	 *           - 기존의 IO에서 Stream의 성격인 단방향과는 달리 Channel
	 *             은 양방향 통신을 지원한다.
	 * - FileChannel은 정적 메소드인 open()을 호출해서 얻을 수도 있지만.
	 *   IO에서 사용했던 FileInputStream, FileOutputStream의 getChannel()
	 *   을 이용해서 메소드를 호출할 수도 있다.
	 * - 기존의 IO에서 getChannel을 통해 받아올 경우 양방향 통신 사용시
	 *   예외가 발생한다.
	 * */
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/java/file/hhh.txt");
		// 디렉토리 생성
		//Files.createDirectories(path.getParent());
		
		// 파일 생성
		FileChannel fileChannel = FileChannel.open(path, 
				StandardOpenOption.CREATE,
				StandardOpenOption.WRITE);
		
		// 데이터 배열 생성
		String data = "안녕하세요";
		Charset charset = Charset.defaultCharset();
		ByteBuffer bb = charset.encode(data);
		
		// 데이터 전송
		int byteCount = fileChannel.write(bb);
		System.out.println(byteCount);
		
		fileChannel.close();
	}
}
