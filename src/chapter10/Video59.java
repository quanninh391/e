package chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Video59 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {

			// relative path . .. //linux
//			in = new FileInputStream("./src/chapter10/input.txt");

			// absolute path
			in = new FileInputStream(
					"C:/Users/ADMIN/Documents/workspace-spring-tool-suite-4-4.21.0.RELEASE/hoidanit/src/chapter10/input.txt");

			out = new FileOutputStream("outagain.txt");
			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
			System.out.println("END");
		}
	}
}
