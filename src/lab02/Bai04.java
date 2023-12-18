package lab02;

import java.util.Arrays;

public class Bai04 {
	public static void main(String[] args) {
		int[] clubs = { 15, 10, 1, 16, 3 };

		for (int i = 0; i < clubs.length - 1; i++) {
			for (int j = i + 1; j < clubs.length; j++) {
				if (clubs[i] > clubs[j]) {
					int temp = clubs[i];
					clubs[i] = clubs[j];
					clubs[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(clubs));
	}

}
