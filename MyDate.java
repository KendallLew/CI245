package Cis245_Java2;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate() {
		this.year = 2026;
		this.month = 1;
		this.day = 1;
	}
	@Override
	public String toString() {
		return month + "/" + day "/" + year;
		
	}

}
