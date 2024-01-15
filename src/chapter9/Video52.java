package chapter9;

import java.util.Scanner;

public class Video52 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print(" Nhập x = ");
			try {
				int x = scanner.nextInt();
				try {

					System.out.println(" kết quả 10/x = " + 10 / x);
					break;
				} catch (Exception e) {
					System.out.println(" run x = " + x);
					// TODO: handle exception
				}
			} catch (Exception e) {
				scanner.next();
				System.out.println(" run error ");

			}

		}

	}
}
