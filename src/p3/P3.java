package p3;

import p1.P;

public class P3 extends p1.P {

	public static void main(String[] args) {
		P firstObj = new P();
		firstObj.a = 10;
		firstObj.b = 10;
		firstObj.c = 10; // protected
		firstObj.d = 10;
	}
}
