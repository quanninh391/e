package chapter6;

import java.util.ArrayList;

public class Video38 {
	public static void main(String[] args) {

		Student st1 = new Student("Hoi dan it", "1");
		Student st2 = new Student("Nguyễn Văn A", "1");
		Student st3 = new Student("Eric Pham", "1");
		Student st4 = new Student("Trần Văn Nam", "1");
		Student st5 = new Student("Nguyễn Hary Pham", "1");

		ArrayList<Student> arr = new ArrayList();
		arr.add(st5);
		arr.add(st4);
		arr.add(st3);
		arr.add(st2);
		arr.add(st1);

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("Nguyễn")) {
				System.out.println(" start with Nguyễn: " + arr.get(i));
			}
		}

		System.out.println(" >>> check arr: " + arr);

//		System.out.print("Nhập vào username: ");
//		Scanner scanner = new Scanner(System.in);
//		String username = scanner.nextLine();
//
//		System.out.print("Nhập vào password: ");
//		String password = scanner.nextLine();
//
//		System.out.println(" username = " + username + "  password = " + password);
//		if (username.equals("hoidanit") && password.length() > 6) {
//			System.out.print("Valid input");
//
//		}
//
//		scanner.close();
	}
}
