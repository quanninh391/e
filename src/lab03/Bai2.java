package lab03;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào 1 số nguyên bất kỳ: ");
		int x = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.printf(" %d x %d = %d ", x, i, x * i);
			System.out.printf("\n");
		}
		scanner.close();
	}
}
