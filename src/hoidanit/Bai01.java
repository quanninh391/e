package hoidanit;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		byte a = 100;
		short b = 1000;
		long c = 50000L;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		String name = scanner.nextLine();

		System.out.println("Nhập điểm: ");
		int score = scanner.nextInt();

		System.out.println(name + " có điểm = " + score);

		scanner.close();
	}
}
