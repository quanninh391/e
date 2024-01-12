package chapter6;

public class SinhVienIT extends SinhVien {
	private String language;

	public void getMoney() {
		System.out.println(" run get money");
		this.info();
	}

	public void info() {
		System.out.println(" run info from sinhvienIT");
	}
}
