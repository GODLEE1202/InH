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
	/* - Channel : ä���� �����Ͱ� �̵��� �� �ִ� ���
	 *           - ������ IO���� Stream�� ������ �ܹ������ �޸� Channel
	 *             �� ����� ����� �����Ѵ�.
	 * - FileChannel�� ���� �޼ҵ��� open()�� ȣ���ؼ� ���� ���� ������.
	 *   IO���� ����ߴ� FileInputStream, FileOutputStream�� getChannel()
	 *   �� �̿��ؼ� �޼ҵ带 ȣ���� ���� �ִ�.
	 * - ������ IO���� getChannel�� ���� �޾ƿ� ��� ����� ��� ����
	 *   ���ܰ� �߻��Ѵ�.
	 * */
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/java/file/hhh.txt");
		// ���丮 ����
		//Files.createDirectories(path.getParent());
		
		// ���� ����
		FileChannel fileChannel = FileChannel.open(path, 
				StandardOpenOption.CREATE,
				StandardOpenOption.WRITE);
		
		// ������ �迭 ����
		String data = "�ȳ��ϼ���";
		Charset charset = Charset.defaultCharset();
		ByteBuffer bb = charset.encode(data);
		
		// ������ ����
		int byteCount = fileChannel.write(bb);
		System.out.println(byteCount);
		
		fileChannel.close();
	}
}
