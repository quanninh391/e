package chapter5;

import java.util.ArrayList;

import chapter4.Student;

public class Video33 {
	public static void main(String[] args) {
		int a = 10;
		ArrayList a2 = new ArrayList(); //

		ArrayList<String> a1 = new ArrayList(); // generic
		ArrayList<Student> a3 = new ArrayList<Student>(); // generic
//		a1.add(2);
		a1.add("Hỏi Dân IT");
		a1.add("Hỏi Dân IT2");
		a1.add("Hỏi Dân IT3");

		a1.remove(1);
		System.out.println(a1.toString() + " " + a1.get(1));
	}
}
