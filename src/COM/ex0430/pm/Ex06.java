package COM.ex0430.pm;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class Ex06 {
	public static void main(String[] args) {
		try {
			FileChannel fc1 = new FileInputStream(
					"C:/java/file1/ball1.jpg").getChannel();
			FileChannel fc2 = new FileOutputStream(
					"C:/java/file1/ball2.jpg").getChannel();
			//fc1.transferTo(0, fc1.size(), fc2);
			fc2.transferFrom(fc1, 0, fc1.size());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
