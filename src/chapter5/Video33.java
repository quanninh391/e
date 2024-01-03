package chapter5;

import java.util.ArrayList;

public class Video33 {
	public static void main(String[] args) {
		int a = 10;
		ArrayList<String> a1 = new ArrayList<String>(); // generic

		a1.add("Hỏi Dân IT");
		a1.add("Hỏi Dân IT2");
		a1.add("Hỏi Dân IT3");

		a1.remove(1);
		System.out.println(a1.toString() + " " + a1.get(1));
	}
}
