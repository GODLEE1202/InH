package COM.ex0430.pm;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		Path from = Paths.get("C:/java/file1/ball.jpg");
		Path to = Paths.get("C:/java/file1/ball1.jpg");
		
		FileChannel f_from = FileChannel.open(from,
				StandardOpenOption.READ);
		FileChannel f_to = FileChannel.open(to, 
				StandardOpenOption.CREATE,
				StandardOpenOption.WRITE);
		
		ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
		int byteCount;
		while(true) {
			buffer.clear();
			byteCount = f_from.read(buffer);
			if(byteCount==-1)break;
			buffer.flip();
			f_to.write(buffer);
		}
		
		f_from.close();
		f_to.close();
		System.out.println("파일 복사 성공");
	}
}



