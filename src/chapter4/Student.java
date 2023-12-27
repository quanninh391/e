package chapter4;

public class Student {

	// class attributes
	String name;
	int age;

	public Student() {

	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// class method
	void learnJava() {
		System.out.println("Learn Java with Youtube Hỏi Dân IT");
	}

	String getAge() {
		return "Hỏi Dân IT";
	}

}
