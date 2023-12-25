package chapter4;

public class Video23 {

	public static void main(String[] args) {
		System.out.println("Run video 23");

		String name = "Hỏi Dân IT";

		// khai báo 1 object và gán giá trị
		Student st1 = new Student();

		st1.name = "Eric";
		st1.age = 25;

		Student st2 = new Student();

		st2.name = "Hỏi Dân it";
		st2.age = 96;

		System.out.println("student with name = " + st1.name + " and age = " + st1.age);
	}
}
