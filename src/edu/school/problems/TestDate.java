package edu.school.problems;

public class TestDate {

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(0, 0, 13, 14, 10, 2020);
		Date d3 = new Date();
		
		System.out.println("d1 = " + d1.toString());
		System.out.println("d2 = " + d2.toString());
		
		int comparison = d3.compareTo(d1);
		System.out.println(comparison);
		
		d3.setSeconds(20);
		d3.setMinutes(3);
		d3.setHour(20);
		d3.setMonth(3);
		d3.setDay(20, 3);
		d3.setYear(2020);
		
		System.out.println("d3 = " + d3.toString());
		
		int dayYear = d3.dayInTheYear();
		System.out.println(dayYear);
		
		int weekYear = d2.weekInTheYear();
		System.out.println(weekYear);

	}

}
