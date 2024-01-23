package chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Video402 {
	public static void main(String[] args) {
		System.out.println("Run video 40.2");

		Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
		Matcher matcher = pattern.matcher("eric@efasdfasdf.vn");
		System.out.println("Input String matches regex - " + matcher.matches());
	}
}
